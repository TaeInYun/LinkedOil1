package com.sist.vo;

import java.util.Date;

public class EvChargerVO {

	private int charger_no;
	private int charger_method_no;
	private int charger_status_code;
	private int charger_type;
	private String charger_name;
	private Date charger_time_renuewal;
	private int ev_id;
	
	public EvChargerVO(int charger_no, int charger_method_no, int charger_status_code, int charger_type,
			String charger_name, Date charger_time_renuewal, int ev_id) {
		super();
		this.charger_no = charger_no;
		this.charger_method_no = charger_method_no;
		this.charger_status_code = charger_status_code;
		this.charger_type = charger_type;
		this.charger_name = charger_name;
		this.charger_time_renuewal = charger_time_renuewal;
		this.ev_id = ev_id;
	}

	public EvChargerVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCharger_no() {
		return charger_no;
	}

	public void setCharger_no(int charger_no) {
		this.charger_no = charger_no;
	}

	public int getCharger_method_no() {
		return charger_method_no;
	}

	public void setCharger_method_no(int charger_method_no) {
		this.charger_method_no = charger_method_no;
	}

	public int getCharger_status_code() {
		return charger_status_code;
	}

	public void setCharger_status_code(int charger_status_code) {
		this.charger_status_code = charger_status_code;
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

	public Date getCharger_time_renuewal() {
		return charger_time_renuewal;
	}

	public void setCharger_time_renuewal(Date charger_time_renuewal) {
		this.charger_time_renuewal = charger_time_renuewal;
	}

	public int getEv_id() {
		return ev_id;
	}

	public void setEv_id(int ev_id) {
		this.ev_id = ev_id;
	}
	
	
	
}
