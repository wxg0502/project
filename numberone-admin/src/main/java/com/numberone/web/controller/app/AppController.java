package com.numberone.web.controller.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.numberone.framework.config.ServerConfig;
import com.numberone.framework.web.base.BaseController;
import com.numberone.system.service.dental.AppService;

@Controller
@RequestMapping("/app")
public class AppController extends BaseController{
	@Autowired
	private AppService appService;
	
	/**
	 * 给微信小程序端返回微信唯一标识
	 * @param jsCode
	 * @return
	 */
			@ResponseBody
			@RequestMapping(value = "getOpenid")	
public AppJson getOpenid(String js_code) {
		AppJson j = new AppJson();
		try {		
				j.setData(appService.getOpenid(js_code));
				j.setSuccess(true);
		   
				} catch (Exception e) {
					e.printStackTrace();
					j.setSuccess(false);
					j.setMsg("发生未知异常，请联系管理员！");
				}
				return j;
														
}

/**
 * 返回常见病信息
 */

/**
 * 给微信小程序端返回微信唯一标识
 * @param jsCode
 * @return
 */
		@ResponseBody
		@RequestMapping(value = "getAilment")	
public AppJson getAilment(String js_code) {
	AppJson j = new AppJson();
	try {		
			j.setData(appService.getOpenid(js_code));
			j.setSuccess(true);
	   
			} catch (Exception e) {
				e.printStackTrace();
				j.setSuccess(false);
				j.setMsg("发生未知异常，请联系管理员！");
			}
			return j;
		}											
}

