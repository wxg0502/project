package com.numberone.system.mapper.dental;


import java.util.List;

import com.numberone.system.domain.dental.DentalNeedCheck;	

/**
 * 需检查 数据层
 * 
 * @author numberone
 * @date 2020-03-15
 */
public interface DentalNeedCheckMapper 
{
	/**
     * 查询需检查信息
     * 
     * @param id 需检查ID
     * @return 需检查信息
     */
	public DentalNeedCheck selectDentalNeedCheckById(String id);
	
	/**
     * 查询需检查列表
     * 
     * @param dentalNeedCheck 需检查信息
     * @return 需检查集合
     */
	public List<DentalNeedCheck> selectDentalNeedCheckList(DentalNeedCheck dentalNeedCheck);
	
	/**
     * 新增需检查
     * 
     * @param dentalNeedCheck 需检查信息
     * @return 结果
     */
	public int insertDentalNeedCheck(DentalNeedCheck dentalNeedCheck);
	
	/**
     * 修改需检查
     * 
     * @param dentalNeedCheck 需检查信息
     * @return 结果
     */
	public int updateDentalNeedCheck(DentalNeedCheck dentalNeedCheck);
	
	/**
     * 删除需检查
     * 
     * @param id 需检查ID
     * @return 结果
     */
	public int deleteDentalNeedCheckById(String id);
	
	/**
     * 批量删除需检查
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteDentalNeedCheckByIds(String[] ids);
	
}