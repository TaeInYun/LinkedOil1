package com.sist.vo;

public class LikeOilVO {

	private int like_oil_no;
	private int no;
	private int oil_code;
	private int like_station_cnt;
	public LikeOilVO(int like_oil_no, int no, int oil_code, int like_station_cnt) {
		super();
		this.like_oil_no = like_oil_no;
		this.no = no;
		this.oil_code = oil_code;
		this.like_station_cnt = like_station_cnt;
	}
	public LikeOilVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getLike_oil_no() {
		return like_oil_no;
	}
	public void setLike_oil_no(int like_oil_no) {
		this.like_oil_no = like_oil_no;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getOil_code() {
		return oil_code;
	}
	public void setOil_code(int oil_code) {
		this.oil_code = oil_code;
	}
	public int getLike_station_cnt() {
		return like_station_cnt;
	}
	public void setLike_station_cnt(int like_station_cnt) {
		this.like_station_cnt = like_station_cnt;
	}
	
	
	
}
