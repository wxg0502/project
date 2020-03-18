package com.numberone.system.domain.dental.doctor;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.numberone.common.base.BaseEntity;

/**
 * 医师表 dental_doctor
 * 
 * @author numberone
 * @date 2020-03-12
 */
public class DentalDoctor extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/**  */
	private String id;
	/** 姓名 */
	private String name;
	/** 性别  1 男 2 女   */
	private String sex;
	/** 电话 */
	private String phone;
	/** 图片 */
	private String imgUrl;
	/**  */
	private String doctorTitle;
	/**  */
	private String doctorInfo;
	/** 状态 关联字典表，1诊断中，2空闲 ，3休息 */
	private String status;
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
	public void setName(String name) 
	{
		this.name = name;
	}

	public String getName() 
	{
		return name;
	}
	public void setSex(String sex) 
	{
		this.sex = sex;
	}

	public String getSex() 
	{
		return sex;
	}
	public void setPhone(String phone) 
	{
		this.phone = phone;
	}

	public String getPhone() 
	{
		return phone;
	}
	public void setImgUrl(String imgUrl) 
	{
		this.imgUrl = imgUrl;
	}

	public String getImgUrl() 
	{
		return imgUrl;
	}
	public void setDoctorTitle(String doctorTitle) 
	{
		this.doctorTitle = doctorTitle;
	}

	public String getDoctorTitle() 
	{
		return doctorTitle;
	}
	public void setDoctorInfo(String doctorInfo) 
	{
		this.doctorInfo = doctorInfo;
	}

	public String getDoctorInfo() 
	{
		return doctorInfo;
	}
	public void setStatus(String status) 
	{
		this.status = status;
	}

	public String getStatus() 
	{
		return status;
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
            .append("name", getName())
            .append("sex", getSex())
            .append("phone", getPhone())
            .append("imgUrl", getImgUrl())
            .append("doctorTitle", getDoctorTitle())
            .append("doctorInfo", getDoctorInfo())
            .append("status", getStatus())
            .append("remark", getRemark())
            .toString();
    }
}
