package com.linkedoil.vo;

public class ChargerTypeVO {
	private int charger_type;
	private String charger_name;
	public ChargerTypeVO(int charger_type, String charger_name) {
		super();
		this.charger_type = charger_type;
		this.charger_name = charger_name;
	}
	public ChargerTypeVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCharger_type() {
		return charger_type;
	}
	public void setCharger_type(int charger_type) {
		this.charger_type = charger_type;
	}
	public String getCharger_name() {
		return charger_name;
	}
	public void setCharger_name(String charger_name) {
		this.charger_name = charger_name;
	}
	
	
}
