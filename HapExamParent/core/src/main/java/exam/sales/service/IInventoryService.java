package exam.sales.service;


import java.util.List;

import com.hand.hap.core.IRequest;
import com.hand.hap.core.ProxySelf;
import com.hand.hap.system.service.IBaseService;

import exam.sales.dto.Inventory;


/**
 * Created by tangfei
 */
public interface IInventoryService extends IBaseService<Inventory>, ProxySelf<IInventoryService> {

	List<Inventory> selectByInventory(IRequest requestContext, Inventory inventory, int page, int pagesize);

	
}
