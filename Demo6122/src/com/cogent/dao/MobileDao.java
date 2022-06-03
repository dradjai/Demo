package com.cogent.dao;

import com.cogent.model.MobileModel;

public interface MobileDao {
	
	public void addMobile(MobileModel mobile);
	
	public void getAllMobiles(MobileModel mobile);
	
	public void deleteMobile(long Imei);
	
	public MobileModel searchMobile(long Imei);
	
	public MobileModel updateMobile(MobileModel mobile);

}
