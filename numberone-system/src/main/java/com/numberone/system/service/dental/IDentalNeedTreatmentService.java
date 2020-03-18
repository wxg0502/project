package com.numberone.system.service.dental;


import java.util.List;

import com.numberone.system.domain.dental.DentalNeedTreatment;

/**
 * 需诊疗  服务层
 * 
 * @author numberone
 * @date 2020-03-15
 */
public interface IDentalNeedTreatmentService 
{
	/**
     * 查询需诊疗 信息
     * 
     * @param id 需诊疗 ID
     * @return 需诊疗 信息
     */
	public DentalNeedTreatment selectDentalNeedTreatmentById(String id);
	
	/**
     * 查询需诊疗 列表
     * 
     * @param dentalNeedTreatment 需诊疗 信息
     * @return 需诊疗 集合
     */
	public List<DentalNeedTreatment> selectDentalNeedTreatmentList(DentalNeedTreatment dentalNeedTreatment);
	
	/**
     * 新增需诊疗 
     * 
     * @param dentalNeedTreatment 需诊疗 信息
     * @return 结果
     */
	public int insertDentalNeedTreatment(DentalNeedTreatment dentalNeedTreatment);
	
	/**
     * 修改需诊疗 
     * 
     * @param dentalNeedTreatment 需诊疗 信息
     * @return 结果
     */
	public int updateDentalNeedTreatment(DentalNeedTreatment dentalNeedTreatment);
		
	/**
     * 删除需诊疗 信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteDentalNeedTreatmentByIds(String ids);
	
}
