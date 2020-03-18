package com.numberone.system.domain.dental.ailment;
import java.util.Date;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.numberone.common.base.BaseEntity;



    
/**
 * 常见病表 dental_ailment
 * 
 * @author numberone
 * @date 2020-03-12
 */
public class DentalAilment extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 主键id */
	private String id;
	/** 关联诊所id */
	private String clinicid;
	/** 预约诊疗时间 、分钟 */
	private String spendTime;
	/** 常见病名称 */
	private String ailmentName;
	/** 照片路径 */
	private String imgUrl;
	/** 常见病处置方法*/
	private String alimentSolution;
	/**  常见病说明*/
	private  String ailmentExplain;
	/**  常见病类型，区分常见病和诊疗项目，1，常见病，2，诊疗项目*/
	private String ailmentType;
	/** 备用 */
	private String spare;
	/** 备注 */
	private String remark;

	public void setId(String id) 
	{
		this.id = id;
	}

	public String getId() 
	{
		return id;
	}
	public void setClinicid(String clinicid) 
	{
		this.clinicid = clinicid;
	}

	public String getClinicid() 
	{
		return clinicid;
	}
	
	public void setAilmentName(String ailmentName) 
	{
		this.ailmentName = ailmentName;
	}

	public String getAilmentName() 
	{
		return ailmentName;
	}
	public void setImgUrl(String imgUrl) 
	{
		this.imgUrl = imgUrl;
	}

	public String getImgUrl() 
	{
		return imgUrl;
	}
	public void setAlimentSolution(String alimentSolution) 
	{
		this.alimentSolution = alimentSolution;
	}

	public String getAlimentSolution() 
	{
		return alimentSolution;
	}
	public void setSpare(String spare) 
	{
		this.spare = spare;
	}

	public String getSpare() 
	{
		return spare;
	}
	public void setRemark(String remark) 
	{
		this.remark = remark;
	}

	public String getRemark() 
	{
		return remark;
	}

    public String getAilmentExplain() {
		return ailmentExplain;
	}

	public void setAilmentExplain(String ailmentExplain) {
		this.ailmentExplain = ailmentExplain;
	}

	public void setSpendTime(String spendTime) {
		this.spendTime = spendTime;
	}

	public String getSpendTime() {
		return spendTime;
	}

	public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("clinicid", getClinicid())
            .append("ailmentName", getAilmentName())
            .append("imgUrl", getImgUrl())
            .append("alimentSolution", getAlimentSolution())
            .append("spare", getSpare())
            .append("remark", getRemark())
            .toString();
    }
}
