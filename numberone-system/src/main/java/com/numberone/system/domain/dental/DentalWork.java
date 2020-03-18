package com.numberone.system.domain.dental;

import java.util.Date;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.numberone.common.base.BaseEntity;

/**
 * 值班表 dental_work
 * 
 * @author numberone
 * @date 2020-03-12
 */
public class DentalWork extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 主键id */
	private String id;
	/** 关联医师表id */
	private String doctorId;
	/** 日期 */
	private Date workDate;
	/** 工作状态  0 休息 ，1,上班， */
	private String workStatus;
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
	public void setDoctorId(String doctorId) 
	{
		this.doctorId = doctorId;
	}

	public String getDoctorId() 
	{
		return doctorId;
	}
	public void setWorkDate(Date workDate) 
	{
		this.workDate = workDate;
	}

	public Date getWorkDate() 
	{
		return workDate;
	}
	public void setWorkStatus(String workStatus) 
	{
		this.workStatus = workStatus;
	}

	public String getWorkStatus() 
	{
		return workStatus;
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
            .append("doctorId", getDoctorId())
            .append("workDate", getWorkDate())
            .append("workStatus", getWorkStatus())
            .append("remark", getRemark())
            .toString();
    }
}
