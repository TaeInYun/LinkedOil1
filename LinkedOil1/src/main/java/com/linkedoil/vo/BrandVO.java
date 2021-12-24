package com.sist.vo;

public class BrandVO {

	private String brand_code;
	private String brand_name;
	
	public BrandVO(String brand_code, String brand_name) {
		super();
		this.brand_code = brand_code;
		this.brand_name = brand_name;
	}
	public BrandVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getBrand_code() {
		return brand_code;
	}
	public void setBrand_code(String brand_code) {
		this.brand_code = brand_code;
	}
	public String getBrand_name() {
		return brand_name;
	}
	public void setBrand_name(String brand_name) {
		this.brand_name = brand_name;
	}
	
	
	
}
