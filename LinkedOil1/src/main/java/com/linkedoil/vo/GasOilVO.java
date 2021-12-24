package com.sist.vo;

import java.util.Date;

public class GasOilVO {

	private int gas_no;
	private String station_no;
	private Date oil_date;
	private int oil_price; 
	private String oil_code;
	public GasOilVO(int gas_no, String station_no, Date oil_date, int oil_price, String oil_code) {
		super();
		this.gas_no = gas_no;
		this.station_no = station_no;
		this.oil_date = oil_date;
		this.oil_price = oil_price;
		this.oil_code = oil_code;
	}
	public GasOilVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getGas_no() {
		return gas_no;
	}
	public void setGas_no(int gas_no) {
		this.gas_no = gas_no;
	}
	public String getStation_no() {
		return station_no;
	}
	public void setStation_no(String station_no) {
		this.station_no = station_no;
	}
	public Date getOil_date() {
		return oil_date;
	}
	public void setOil_date(Date oil_date) {
		this.oil_date = oil_date;
	}
	public int getOil_price() {
		return oil_price;
	}
	public void setOil_price(int oil_price) {
		this.oil_price = oil_price;
	}
	public String getOil_code() {
		return oil_code;
	}
	public void setOil_code(String oil_code) {
		this.oil_code = oil_code;
	}
	
	
}
