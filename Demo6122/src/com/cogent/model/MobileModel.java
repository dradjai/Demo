package com.cogent.model;

public class MobileModel {
	private long imei;
	private String brand;
	private String model;
	private double price;
	
	
	public MobileModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MobileModel(long imei, String brand, String model, double price) {
		super();
		this.imei = imei;
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
	
	
	public long getImei() {
		return imei;
	}
	public void setImei(long imei) {
		this.imei = imei;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	@Override
	public String toString() {
		return imei + " " + brand + " " + model + " " + price + "";
	}
	
	
	
	
	

}
