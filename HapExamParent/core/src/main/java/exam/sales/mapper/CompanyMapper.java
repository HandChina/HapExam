package exam.sales.mapper;

import com.hand.hap.mybatis.common.Mapper;

import exam.sales.dto.Company;

import java.util.List;

/**
 * @author taotao.xu@hand-china.com
 */
public interface CompanyMapper extends Mapper<Company> {

	List<Company> selectByCompany(Company company);

    
/*    List<Fruit> selectByFruit(Fruit fruit);
    
    int insertFruit(Fruit fruit);

	void updateFruit(Fruit fruit);

	void deleteFruit(Fruit fruit);*/

}
