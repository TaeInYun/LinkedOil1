package com.sist.vo;

public class ChargerTypeVO {

	private int charger_type;
	private String charger_type_name;
	
	public ChargerTypeVO(int charger_type, String charger_type_name) {
		super();
		this.charger_type = charger_type;
		this.charger_type_name = charger_type_name;
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

	public String getCharger_type_name() {
		return charger_type_name;
	}

	public void setCharger_type_name(String charger_type_name) {
		this.charger_type_name = charger_type_name;
	}
	
	
}
