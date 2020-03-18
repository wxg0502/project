package com.numberone.system.service.dental.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.numberone.common.support.Convert;
import com.numberone.common.utils.StringUtils;
import com.numberone.system.domain.dental.ailment.DentalAilment;
import com.numberone.system.mapper.dental.DentalAilmentMapper;
import com.numberone.system.service.dental.IDentalAilmentService;

/**
 * 常见病 服务层实现
 * 
 * @author numberone
 * @date 2020-03-12
 */
@Service
public class DentalAilmentServiceImpl implements IDentalAilmentService 
{
	@Autowired
	private DentalAilmentMapper dentalAilmentMapper;

	/**
     * 查询常见病信息
     * 
     * @param id 常见病ID
     * @return 常见病信息
     */
    @Override
	public DentalAilment selectDentalAilmentById(String id)
	{
	    return dentalAilmentMapper.selectDentalAilmentById(id);
	}
	
	/**
     * 查询常见病列表
     * 
     * @param dentalAilment 常见病信息
     * @return 常见病集合
     */
	@Override
	public List<DentalAilment> selectDentalAilmentList(DentalAilment dentalAilment)
	{
	    return dentalAilmentMapper.selectDentalAilmentList(dentalAilment);
	}
	
    /**
     * 新增常见病
     * 
     * @param dentalAilment 常见病信息
     * @return 结果
     */
	@Override
	public int insertDentalAilment(DentalAilment dentalAilment)
	{
		dentalAilment.setId(StringUtils.getUUID());
	    return dentalAilmentMapper.insertDentalAilment(dentalAilment);
	}
	
	/**
     * 修改常见病
     * 
     * @param dentalAilment 常见病信息
     * @return 结果
     */
	@Override
	public int updateDentalAilment(DentalAilment dentalAilment)
	{
	    return dentalAilmentMapper.updateDentalAilment(dentalAilment);
	}

	/**
     * 删除常见病对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteDentalAilmentByIds(String ids)
	{
		return dentalAilmentMapper.deleteDentalAilmentByIds(Convert.toStrArray(ids));
	}
	
}
