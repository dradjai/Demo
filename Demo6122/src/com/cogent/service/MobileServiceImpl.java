package com.cogent.service;

import com.cogent.dao.MobileDao;
import com.cogent.dao.MobileDaoImpl;
import com.cogent.model.MobileModel;

public class MobileServiceImpl implements MobileService {

	MobileDao dao = new MobileDaoImpl(); 
	
	@Override
	public void addMobile(MobileModel mobile) {
		dao.addMobile(mobile);
		
	}

	@Override
	public void getAllMobiles(MobileModel mobile) {
		dao.getAllMobiles(mobile);
		
	}

	@Override
	public void deleteMobile(long Imei) {
		dao.deleteMobile(Imei);
		
	}

	@Override
	public MobileModel searchMobile(long Imei) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MobileModel updateMobile(MobileModel mobile) {
		return dao.updateMobile(mobile);
	}



	
}
