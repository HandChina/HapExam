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
@Table(name = "hap_org_companys")
public class Company  extends BaseDTO {
    
	
    @Id
    @Column
    @GeneratedValue
    private  Long companyId;
    
    @Column
    @NotEmpty //后台验证  int型用@NotNull
    private String companyNumber;
    
    @Column
    @NotEmpty
    private String companyName;

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public String getCompanyNumber() {
		return companyNumber;
	}

	public void setCompanyNumber(String companyNumber) {
		this.companyNumber = companyNumber;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
    
/*    @Column
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
    private Long lastUpdateLogin;*/


    

    
}

