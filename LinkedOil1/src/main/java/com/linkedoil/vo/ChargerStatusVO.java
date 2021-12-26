package com.linkedoil.vo;

public class ChargerStatusVO {
	private int charger_status_code;
	private String charger_status_name;
	public ChargerStatusVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ChargerStatusVO(int charger_status_code, String charger_status_name) {
		super();
		this.charger_status_code = charger_status_code;
		this.charger_status_name = charger_status_name;
	}
	public int getCharger_status_code() {
		return charger_status_code;
	}
	public void setCharger_status_code(int charger_status_code) {
		this.charger_status_code = charger_status_code;
	}
	public String getCharger_status_name() {
		return charger_status_name;
	}
	public void setCharger_status_name(String charger_status_name) {
		this.charger_status_name = charger_status_name;
	}
	
	
}
