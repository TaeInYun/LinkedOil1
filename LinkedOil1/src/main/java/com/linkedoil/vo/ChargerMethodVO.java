package com.linkedoil.vo;

public class ChargerMethodVO {
	private int charger_method_no;
	private String charger_method_name;
	
	public ChargerMethodVO(int charger_method_no, String charger_method_name) {
		super();
		this.charger_method_no = charger_method_no;
		this.charger_method_name = charger_method_name;
	}
	public ChargerMethodVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCharger_method_no() {
		return charger_method_no;
	}
	public void setCharger_method_no(int charger_method_no) {
		this.charger_method_no = charger_method_no;
	}
	public String getCharger_method_name() {
		return charger_method_name;
	}
	public void setCharger_method_name(String charger_method_name) {
		this.charger_method_name = charger_method_name;
	}
	
	
}
