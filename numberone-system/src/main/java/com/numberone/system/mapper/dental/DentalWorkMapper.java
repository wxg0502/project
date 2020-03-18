package com.numberone.system.mapper.dental;


import java.util.List;

import com.numberone.system.domain.dental.DentalWork;	

/**
 * 值班 数据层
 * 
 * @author numberone
 * @date 2020-03-12
 */
public interface DentalWorkMapper 
{
	/**
     * 查询值班信息
     * 
     * @param id 值班ID
     * @return 值班信息
     */
	public DentalWork selectDentalWorkById(String id);
	
	/**
     * 查询值班列表
     * 
     * @param dentalWork 值班信息
     * @return 值班集合
     */
	public List<DentalWork> selectDentalWorkList(DentalWork dentalWork);
	
	/**
     * 新增值班
     * 
     * @param dentalWork 值班信息
     * @return 结果
     */
	public int insertDentalWork(DentalWork dentalWork);
	
	/**
     * 修改值班
     * 
     * @param dentalWork 值班信息
     * @return 结果
     */
	public int updateDentalWork(DentalWork dentalWork);
	
	/**
     * 删除值班
     * 
     * @param id 值班ID
     * @return 结果
     */
	public int deleteDentalWorkById(String id);
	
	/**
     * 批量删除值班
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteDentalWorkByIds(String[] ids);
	
}