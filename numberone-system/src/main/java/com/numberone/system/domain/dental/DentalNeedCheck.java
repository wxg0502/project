package com.numberone.system.domain.dental;

import java.util.Date;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.numberone.common.base.BaseEntity;

/**
 * 需检查表 dental_need_check
 * 
 * @author numberone
 * @date 2020-03-15
 */
public class DentalNeedCheck extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/**  */
	private String id;
	/** 关联患者id */
	private String patientId;
	/** 检查位置， 哪颗牙 */
	private String checkPosition;
	/** 检查项目（检查哪种病） */
	private String checkItems;
	/** 医嘱 */
	private String doctorAdvice;
	/** 处置 */
	private String checkTreat;
	/** 检查时间 */
	private Date checkTime;
	/** 是否显示，0 不显示，1 显示 */
	private String isShow;
	/** 是否更新 */
	private String isUpdate;
	/** 更新时间 */
	private Date updateTime;
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
	public void setCheckPosition(String checkPosition) 
	{
		this.checkPosition = checkPosition;
	}

	public String getCheckPosition() 
	{
		return checkPosition;
	}
	public void setCheckItems(String checkItems) 
	{
		this.checkItems = checkItems;
	}

	public String getCheckItems() 
	{
		return checkItems;
	}
	public void setDoctorAdvice(String doctorAdvice) 
	{
		this.doctorAdvice = doctorAdvice;
	}

	public String getDoctorAdvice() 
	{
		return doctorAdvice;
	}
	public void setCheckTreat(String checkTreat) 
	{
		this.checkTreat = checkTreat;
	}

	public String getCheckTreat() 
	{
		return checkTreat;
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
	public void setIsUpdate(String isUpdate) 
	{
		this.isUpdate = isUpdate;
	}

	public String getIsUpdate() 
	{
		return isUpdate;
	}
	public void setUpdateTime(Date updateTime) 
	{
		this.updateTime = updateTime;
	}

	public Date getUpdateTime() 
	{
		return updateTime;
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
            .append("checkPosition", getCheckPosition())
            .append("checkItems", getCheckItems())
            .append("doctorAdvice", getDoctorAdvice())
            .append("checkTreat", getCheckTreat())
            .append("checkTime", getCheckTime())
            .append("isShow", getIsShow())
            .append("isUpdate", getIsUpdate())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
