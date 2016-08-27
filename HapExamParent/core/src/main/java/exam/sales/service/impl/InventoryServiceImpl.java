package exam.sales.service.impl;

import com.github.pagehelper.PageHelper;
import com.hand.hap.core.IRequest;
import com.hand.hap.system.dto.DTOStatus;
import com.hand.hap.system.service.impl.BaseServiceImpl;

import exam.sales.dto.Company;
import exam.sales.dto.Inventory;
import exam.sales.mapper.CompanyMapper;
import exam.sales.mapper.InventoryMapper;
import exam.sales.service.ICompanyService;
import exam.sales.service.IInventoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author fei.tang@hand-china.com
 */
@Service
public class InventoryServiceImpl extends BaseServiceImpl<Inventory> implements IInventoryService {
	@Autowired
	private InventoryMapper inventoryMapper;

	@Override
	public List<Inventory> selectByInventory(IRequest requestContext, Inventory inventory, int page, int pagesize) {
		PageHelper.startPage(page, pagesize);
		return inventoryMapper.selectByInventory(inventory);
	}

}
