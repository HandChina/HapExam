package exam.sales.mapper;

import com.hand.hap.mybatis.common.Mapper;

import exam.sales.dto.Customer;

import java.util.List;

/**
 * @author fei.tang@hand-china.com
 */
public interface CustomerMapper extends Mapper<Customer> {

	List<Customer> selectByCustomer(Customer customer);

    
/*    List<Fruit> selectByFruit(Fruit fruit);
    
    int insertFruit(Fruit fruit);

	void updateFruit(Fruit fruit);

	void deleteFruit(Fruit fruit);*/

}
