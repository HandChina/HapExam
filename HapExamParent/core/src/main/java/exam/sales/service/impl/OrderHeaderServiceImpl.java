package exam.sales.service.impl;

import com.github.pagehelper.PageHelper;
import com.hand.hap.core.IRequest;
import com.hand.hap.system.dto.DTOStatus;
import com.hand.hap.system.service.impl.BaseServiceImpl;

import exam.sales.dto.OrderHeader;
import exam.sales.dto.SysCode;
import exam.sales.mapper.OrderHeaderMapper;
import exam.sales.service.IOrderHeaderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author fei.tang@hand-china.com
 */
@Service
public class OrderHeaderServiceImpl extends BaseServiceImpl<OrderHeader> implements IOrderHeaderService {
	@Autowired
	private OrderHeaderMapper orderMapper;


	@Override
	public List<OrderHeader> selectByOrderHeader(IRequest requestContext, OrderHeader order, int page, int pagesize) {
		PageHelper.startPage(page, pagesize);   //分页查询
		return orderMapper.selectByOrderHeader(order);
	}

	@Override
	public List<OrderHeader> selectOrderStatus(IRequest requestContext, SysCode sysCode, int page, int pagesize) {
		// TODO Auto-generated method stub
		return orderMapper.selectOrderStatus(sysCode);
	}


	

}
