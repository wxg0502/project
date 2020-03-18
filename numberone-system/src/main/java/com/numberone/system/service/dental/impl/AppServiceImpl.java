package com.numberone.system.service.dental.impl;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.numberone.common.json.JSON;
import com.numberone.common.json.JSONObject;
import com.numberone.common.utils.http.HttpUtils;
import com.numberone.system.domain.dental.ailment.DentalAilment;
import com.numberone.system.domain.dental.doctor.DentalDoctor;
import com.numberone.system.service.dental.AppService;
import com.numberone.system.service.dental.IDentalAilmentService;
import com.numberone.system.service.dental.IDentalDoctorService;

@Service
public class AppServiceImpl  implements AppService{

	  @Autowired
	    private IDentalAilmentService ailmentService;
	  @Autowired
	    private IDentalDoctorService doctorService;
	
	public Object getOpenid(String jsCode ) {
		//根据已知数据 调用微信接口，获取微信用户唯一表示  
    	LinkedHashMap<String, Object> map =new LinkedHashMap<String, Object> ();
    	String errorCode;
    	JSONObject json=null;
    try{	
		 String url="https://api.weixin.qq.com/sns/jscode2session?appid=wx728c38cd42d59ee3&secret=d6e8cdf28d2629a02245dee48db24d08&js_code=" + jsCode+"&grant_type=authorization_code";
    	 String sr=HttpUtils.sendGet(url);
    	 json =JSON.unmarshal(sr, JSONObject.class);
		// 获取会话密钥（session_key）
		String session_key = json.get("session_key").toString();
		// 用户的唯一标识（openid）
		String openid = (String) json.get("openid");
		
		map.put("openid", openid);
		
    }catch(Exception e){
        
    	 try {
			throw new Exception("唯一标识获取错误，错误代码："+ (String) json.get("errcode"));
		} catch (Exception e1) {
			e1.printStackTrace();
		}
			
		}
		return map;
   
	}

	@Override
	public Object getAilement(String token) {
		 LinkedHashMap<String, Object> map =new LinkedHashMap<String, Object> ();
		 List<DentalAilment> list =ailmentService.selectDentalAilmentList(new DentalAilment());
          if(list.size()>0) {
        	  List li=new ArrayList();
        	
        	  for(DentalAilment ailment:list) {
        		  Map m=new HashMap();
        		  m.put("ailmentName", ailment.getAilmentName());
        		  m.put("ailmentSolution", ailment.getAlimentSolution());
        		  m.put("imgUrl", ailment.getImgUrl());
        		  m.put("spendTime", ailment.getSpendTime());
        		  m.put("ailmentExplain", ailment.getAilmentExplain());
        		  m.put("ailmentId", ailment.getId());
        		  li.add(m);
        	  }
        	  map.put("ailmentList", li);
          }
		
		
		return map;
	}
	/**
	 * 预约时获取医生
	 * 参数，初步定为 日期， 具体时间段，需花费 大概时间，有可能还会有个医师id
	 */
	
	@Override
	public Object getDoctor() {
		
		return null;
	}
	
	/**
	 * 诊疗保障获取医生
	 * 参数，
	 */
	
	@Override
	public Object getDoctorDetal() {
		 LinkedHashMap<String, Object> map =new LinkedHashMap<String, Object> ();
		 List<DentalDoctor> list =doctorService.selectDentalDoctorList(new DentalDoctor());
         if(list.size()>0) {
       	  List li=new ArrayList();
       	
       	  for(DentalDoctor doctor:list) {
       		Map m=new HashMap();
       		m.put("doctorName", doctor.getName());
       		m.put("doctorTitle",doctor.getDoctorTitle());
       		m.put("imgUrl", doctor.getImgUrl());
       		m.put("doctorInfo", doctor.getDoctorInfo());
       		m.put("doctorPhone", doctor.getPhone());
       		
       		li.add(m);  
       	  }
       	  map.put("doctorList", li);
         }
		
		
		return map;
	}

	/**
	 * 获取单个医生诊疗时间
	 * 参数，初步定为 日期， 具体时间段，需花费 大概时间
	 *//*
	
	@Override
	public Object getDoctorDetal() {
		 LinkedHashMap<String, Object> map =new LinkedHashMap<String, Object> ();
		 List<DentalDoctor> list =doctorService.selectDentalDoctorList(new DentalDoctor());
         if(list.size()>0) {
       	  List li=new ArrayList();
       	
       	  for(DentalDoctor doctor:list) {
       		Map m=new HashMap();
       		m.put("doctorName", doctor.getName());
       		m.put("doctorTitle",doctor.getDoctorTitle());
       		m.put("imgUrl", doctor.getImgUrl());
       		m.put("doctorInfo", doctor.getDoctorInfo());
       		m.put("doctorPhone", doctor.getPhone());
       		
       		li.add(m);  
       	  }
       	  map.put("doctorList", li);
         }
		
		
		return map;
	}*/
	
	/**
	 * 获取诊所信息
	 */
	@Override
	public Object getDentalClinic() {
		 LinkedHashMap<String, Object> map =new LinkedHashMap<String, Object> ();
		 List<DentalDoctor> list =doctorService.selectDentalDoctorList(new DentalDoctor());
         if(list.size()>0) {
       	  List li=new ArrayList();
       	
       	  for(DentalDoctor doctor:list) {
       		Map m=new HashMap();
       		m.put("doctorName", doctor.getName());
       		m.put("doctorTitle",doctor.getDoctorTitle());
       		m.put("imgUrl", doctor.getImgUrl());
       		m.put("doctorInfo", doctor.getDoctorInfo());
       		m.put("doctorPhone", doctor.getPhone());
       		
       		li.add(m);  
       	  }
       	  map.put("doctorList", li);
         }
		
		
		return map;
	}

	
	
	
}
