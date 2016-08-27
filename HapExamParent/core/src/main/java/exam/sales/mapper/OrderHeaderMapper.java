package exam.sales.mapper;

import com.hand.hap.mybatis.common.Mapper;

import exam.sales.dto.OrderHeader;
import exam.sales.dto.SysCode;

import java.util.List;

/**
 * @author fei.tang@hand-china.com
 */
public interface OrderHeaderMapper extends Mapper<OrderHeader> {


	List<OrderHeader> selectByOrderHeader(OrderHeader order);

	List<OrderHeader> selectOrderStatus(SysCode sysCode);

    
}
