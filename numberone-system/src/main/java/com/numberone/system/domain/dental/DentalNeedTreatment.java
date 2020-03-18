package com.numberone.system.domain.dental;

import java.util.Date;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.numberone.common.base.BaseEntity;

/**
 * 需诊疗 表 dental_need_treatment
 * 
 * @author numberone
 * @date 2020-03-15
 */
public class DentalNeedTreatment extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** id */
	private String id;
	/** 关联用户id */
	private String patientId;
	/** 诊疗位置   哪颗牙 如下前3-3 */
	private String treatmentItems;
	/** 处置方案 */
	private String treatmentSolution;
	/** 医嘱 */
	private String doctorAdvice;
	/**  */
	private String checkResult;
	/**  */
	private Date checkTime;
	/** 是否显示  0 不显示，1 显示 */
	private String isShow;
	/**  */
	private Date updateDate;
	/**  */
	private String remark;

	public void setId(String id) 
	{
		this.id = id;
	}

	public String getId() 
	{
		return id;
	}
	public void setPatientId(String patientId) 
	{
		this.patientId = patientId;
	}

	public String getPatientId() 
	{
		return patientId;
	}
	public void setTreatmentItems(String treatmentItems) 
	{
		this.treatmentItems = treatmentItems;
	}

	public String getTreatmentItems() 
	{
		return treatmentItems;
	}
	public void setTreatmentSolution(String treatmentSolution) 
	{
		this.treatmentSolution = treatmentSolution;
	}

	public String getTreatmentSolution() 
	{
		return treatmentSolution;
	}
	public void setDoctorAdvice(String doctorAdvice) 
	{
		this.doctorAdvice = doctorAdvice;
	}

	public String getDoctorAdvice() 
	{
		return doctorAdvice;
	}
	public void setCheckResult(String checkResult) 
	{
		this.checkResult = checkResult;
	}

	public String getCheckResult() 
	{
		return checkResult;
	}
	public void setCheckTime(Date checkTime) 
	{
		this.checkTime = checkTime;
	}

	public Date getCheckTime() 
	{
		return checkTime;
	}
	public void setIsShow(String isShow) 
	{
		this.isShow = isShow;
	}

	public String getIsShow() 
	{
		return isShow;
	}
	public void setUpdateDate(Date updateDate) 
	{
		this.updateDate = updateDate;
	}

	public Date getUpdateDate() 
	{
		return updateDate;
	}
	public void setRemark(String remark) 
	{
		this.remark = remark;
	}

	public String getRemark() 
	{
		return remark;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("patientId", getPatientId())
            .append("treatmentItems", getTreatmentItems())
            .append("treatmentSolution", getTreatmentSolution())
            .append("doctorAdvice", getDoctorAdvice())
            .append("checkResult", getCheckResult())
            .append("checkTime", getCheckTime())
            .append("isShow", getIsShow())
            .append("updateDate", getUpdateDate())
            .append("remark", getRemark())
            .toString();
    }
}
