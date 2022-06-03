package com.cogent.controller;

import java.util.Scanner;

import com.cogent.model.MobileModel;
import com.cogent.service.MobileService;
import com.cogent.service.MobileServiceImpl;

public class MobileController {

	MobileService mobileS = new MobileServiceImpl();
	public static void main(String[] args) {
		MobileController controller = new MobileController();
		Scanner sc = new Scanner(System.in);
		controller.addMobile();
		controller.updateMobile();
		controller.printAll();
		//controller.searchMobile();
		//controller.printAll();
		//controller.deleteMobile();
		//controller.printAll();
		
	
		
	}
		
		public void addMobile() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter how many: ");
			int num = sc.nextInt();
			for (int i = 0; i < num; i++) {
				MobileModel mobileM = new MobileModel();
				System.out.println("Enter IMEI: ");
				mobileM.setImei(sc.nextLong());
				System.out.println("Enter brand: ");
				mobileM.setBrand(sc.next());
				System.out.println("Enter model: ");
				mobileM.setModel(sc.next());
				System.out.println("Enter price: ");
				mobileM.setPrice(sc.nextDouble());
				
				mobileS.addMobile(mobileM);
			}
			
	}
		public void printAll() {
			mobileS.getAllMobiles(null);

		}
		
		public void deleteMobile() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Imei to delete: ");
			long mobile = sc.nextLong();
			mobileS.deleteMobile(mobile);
		}
		
		public void searchMobile() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Imei: ");
			long mobile = sc.nextLong();
			System.out.println(mobileS.searchMobile(mobile));
			
		}
		
		public void updateMobile() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Imei to update: ");
			long imei = sc.nextLong();
			System.out.println("Enter new brand: ");
			String brand = sc.next();
			System.out.println("Enter new model: ");
			String model = sc.next();
			System.out.println("Enter new price: ");
			double price = sc.nextDouble();
			MobileModel mobile = new MobileModel(imei,brand, model, price);
			mobileS.updateMobile(mobile);
		}
		

}
