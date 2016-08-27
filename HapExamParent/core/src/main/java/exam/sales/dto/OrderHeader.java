package exam.sales.dto;

import java.util.Date;

import com.hand.hap.core.annotation.MultiLanguage;
import com.hand.hap.core.annotation.MultiLanguageField;
import com.hand.hap.system.dto.BaseDTO;


import javax.persistence.*;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * Created by TangFei on 16/6/24.
 */
@MultiLanguage
@Table(name = "hap_om_order_headers")
public class OrderHeader  extends BaseDTO {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @Column
    @GeneratedValue
    private  Long headerId;
	

	
    @Column
    @NotEmpty
    private String orderNumber;

    @Column
    @NotEmpty
    private Date orderDate;
    
    
    @Column
    @NotNull
    private String orderStatus;

    @Column
    @NotEmpty
    private String companyId;
    

    
    
    @Column
    @NotEmpty 
    private Long customerId;
    
    
    @Transient
    private String companyName;
    
    @Transient
    private String customerName;
    
    @Transient
    private Long summary;
    
    @Transient
    private Long inventoryItemId;

	public Long getHeaderId() {
		return headerId;
	}

	public void setHeaderId(Long headerId) {
		this.headerId = headerId;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getCompanyId() {
		return companyId;
	}

	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Long getSummary() {
		return summary;
	}

	public void setSummary(Long summary) {
		this.summary = summary;
	}

	public Long getInventoryItemId() {
		return inventoryItemId;
	}

	public void setInventoryItemId(Long inventoryItemId) {
		this.inventoryItemId = inventoryItemId;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}




//    
//    @Column
////    private Double objectVersionNumber;
//    private Long objectVersionNumber;
//  
//    @Column
//    private Long requestId;
//    
//    @Column
//    private Long programId;
//    
//    @Column
//    private Date creationDate;
//    
//    @Column
////    private Double createdBy;
//    private Long createdBy;
//      
//    @Column
////    private Double lastUpdatedBy;
//    private Long lastUpdatedBy;
//    
//    @Column
//    private Date lastUpdateDate;
//    
//    @Column
////    private Double lastUpdateLogin;
//    private Long lastUpdateLogin;
//
//    @Column
//    private String attributeCategory;

    
}

