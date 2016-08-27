package exam.sales.service;


import java.util.List;

import com.hand.hap.core.IRequest;
import com.hand.hap.core.ProxySelf;
import com.hand.hap.system.service.IBaseService;

import exam.sales.dto.OrderHeader;
import exam.sales.dto.SysCode;



/**
 * Created by tangfei
 */
public interface IOrderHeaderService extends IBaseService<OrderHeader>, ProxySelf<IOrderHeaderService> {

	List<OrderHeader> selectByOrderHeader(IRequest requestContext, OrderHeader order, int page, int pagesize);

	List<OrderHeader> selectOrderStatus(IRequest requestContext, SysCode sysCode, int page, int pagesize);

	
}
