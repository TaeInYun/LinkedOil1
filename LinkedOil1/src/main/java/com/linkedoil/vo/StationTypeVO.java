package com.sist.vo;

public class StationTypeVO {

	private String station_type_no;
	private String station_type_name;
	
	public StationTypeVO(String station_type_no, String station_type_name) {
		super();
		this.station_type_no = station_type_no;
		this.station_type_name = station_type_name;
	}

	public StationTypeVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getStation_type_no() {
		return station_type_no;
	}

	public void setStation_type_no(String station_type_no) {
		this.station_type_no = station_type_no;
	}

	public String getStation_type_name() {
		return station_type_name;
	}

	public void setStation_type_name(String station_type_name) {
		this.station_type_name = station_type_name;
	}
	
	
}
