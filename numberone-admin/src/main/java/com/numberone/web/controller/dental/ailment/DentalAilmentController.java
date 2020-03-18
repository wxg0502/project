package com.numberone.web.controller.dental.ailment;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.numberone.common.annotation.Log;
import com.numberone.common.enums.BusinessType;
import com.numberone.framework.web.base.BaseController;
import com.numberone.system.domain.dental.ailment.DentalAilment;
import com.numberone.system.service.dental.IDentalAilmentService;
import com.numberone.common.page.TableDataInfo;
import com.numberone.common.base.AjaxResult;
import com.numberone.common.utils.poi.ExcelUtil;

/**
 * 常见病 信息操作处理
 * 
 * @author numberone
 * @date 2020-03-12
 */
@Controller
@RequestMapping("/dental/dentalAilment")
public class DentalAilmentController extends BaseController
{
    private String prefix = "/dental/dentalAilment";
	
	@Autowired
	private IDentalAilmentService dentalAilmentService;
	
	@RequiresPermissions("dental:dentalAilment:view")
	@GetMapping()
	public String dentalAilment()
	{
	    return prefix + "/dentalAilment";
	}
	
	/**
	 * 查询常见病列表
	 */
	@RequiresPermissions("dental:dentalAilment:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(DentalAilment dentalAilment)
	{
		startPage();
        List<DentalAilment> list = dentalAilmentService.selectDentalAilmentList(dentalAilment);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出常见病列表
	 */
	@RequiresPermissions("dental:dentalAilment:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(DentalAilment dentalAilment)
    {
    	List<DentalAilment> list = dentalAilmentService.selectDentalAilmentList(dentalAilment);
        ExcelUtil<DentalAilment> util = new ExcelUtil<DentalAilment>(DentalAilment.class);
        return util.exportExcel(list, "dentalAilment");
    }
	
	/**
	 * 新增常见病
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存常见病
	 */
	@RequiresPermissions("dental:dentalAilment:add")
	@Log(title = "常见病", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(DentalAilment dentalAilment)
	{		
		return toAjax(dentalAilmentService.insertDentalAilment(dentalAilment));
	}

	/**
	 * 修改常见病
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") String id, ModelMap mmap)
	{
		DentalAilment dentalAilment = dentalAilmentService.selectDentalAilmentById(id);
		mmap.put("dentalAilment", dentalAilment);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存常见病
	 */
	@RequiresPermissions("dental:dentalAilment:edit")
	@Log(title = "常见病", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(DentalAilment dentalAilment)
	{		
		return toAjax(dentalAilmentService.updateDentalAilment(dentalAilment));
	}
	
	/**
	 * 删除常见病
	 */
	@RequiresPermissions("dental:dentalAilment:remove")
	@Log(title = "常见病", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(dentalAilmentService.deleteDentalAilmentByIds(ids));
	}
	
}
