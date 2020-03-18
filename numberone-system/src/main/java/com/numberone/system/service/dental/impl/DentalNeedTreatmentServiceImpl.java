package com.numberone.system.service.dental.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.numberone.common.support.Convert;
import com.numberone.system.domain.dental.DentalNeedTreatment;
import com.numberone.system.mapper.dental.DentalNeedTreatmentMapper;
import com.numberone.system.service.dental.IDentalNeedTreatmentService;

/**
 * 需诊疗  服务层实现
 * 
 * @author numberone
 * @date 2020-03-15
 */
@Service
public class DentalNeedTreatmentServiceImpl implements IDentalNeedTreatmentService 
{
	@Autowired
	private DentalNeedTreatmentMapper dentalNeedTreatmentMapper;

	/**
     * 查询需诊疗 信息
     * 
     * @param id 需诊疗 ID
     * @return 需诊疗 信息
     */
    @Override
	public DentalNeedTreatment selectDentalNeedTreatmentById(String id)
	{
	    return dentalNeedTreatmentMapper.selectDentalNeedTreatmentById(id);
	}
	
	/**
     * 查询需诊疗 列表
     * 
     * @param dentalNeedTreatment 需诊疗 信息
     * @return 需诊疗 集合
     */
	@Override
	public List<DentalNeedTreatment> selectDentalNeedTreatmentList(DentalNeedTreatment dentalNeedTreatment)
	{
	    return dentalNeedTreatmentMapper.selectDentalNeedTreatmentList(dentalNeedTreatment);
	}
	
    /**
     * 新增需诊疗 
     * 
     * @param dentalNeedTreatment 需诊疗 信息
     * @return 结果
     */
	@Override
	public int insertDentalNeedTreatment(DentalNeedTreatment dentalNeedTreatment)
	{
	    return dentalNeedTreatmentMapper.insertDentalNeedTreatment(dentalNeedTreatment);
	}
	
	/**
     * 修改需诊疗 
     * 
     * @param dentalNeedTreatment 需诊疗 信息
     * @return 结果
     */
	@Override
	public int updateDentalNeedTreatment(DentalNeedTreatment dentalNeedTreatment)
	{
	    return dentalNeedTreatmentMapper.updateDentalNeedTreatment(dentalNeedTreatment);
	}

	/**
     * 删除需诊疗 对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteDentalNeedTreatmentByIds(String ids)
	{
		return dentalNeedTreatmentMapper.deleteDentalNeedTreatmentByIds(Convert.toStrArray(ids));
	}
	
}
