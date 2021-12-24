package com.sist.vo;

public class GasStationVO {
	private String station_no;
	private String station_name;
	private String station_addr_number;
	private String station_addr_road;
	private String station_phone;
	private String maintenance;
	private String carwash;
	private String quality_certification;
	private String conveniene_store;
	private int station_x;
	private int station_y;
	private int stock;
	private String amount_remain;
	private String brand_code;
	private String station_type_no;
	private int mgr_no;
	private int local_code;
	
	public GasStationVO(String station_no, String station_name, String station_addr_number, String station_addr_road,
			String station_phone, String maintenance, String carwash, String quality_certification,
			String conveniene_store, int station_x, int station_y, int stock, String amount_remain, String brand_code,
			String station_type_no, int mgr_no, int local_code) {
		super();
		this.station_no = station_no;
		this.station_name = station_name;
		this.station_addr_number = station_addr_number;
		this.station_addr_road = station_addr_road;
		this.station_phone = station_phone;
		this.maintenance = maintenance;
		this.carwash = carwash;
		this.quality_certification = quality_certification;
		this.conveniene_store = conveniene_store;
		this.station_x = station_x;
		this.station_y = station_y;
		this.stock = stock;
		this.amount_remain = amount_remain;
		this.brand_code = brand_code;
		this.station_type_no = station_type_no;
		this.mgr_no = mgr_no;
		this.local_code = local_code;
	}

	public GasStationVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getStation_no() {
		return station_no;
	}

	public void setStation_no(String station_no) {
		this.station_no = station_no;
	}

	public String getStation_name() {
		return station_name;
	}

	public void setStation_name(String station_name) {
		this.station_name = station_name;
	}

	public String getStation_addr_number() {
		return station_addr_number;
	}

	public void setStation_addr_number(String station_addr_number) {
		this.station_addr_number = station_addr_number;
	}

	public String getStation_addr_road() {
		return station_addr_road;
	}

	public void setStation_addr_road(String station_addr_road) {
		this.station_addr_road = station_addr_road;
	}

	public String getStation_phone() {
		return station_phone;
	}

	public void setStation_phone(String station_phone) {
		this.station_phone = station_phone;
	}

	public String getMaintenance() {
		return maintenance;
	}

	public void setMaintenance(String maintenance) {
		this.maintenance = maintenance;
	}

	public String getCarwash() {
		return carwash;
	}

	public void setCarwash(String carwash) {
		this.carwash = carwash;
	}

	public String getQuality_certification() {
		return quality_certification;
	}

	public void setQuality_certification(String quality_certification) {
		this.quality_certification = quality_certification;
	}

	public String getConveniene_store() {
		return conveniene_store;
	}

	public void setConveniene_store(String conveniene_store) {
		this.conveniene_store = conveniene_store;
	}

	public int getStation_x() {
		return station_x;
	}

	public void setStation_x(int station_x) {
		this.station_x = station_x;
	}

	public int getStation_y() {
		return station_y;
	}

	public void setStation_y(int station_y) {
		this.station_y = station_y;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getAmount_remain() {
		return amount_remain;
	}

	public void setAmount_remain(String amount_remain) {
		this.amount_remain = amount_remain;
	}

	public String getBrand_code() {
		return brand_code;
	}

	public void setBrand_code(String brand_code) {
		this.brand_code = brand_code;
	}

	public String getStation_type_no() {
		return station_type_no;
	}

	public void setStation_type_no(String station_type_no) {
		this.station_type_no = station_type_no;
	}

	public int getMgr_no() {
		return mgr_no;
	}

	public void setMgr_no(int mgr_no) {
		this.mgr_no = mgr_no;
	}

	public int getLocal_code() {
		return local_code;
	}

	public void setLocal_code(int local_code) {
		this.local_code = local_code;
	}
	
	
}
