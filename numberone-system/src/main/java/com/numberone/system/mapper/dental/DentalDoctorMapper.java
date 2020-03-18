package com.numberone.system.mapper.dental;

import java.util.List;

import com.numberone.system.domain.dental.doctor.DentalDoctor;	

/**
 * 医师 数据层
 * 
 * @author numberone
 * @date 2020-03-12
 */
public interface DentalDoctorMapper 
{
	/**
     * 查询医师信息
     * 
     * @param id 医师ID
     * @return 医师信息
     */
	public DentalDoctor selectDentalDoctorById(String id);
	
	/**
     * 查询医师列表
     * 
     * @param dentalDoctor 医师信息
     * @return 医师集合
     */
	public List<DentalDoctor> selectDentalDoctorList(DentalDoctor dentalDoctor);
	
	/**
     * 新增医师
     * 
     * @param dentalDoctor 医师信息
     * @return 结果
     */
	public int insertDentalDoctor(DentalDoctor dentalDoctor);
	
	/**
     * 修改医师
     * 
     * @param dentalDoctor 医师信息
     * @return 结果
     */
	public int updateDentalDoctor(DentalDoctor dentalDoctor);
	
	/**
     * 删除医师
     * 
     * @param id 医师ID
     * @return 结果
     */
	public int deleteDentalDoctorById(String id);
	
	/**
     * 批量删除医师
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteDentalDoctorByIds(String[] ids);
	
}