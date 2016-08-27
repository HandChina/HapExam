package exam.sales.dto;

import java.util.Date;

import com.hand.hap.core.annotation.MultiLanguage;
import com.hand.hap.core.annotation.MultiLanguageField;
import com.hand.hap.system.dto.BaseDTO;


import javax.persistence.*;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * Created by TangFei on 16/6/24.
 */
@MultiLanguage
@Table(name = "hap_inv_inventory_items")
public class Inventory  extends BaseDTO {
    
    @Id
    @Column
    @GeneratedValue
    private  Long inventoryItemsId;
    
    @Column
    @NotEmpty 
    private String itemCode;
    
    @Column
    @NotEmpty
    private String itemUom;
    
    @Column
    @NotEmpty
    private String itemDescription;
    
    @Column
    @NotEmpty
    private String orderFlag;
    
    @Column
    private Date startActiveDate;
    
    @Column
    private Date endActiveDate;
    
    @Column
    @NotEmpty  
    private String enabledFlag;
    
    
    @Column
    private Date creationDate;
    
    @Column
    private Long createdBy;
      
    
    @Column
    private Long lastUpdatedBy;
    
    @Column
    private Date lastUpdateDate;
    
    @Column
    private Long lastUpdateLogin;

	public Long getInventoryItemsId() {
		return inventoryItemsId;
	}

	public void setInventoryItemsId(Long inventoryItemsId) {
		this.inventoryItemsId = inventoryItemsId;
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemUom() {
		return itemUom;
	}

	public void setItemUom(String itemUom) {
		this.itemUom = itemUom;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public String getOrderFlag() {
		return orderFlag;
	}

	public void setOrderFlag(String orderFlag) {
		this.orderFlag = orderFlag;
	}

	public Date getStartActiveDate() {
		return startActiveDate;
	}

	public void setStartActiveDate(Date startActiveDate) {
		this.startActiveDate = startActiveDate;
	}

	public Date getEndActiveDate() {
		return endActiveDate;
	}

	public void setEndActiveDate(Date endActiveDate) {
		this.endActiveDate = endActiveDate;
	}

	public String getEnabledFlag() {
		return enabledFlag;
	}

	public void setEnabledFlag(String enabledFlag) {
		this.enabledFlag = enabledFlag;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Long getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}

	public Long getLastUpdatedBy() {
		return lastUpdatedBy;
	}

	public void setLastUpdatedBy(Long lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}

	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}

	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	public Long getLastUpdateLogin() {
		return lastUpdateLogin;
	}

	public void setLastUpdateLogin(Long lastUpdateLogin) {
		this.lastUpdateLogin = lastUpdateLogin;
	}


    
    
    
}

