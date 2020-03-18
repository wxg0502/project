package com.numberone.system.service.dental;



public interface AppService {

	Object getOpenid(String jsCode);
	
	Object getAilement(String token);

	Object getDoctor();

	Object getDoctorDetal();

	Object getDentalClinic();
  

}
