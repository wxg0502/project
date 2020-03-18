package com.numberone.system.service.dental.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.numberone.common.support.Convert;
import com.numberone.system.domain.dental.DentalWork;
import com.numberone.system.mapper.dental.DentalWorkMapper;
import com.numberone.system.service.dental.IDentalWorkService;



/**
 * 值班 服务层实现
 * 
 * @author numberone
 * @date 2020-03-12
 */
@Service
public class DentalWorkServiceImpl implements IDentalWorkService 
{
	@Autowired
	private DentalWorkMapper dentalWorkMapper;

	/**
     * 查询值班信息
     * 
     * @param id 值班ID
     * @return 值班信息
     */
    @Override
	public DentalWork selectDentalWorkById(String id)
	{
	    return dentalWorkMapper.selectDentalWorkById(id);
	}
	
	/**
     * 查询值班列表
     * 
     * @param dentalWork 值班信息
     * @return 值班集合
     */
	@Override
	public List<DentalWork> selectDentalWorkList(DentalWork dentalWork)
	{
	    return dentalWorkMapper.selectDentalWorkList(dentalWork);
	}
	
    /**
     * 新增值班
     * 
     * @param dentalWork 值班信息
     * @return 结果
     */
	@Override
	public int insertDentalWork(DentalWork dentalWork)
	{
	    return dentalWorkMapper.insertDentalWork(dentalWork);
	}
	
	/**
     * 修改值班
     * 
     * @param dentalWork 值班信息
     * @return 结果
     */
	@Override
	public int updateDentalWork(DentalWork dentalWork)
	{
	    return dentalWorkMapper.updateDentalWork(dentalWork);
	}

	/**
     * 删除值班对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteDentalWorkByIds(String ids)
	{
		return dentalWorkMapper.deleteDentalWorkByIds(Convert.toStrArray(ids));
	}
	
}
