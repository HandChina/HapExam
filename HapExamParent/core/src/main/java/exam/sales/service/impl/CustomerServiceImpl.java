package exam.sales.service.impl;

import com.github.pagehelper.PageHelper;
import com.hand.hap.core.IRequest;
import com.hand.hap.system.dto.DTOStatus;
import com.hand.hap.system.service.impl.BaseServiceImpl;

import exam.sales.dto.Company;
import exam.sales.dto.Customer;
import exam.sales.mapper.CompanyMapper;
import exam.sales.mapper.CustomerMapper;
import exam.sales.service.ICompanyService;
import exam.sales.service.ICustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author fei.tang@hand-china.com
 */
@Service
public class CustomerServiceImpl extends BaseServiceImpl<Customer> implements ICustomerService {
	@Autowired
	private CustomerMapper customerMapper;

	@Override
	public List<Customer> selectByCustomer(IRequest requestContext, Customer customer, int page, int pagesize) {
		PageHelper.startPage(page, pagesize);
		return customerMapper.selectByCustomer(customer);
	}

}
