package exam.sales.mapper;

import com.hand.hap.mybatis.common.Mapper;

import exam.sales.dto.OrderLine;

import java.util.List;

/**
 * @author fei.tang@hand-china.com
 */
public interface OrderLineMapper extends Mapper<OrderLine> {

	List<OrderLine> selectByOrderLine(OrderLine orderLine);

    
/*    List<Fruit> selectByFruit(Fruit fruit);
    
    int insertFruit(Fruit fruit);

	void updateFruit(Fruit fruit);

	void deleteFruit(Fruit fruit);*/

}
