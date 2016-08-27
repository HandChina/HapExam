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

import exam.sales.dto.OrderHeader;
import exam.sales.dto.SysCode;
import exam.sales.service.IOrderHeaderService;

/**
 * 销售管理.
 * 
 * @author fei.tang@hand-china.com
 */
@Controller
public class OrderHeaderController extends BaseController {
 
	@Autowired
	private IOrderHeaderService orderHeaderService;
    
    /**
     * 订单查询.
     * 
     * @param order
     *            分配对象
     * @param page
     *            起始页
     * @param pagesize
     *            分页大小
     * @param request
     *            HttpServletRequest
     * @return ResponseData
     */
    @RequestMapping(value = "/sales/orderHeader/query")
    @ResponseBody
    public ResponseData getOrders(OrderHeader order, @RequestParam(defaultValue = DEFAULT_PAGE) int page,
            @RequestParam(defaultValue = DEFAULT_PAGE_SIZE) int pagesize, HttpServletRequest request) {
        IRequest requestContext = createRequestContext(request);
        System.out.println("====================controllers==========="+order.getOrderNumber());
        
        return new ResponseData(orderHeaderService.selectByOrderHeader(requestContext, order, page, pagesize));
       
    }
    
    
    /**
     * 订单状态查询.
     * 
     * @param order
     *            分配对象
     * @param request
     *            HttpServletRequest
     * @return ResponseData
     */
    
    @RequestMapping(value = "/sales/orderHeader/getStatus")
    @ResponseBody
    public ResponseData getStatus(SysCode sysCode, @RequestParam(defaultValue = DEFAULT_PAGE) int page,
            @RequestParam(defaultValue = DEFAULT_PAGE_SIZE) int pagesize, HttpServletRequest request) {
        IRequest requestContext = createRequestContext(request);
        return new ResponseData(orderHeaderService.selectOrderStatus(requestContext, sysCode, page, pagesize));
       
    }
    
   
}
