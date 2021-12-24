package com.sist.vo;

public class LikeStationVO {

	private int like_no;
	private int ev_no;
	private int no;
	private String station_no;
	
	
	public LikeStationVO(int like_no, int ev_no, int no, String station_no) {
		super();
		this.like_no = like_no;
		this.ev_no = ev_no;
		this.no = no;
		this.station_no = station_no;
	}


	public LikeStationVO() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getLike_no() {
		return like_no;
	}


	public void setLike_no(int like_no) {
		this.like_no = like_no;
	}


	public int getEv_no() {
		return ev_no;
	}


	public void setEv_no(int ev_no) {
		this.ev_no = ev_no;
	}


	public int getNo() {
		return no;
	}


	public void setNo(int no) {
		this.no = no;
	}


	public String getStation_no() {
		return station_no;
	}


	public void setStation_no(String station_no) {
		this.station_no = station_no;
	}
	
	
	
}
