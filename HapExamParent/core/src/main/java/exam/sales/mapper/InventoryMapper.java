package exam.sales.mapper;

import com.hand.hap.mybatis.common.Mapper;

import exam.sales.dto.Inventory;

import java.util.List;

/**
 * @author fei.tang@hand-china.com
 */
public interface InventoryMapper extends Mapper<Inventory> {

	List<Inventory> selectByInventory(Inventory inventory);

}
