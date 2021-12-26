package com.linkedoil.vo;

import java.util.Date;

public class SearchStationVO {
	private	String station_name	;
	private	String amount_remain;	
	private	int	oil_price	;
	private	int	stock	;
	private	Date oil_date;	
	private	String	oil_code;	
	private	String	brand_code;	
	private	int	ev_id	;
	private	String	ev_name;	
	private	String	ev_addr	;
	private	String	ev_price;	
	private	int	no	;
	private	int	review_cnt;	
	private	double	asterion_avg;	
	private	int	quick_charge_cnt ;	
	private	int	slow_charge_cnt;	
	private	int	oil_price_avg ;	
	private	int	oil_price_min ;
	
	public SearchStationVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public SearchStationVO(String station_name, String amount_remain, int oil_price, int stock, Date oil_date,
			String oil_code, String brand_code, int ev_id, String ev_name, String ev_addr, String ev_price, int no,
			int review_cnt, double asterion_avg, int quick_charge_cnt, int slow_charge_cnt, int oil_price_avg,
			int oil_price_min) {
		super();
		this.station_name = station_name;
		this.amount_remain = amount_remain;
		this.oil_price = oil_price;
		this.stock = stock;
		this.oil_date = oil_date;
		this.oil_code = oil_code;
		this.brand_code = brand_code;
		this.ev_id = ev_id;
		this.ev_name = ev_name;
		this.ev_addr = ev_addr;
		this.ev_price = ev_price;
		this.no = no;
		this.review_cnt = review_cnt;
		this.asterion_avg = asterion_avg;
		this.quick_charge_cnt = quick_charge_cnt;
		this.slow_charge_cnt = slow_charge_cnt;
		this.oil_price_avg = oil_price_avg;
		this.oil_price_min = oil_price_min;
	}

	public String getStation_name() {
		return station_name;
	}
	public void setStation_name(String station_name) {
		this.station_name = station_name;
	}
	public String getAmount_remain() {
		return amount_remain;
	}
	public void setAmount_remain(String amount_remain) {
		this.amount_remain = amount_remain;
	}
	public int getOil_price() {
		return oil_price;
	}
	public void setOil_price(int oil_price) {
		this.oil_price = oil_price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public Date getOil_date() {
		return oil_date;
	}
	public void setOil_date(Date oil_date) {
		this.oil_date = oil_date;
	}
	public String getOil_code() {
		return oil_code;
	}
	public void setOil_code(String oil_code) {
		this.oil_code = oil_code;
	}
	public String getBrand_code() {
		return brand_code;
	}
	public void setBrand_code(String brand_code) {
		this.brand_code = brand_code;
	}
	public int getEv_id() {
		return ev_id;
	}
	public void setEv_id(int ev_id) {
		this.ev_id = ev_id;
	}
	public String getEv_name() {
		return ev_name;
	}
	public void setEv_name(String ev_name) {
		this.ev_name = ev_name;
	}
	public String getEv_addr() {
		return ev_addr;
	}
	public void setEv_addr(String ev_addr) {
		this.ev_addr = ev_addr;
	}
	public String getEv_price() {
		return ev_price;
	}
	public void setEv_price(String ev_price) {
		this.ev_price = ev_price;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getReview_cnt() {
		return review_cnt;
	}
	public void setReview_cnt(int review_cnt) {
		this.review_cnt = review_cnt;
	}
	public double getAsterion_avg() {
		return asterion_avg;
	}
	public void setAsterion_avg(double asterion_avg) {
		this.asterion_avg = asterion_avg;
	}
	public int getQuick_charge_cnt() {
		return quick_charge_cnt;
	}
	public void setQuick_charge_cnt(int quick_charge_cnt) {
		this.quick_charge_cnt = quick_charge_cnt;
	}
	public int getSlow_charge_cnt() {
		return slow_charge_cnt;
	}
	public void setSlow_charge_cnt(int slow_charge_cnt) {
		this.slow_charge_cnt = slow_charge_cnt;
	}
	public int getOil_price_avg() {
		return oil_price_avg;
	}
	public void setOil_price_avg(int oil_price_avg) {
		this.oil_price_avg = oil_price_avg;
	}
	public int getOil_price_min() {
		return oil_price_min;
	}
	public void setOil_price_min(int oil_price_min) {
		this.oil_price_min = oil_price_min;
	}
	
	
}
