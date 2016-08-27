package exam.sales.service.impl;

import com.github.pagehelper.PageHelper;
import com.hand.hap.core.IRequest;
import com.hand.hap.system.dto.DTOStatus;
import com.hand.hap.system.service.impl.BaseServiceImpl;

import exam.sales.dto.Company;
import exam.sales.mapper.CompanyMapper;
import exam.sales.service.ICompanyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author fei.tang@hand-china.com
 */
@Service
public class CompanyServiceImpl extends BaseServiceImpl<Company> implements ICompanyService {
	@Autowired
	private CompanyMapper companyMapper;
/*	@Override
	public List<Company> selectByCompanys(IRequest requestContext, Company company, int page, int pagesize) {
		
		System.out.println("1111111111111111=====================");
		
		List<Companys> coms = companysMapper.selectByCompanys();
		System.out.println("2222222222222========================");
		for(Companys com : coms){
			System.out.println("==========================================");
			System.out.println(com.getCompanyName());
		}
		
		return companysMapper.selectByCompanys();
	}*/
	
	@Override
	public List<Company> selectByCompanys(IRequest requestContext, Company company, int page, int pagesize) {
		PageHelper.startPage(page, pagesize);   //分页查询
		List<Company> coms = companyMapper.selectByCompany(company);
/*		for (Company com : coms){
			System.out.println(com.getCompanyName());
		}*/
		System.out.println("==========================mapper======");
		return companyMapper.selectByCompany(company);
	}

	
/*    @Autowired
    private FruitMapper fruitMapper;

	@Override
	public List<Fruit> selectByFruit(IRequest requestContext, Fruit fruit, int page, int pagesize) {
		// TODO Auto-generated method stub
		PageHelper.startPage(page, pagesize);   //分页查询要加这句
		return fruitMapper.selectByFruit(fruit);
	}*/
	
	

}
