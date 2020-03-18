/**
 * Copyright &copy; 2015-2020 <a href="http://www.jeeplus.org/">JeePlus</a> All rights reserved.
 */
package com.numberone.web.controller.app;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * $.ajax后需要接受的JSON
 * 
 * @author
 * 
 */
public class AppJson {

	private boolean success = true;// 是否成功
	private String errorCode = "-1";// 错误代码
	private String msg = "操作成功";// 提示信息
	private Object data;// 封装json的map

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {// 向json中添加属性，在js中访问，请调用data.msg
		this.msg = msg;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	/*@JsonIgnore // 返回对象时忽略此属性
	public String getJsonStr() {// 返回json字符串数组，将访问msg和key的方式统一化，都使用data.key的方式直接访问。

		String json = JsonMapper.getInstance().toJson(this);
		return json;
	}*/

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorCode() {
		return errorCode;
	}
}
