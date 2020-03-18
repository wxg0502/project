package com.numberone.system.service.dental.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.numberone.common.support.Convert;
import com.numberone.system.domain.dental.DentalNeedCheck;
import com.numberone.system.mapper.dental.DentalNeedCheckMapper;
import com.numberone.system.service.dental.IDentalNeedCheckService;

/**
 * 需检查 服务层实现
 * 
 * @author numberone
 * @date 2020-03-15
 */
@Service
public class DentalNeedCheckServiceImpl implements IDentalNeedCheckService 
{
	@Autowired
	private DentalNeedCheckMapper dentalNeedCheckMapper;

	/**
     * 查询需检查信息
     * 
     * @param id 需检查ID
     * @return 需检查信息
     */
    @Override
	public DentalNeedCheck selectDentalNeedCheckById(String id)
	{
	    return dentalNeedCheckMapper.selectDentalNeedCheckById(id);
	}
	
	/**
     * 查询需检查列表
     * 
     * @param dentalNeedCheck 需检查信息
     * @return 需检查集合
     */
	@Override
	public List<DentalNeedCheck> selectDentalNeedCheckList(DentalNeedCheck dentalNeedCheck)
	{
	    return dentalNeedCheckMapper.selectDentalNeedCheckList(dentalNeedCheck);
	}
	
    /**
     * 新增需检查
     * 
     * @param dentalNeedCheck 需检查信息
     * @return 结果
     */
	@Override
	public int insertDentalNeedCheck(DentalNeedCheck dentalNeedCheck)
	{
	    return dentalNeedCheckMapper.insertDentalNeedCheck(dentalNeedCheck);
	}
	
	/**
     * 修改需检查
     * 
     * @param dentalNeedCheck 需检查信息
     * @return 结果
     */
	@Override
	public int updateDentalNeedCheck(DentalNeedCheck dentalNeedCheck)
	{
	    return dentalNeedCheckMapper.updateDentalNeedCheck(dentalNeedCheck);
	}

	/**
     * 删除需检查对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteDentalNeedCheckByIds(String ids)
	{
		return dentalNeedCheckMapper.deleteDentalNeedCheckByIds(Convert.toStrArray(ids));
	}
	
}
