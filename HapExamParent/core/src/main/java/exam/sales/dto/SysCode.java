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
@Table(name = "SYS_CODE_VALUE_B")
public class SysCode  extends BaseDTO {
    
    @Id
    @Column
    @GeneratedValue
    private  Long codeValueId;
    
    @Column
    @NotEmpty
    private Long codeId;

    @Column
    @NotEmpty 
    private String value;
    
    @Column
    @NotEmpty 
    private String meaning;

	public Long getCodeValueId() {
		return codeValueId;
	}

	public void setCodeValueId(Long codeValueId) {
		this.codeValueId = codeValueId;
	}

	public Long getCodeId() {
		return codeId;
	}

	public void setCodeId(Long codeId) {
		this.codeId = codeId;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getMeaning() {
		return meaning;
	}

	public void setMeaning(String meaning) {
		this.meaning = meaning;
	}
    
    
}

