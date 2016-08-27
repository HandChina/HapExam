package exam.sales.service;


import java.util.List;

import com.hand.hap.core.IRequest;
import com.hand.hap.core.ProxySelf;
import com.hand.hap.system.service.IBaseService;

import exam.sales.dto.Company;



/**
 * Created by tangfei
 */
public interface ICompanyService extends IBaseService<Company>, ProxySelf<ICompanyService> {

	List<Company> selectByCompanys(IRequest requestContext, Company company, int page, int pagesize);

}
