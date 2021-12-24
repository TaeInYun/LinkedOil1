package com.sist.vo;

public class OilVO {

	private int oil_code;
	private String oil_name;
	
	public OilVO(int oil_code, String oil_name) {
		super();
		this.oil_code = oil_code;
		this.oil_name = oil_name;
	}

	public OilVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getOil_code() {
		return oil_code;
	}

	public void setOil_code(int oil_code) {
		this.oil_code = oil_code;
	}

	public String getOil_name() {
		return oil_name;
	}

	public void setOil_name(String oil_name) {
		this.oil_name = oil_name;
	}
	
	
	
}
