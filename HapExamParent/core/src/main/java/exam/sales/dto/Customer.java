package exam.sales.dto;

import java.util.Date;

import com.hand.hap.core.annotation.MultiLanguage;
import com.hand.hap.system.dto.BaseDTO;


import javax.persistence.*;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * Created by TangFei on 16/6/24.
 */
@MultiLanguage
@Table(name = "hap_ar_customers")
public class Customer  extends BaseDTO {
    
	
    @Id
    @Column
    @GeneratedValue
    private  Long customerId;
    
    @Column
    @NotEmpty //后台验证  int型用@NotNull
    private String customerNumber;
    
    @Column
    @NotEmpty
    private String customerName;
    
    @Column
    @NotNull
    private Long companyId;

    
    
	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}
    
    
    
//    @Column
//    @NotEmpty  
//    private String enabledFlag;
//    
//    @Column
//    private Date creationDate;
//    
//    @Column
//    private Long createdBy;
//      
//    
//    @Column
//    private Long lastUpdatedBy;
//    
//    @Column
//    private Date lastUpdateDate;
//    
//    @Column
//    private Long lastUpdateLogin;

    
}

