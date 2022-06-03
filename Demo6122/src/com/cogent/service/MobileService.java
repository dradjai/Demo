package com.cogent.service;

import com.cogent.model.MobileModel;

public interface MobileService {
	
	public void addMobile(MobileModel mobile);
	
	public void getAllMobiles(MobileModel mobile);
	
	public void deleteMobile(long Imei);
	
	public MobileModel searchMobile(long Imei);
	
	public MobileModel updateMobile(MobileModel mobile);

}
