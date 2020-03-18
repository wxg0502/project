package com.numberone.system.service.dental.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.numberone.common.support.Convert;
import com.numberone.system.domain.dental.doctor.DentalDoctor;
import com.numberone.system.mapper.dental.DentalDoctorMapper;
import com.numberone.system.service.dental.IDentalDoctorService;


/**
 * 医师 服务层实现
 * 
 * @author numberone
 * @date 2020-03-12
 */
@Service
public class DentalDoctorServiceImpl implements IDentalDoctorService 
{
	@Autowired
	private DentalDoctorMapper dentalDoctorMapper;

	/**
     * 查询医师信息
     * 
     * @param id 医师ID
     * @return 医师信息
     */
    @Override
	public DentalDoctor selectDentalDoctorById(String id)
	{
	    return dentalDoctorMapper.selectDentalDoctorById(id);
	}
	
	/**
     * 查询医师列表
     * 
     * @param dentalDoctor 医师信息
     * @return 医师集合
     */
	@Override
	public List<DentalDoctor> selectDentalDoctorList(DentalDoctor dentalDoctor)
	{
	    return dentalDoctorMapper.selectDentalDoctorList(dentalDoctor);
	}
	
    /**
     * 新增医师
     * 
     * @param dentalDoctor 医师信息
     * @return 结果
     */
	@Override
	public int insertDentalDoctor(DentalDoctor dentalDoctor)
	{
	    return dentalDoctorMapper.insertDentalDoctor(dentalDoctor);
	}
	
	/**
     * 修改医师
     * 
     * @param dentalDoctor 医师信息
     * @return 结果
     */
	@Override
	public int updateDentalDoctor(DentalDoctor dentalDoctor)
	{
	    return dentalDoctorMapper.updateDentalDoctor(dentalDoctor);
	}

	/**
     * 删除医师对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteDentalDoctorByIds(String ids)
	{
		return dentalDoctorMapper.deleteDentalDoctorByIds(Convert.toStrArray(ids));
	}


	
}
