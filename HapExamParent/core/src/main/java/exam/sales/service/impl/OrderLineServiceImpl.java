package exam.sales.service.impl;

import com.github.pagehelper.PageHelper;
import com.hand.hap.core.IRequest;
import com.hand.hap.system.dto.DTOStatus;
import com.hand.hap.system.service.impl.BaseServiceImpl;

import exam.sales.dto.Company;
import exam.sales.dto.OrderLine;
import exam.sales.mapper.CompanyMapper;
import exam.sales.mapper.OrderLineMapper;
import exam.sales.service.ICompanyService;
import exam.sales.service.IOrderLineService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author fei.tang@hand-china.com
 */
@Service
public class OrderLineServiceImpl extends BaseServiceImpl<OrderLine> implements IOrderLineService {
	@Autowired
	private OrderLineMapper orderLineMapper;

	@Override
	public List<OrderLine> selectByOrderLine(IRequest requestContext, OrderLine orderLine, int page, int pagesize) {
		PageHelper.startPage(page, pagesize);
		return orderLineMapper.selectByOrderLine(orderLine);
	}

}
