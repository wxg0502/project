package com.numberone.web.controller.dental.doctor;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.numberone.common.annotation.Log;
import com.numberone.common.enums.BusinessType;
import com.numberone.common.json.JSONObject;
import com.numberone.framework.web.base.BaseController;
import com.numberone.system.domain.dental.doctor.DentalDoctor;
import com.numberone.system.service.dental.IDentalDoctorService;
import com.numberone.common.page.TableDataInfo;
import com.numberone.common.base.AjaxResult;
import com.numberone.common.utils.StringUtils;
import com.numberone.common.utils.file.FileUploadUtils;
import com.numberone.common.utils.file.FileUtils;
import com.numberone.common.utils.poi.ExcelUtil;

/**
 * 医师 信息操作处理
 * 
 * @author numberone
 * @date 2020-03-12
 */
@Controller
@RequestMapping("/dental/dentalDoctor")
public class DentalDoctorController extends BaseController
{
    private String prefix = "dental/dentalDoctor";
	
	@Autowired
	private IDentalDoctorService dentalDoctorService;
	
	@RequiresPermissions("dental:dentalDoctor:view")
	@GetMapping()
	public String dentalDoctor()
	{
	    return prefix + "/dentalDoctor";
	}
	
	
	 @Value("${file.staticAccessPath}")
     private String staticAccessPath;
     @Value("${file.uploadFolder}")
     private String uploadFolder;
	
	/**
	 * 医师 照片操作处理
	 * 
	 * @author numberone
	 * @date 2020-03-12
	 */
	@RequestMapping("/addPicture")
	@ResponseBody
	public String addPicture(@RequestParam(value="filename") MultipartFile file,
			HttpServletRequest request,HttpServletResponse response){
		OutputStream os = null;
		InputStream is = null;
		String fileName="";
		boolean returnBoolean = false; 
		//String bug_id = request.getParameter("id");   // 传过来的额外参数
		String bug_id=StringUtils.getUUID();
		
		
		try {
			//FileUploadUtils.upload(file);
			//String path = "E:\\WORK\\TOMCAT\\apache-tomcat-8.5.24-amp\\wtpwebapps\\amp";
			
			//String path =request.getRealPath("/"); 
			
			SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");   
			String currentDate = df.format(System.currentTimeMillis());
			String pathTemp = uploadFolder + File.separator + currentDate + File.separator + bug_id;
			File fileTemp = new File(pathTemp);
			if(!fileTemp.exists()) {
				fileTemp.mkdirs();
			}
			String fullFilePath = pathTemp + File.separator + file.getOriginalFilename();
			File fullFile = new File(fullFilePath);
			fileName="\\\\"+uploadFolder.split("//")[1]+"\\\\"+currentDate+"\\\\"+bug_id+"\\\\"+file.getOriginalFilename();
			os = new FileOutputStream(fullFile);
			is =file.getInputStream();
			byte buf[] = new byte[1024];//可以修改 1024 以提高读取速度
			int length = 0;
			while( (length = is.read(buf)) > 0 ){
				os.write(buf, 0, length);
			}
			returnBoolean = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
            if(is !=null) {
				try {
					is.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(os !=null) {
				try {
					os.flush();
					os.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return JSONObject.valueAsStr("{\"success\":"+ returnBoolean +",\"filePath\":\""+fileName+"\"}").toString();
	}

	
	
	
	/**
	 * 医师 照片操作处理(删除)
	 * 
	 * @author numberone
	 * @date 2020-03-12
	 */
	@RequestMapping("/deletaPicture")
	@ResponseBody
	public String deletaPicture(HttpServletRequest request,HttpServletResponse response,String key){
		 
		 String[] split = uploadFolder.split("//");
		 //boolean deleteFile = FileUtils.deleteFile(split[0]+key);
		 String parameter = request.getParameter("key");
		return "true";
		/*
		OutputStream os = null;
		InputStream is = null;
		boolean returnBoolean = false; 
		String bug_id = request.getParameter("id");   // 传过来的额外参数
		try {
			String path = "E:\\WORK\\TOMCAT\\apache-tomcat-8.5.24-amp\\wtpwebapps\\amp";
			SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");   
			String currentDate = df.format(System.currentTimeMillis());
			String pathTemp = path + File.separator + currentDate + File.separator + bug_id;
			File fileTemp = new File(pathTemp);
			if(!fileTemp.exists()) {
				fileTemp.mkdirs();
			}
			String fullFilePath = pathTemp + File.separator + file.getOriginalFilename();
			File fullFile = new File(fullFilePath);
			
			os = new FileOutputStream(fullFile);
			is =file.getInputStream();
			byte buf[] = new byte[1024];//可以修改 1024 以提高读取速度
			int length = 0;
			while( (length = is.read(buf)) > 0 ){
				os.write(buf, 0, length);
			}
			returnBoolean = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
            if(is !=null) {
				try {
					is.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(os !=null) {
				try {
					os.flush();
					os.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return JSONObject.valueAsStr("{\"success\":"+ returnBoolean +"}").toString();
	*/}
	
	
	
	/**
	 * 查询医师列表
	 */
	@RequiresPermissions("dental:dentalDoctor:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(DentalDoctor dentalDoctor)
	{
		startPage();
        List<DentalDoctor> list = dentalDoctorService.selectDentalDoctorList(dentalDoctor);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出医师列表
	 */
	@RequiresPermissions("dental:dentalDoctor:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(DentalDoctor dentalDoctor)
    {
    	List<DentalDoctor> list = dentalDoctorService.selectDentalDoctorList(dentalDoctor);
        ExcelUtil<DentalDoctor> util = new ExcelUtil<DentalDoctor>(DentalDoctor.class);
        return util.exportExcel(list, "dentalDoctor");
    }
	
	/**
	 * 新增医师
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存医师
	 */
	@RequiresPermissions("dental:dentalDoctor:add")
	@Log(title = "医师", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(DentalDoctor dentalDoctor)
	{		
		return toAjax(dentalDoctorService.insertDentalDoctor(dentalDoctor));
	}

	/**
	 * 修改医师
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") String id, ModelMap mmap)
	{
		DentalDoctor dentalDoctor = dentalDoctorService.selectDentalDoctorById(id);
		mmap.put("dentalDoctor", dentalDoctor);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存医师
	 */
	@RequiresPermissions("dental:dentalDoctor:edit")
	@Log(title = "医师", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(DentalDoctor dentalDoctor)
	{		
		return toAjax(dentalDoctorService.updateDentalDoctor(dentalDoctor));
	}
	
	/**
	 * 删除医师
	 */
	@RequiresPermissions("dental:dentalDoctor:remove")
	@Log(title = "医师", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(dentalDoctorService.deleteDentalDoctorByIds(ids));
	}
	
}
