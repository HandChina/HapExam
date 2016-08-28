/*
 * #{copyright}#
 */


package exam.sales.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hand.hap.core.IRequest;
import com.hand.hap.core.exception.BaseException;
import com.hand.hap.system.controllers.BaseController;
import com.hand.hap.system.dto.ResponseData;

import exam.sales.dto.OrderLine;
import exam.sales.service.IOrderLineService;




/**
 * 销售管理.
 * 
 * @author fei.tang@hand-china.com
 */
@Controller
public class OrderLineController extends BaseController {
 
	@Autowired
	private IOrderLineService orderLineService;
    
    /**
     * 任务分配查询.
     * 
     * @param orderLine
     *            分配对象
     * @param page
     *            起始页
     * @param pagesize
     *            分页大小
     * @param request
     *            HttpServletRequest
     * @return ResponseData
     */
    @RequestMapping(value = "/sales/orderLine/query")
    @ResponseBody
    public ResponseData getOrders(OrderLine orderLine, @RequestParam(defaultValue = DEFAULT_PAGE) int page,
            @RequestParam(defaultValue = DEFAULT_PAGE_SIZE) int pagesize, HttpServletRequest request) {
        IRequest requestContext = createRequestContext(request);
        System.out.println("====================controllers===========");
        
        return new ResponseData(orderLineService.selectByOrderLine(requestContext, orderLine, page, pagesize));
       
    }
    
}
