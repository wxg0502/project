package com.numberone.system.service.dental;

import java.util.List;

import com.numberone.system.domain.dental.ailment.DentalAilment;

/**
 * 常见病 服务层
 * 
 * @author numberone
 * @date 2020-03-12
 */
public interface IDentalAilmentService 
{
	/**
     * 查询常见病信息
     * 
     * @param id 常见病ID
     * @return 常见病信息
     */
	public DentalAilment selectDentalAilmentById(String id);
	
	/**
     * 查询常见病列表
     * 
     * @param dentalAilment 常见病信息
     * @return 常见病集合
     */
	public List<DentalAilment> selectDentalAilmentList(DentalAilment dentalAilment);
	
	/**
     * 新增常见病
     * 
     * @param dentalAilment 常见病信息
     * @return 结果
     */
	public int insertDentalAilment(DentalAilment dentalAilment);
	
	/**
     * 修改常见病
     * 
     * @param dentalAilment 常见病信息
     * @return 结果
     */
	public int updateDentalAilment(DentalAilment dentalAilment);
		
	/**
     * 删除常见病信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteDentalAilmentByIds(String ids);
	
}
