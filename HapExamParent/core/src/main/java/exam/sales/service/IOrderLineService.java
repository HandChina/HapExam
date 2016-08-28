package exam.sales.service;


import java.util.List;

import com.hand.hap.core.IRequest;
import com.hand.hap.core.ProxySelf;
import com.hand.hap.system.service.IBaseService;

import exam.sales.dto.OrderLine;




/**
 * Created by tangfei
 */
public interface IOrderLineService extends IBaseService<OrderLine>, ProxySelf<IOrderLineService> {

	List<OrderLine> selectByOrderLine(IRequest requestContext, OrderLine orderLine, int page, int pagesize);

	
}
