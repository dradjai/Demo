package com.cogent.dao;


import java.util.ArrayList;
import java.util.List;

import com.cogent.model.MobileModel;
import com.cogent.service.MobileService;
import com.cogent.service.MobileServiceImpl;

public class MobileDaoImpl implements MobileDao {
	
	List<MobileModel> mobileList = new ArrayList<MobileModel>();
	
	@Override
	public void addMobile(MobileModel mobile) {
		mobileList.add(mobile);
			
	}

	@Override
	public void getAllMobiles(MobileModel mobile) {
		System.out.println(mobileList);
		
	}

	@Override
	public void deleteMobile(long Imei) {
		for (int i = 0; i < mobileList.size(); i++) {
			if (mobileList.get(i).getImei() == Imei) {
				mobileList.remove(i);
			}
		}
	}

	@Override
	public MobileModel searchMobile(long Imei) {
		for (int i = 0; i < mobileList.size(); i++) {
			if (mobileList.get(i).getImei() == Imei) {
				return mobileList.get(i);
			}
		} 
		return null;
	}

	@Override
	public MobileModel updateMobile(MobileModel mobile) {
		// TODO Auto-generated method stub
		for (int i = 0; i < mobileList.size(); i++) {
			if (mobileList.get(i).getImei() == mobile.getImei()) {
				mobileList.set(i, mobile);
			}
		}
		return null;
	}

		
}

			
		
	

	


		

	/* 1. Delete mobile ---------> done
	 * 2. Search by mobile imei -> done
	 * 3. get all mobile --------> done
	 * 4. update mobile by imei -> done
	 */



