package com.sist.vo;

import java.util.Date;

public class ReviewVO {

	private int re_no;
	private String re_content;
	private int asterion;
	private Date re_date;
	private int no;
	private int ev_id;
	private int station_no;
	private int review_count;
	public ReviewVO(int re_no, String re_content, int asterion, Date re_date, int no, int ev_id, int station_no,
			int review_count) {
		super();
		this.re_no = re_no;
		this.re_content = re_content;
		this.asterion = asterion;
		this.re_date = re_date;
		this.no = no;
		this.ev_id = ev_id;
		this.station_no = station_no;
		this.review_count = review_count;
	}
	public ReviewVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getRe_no() {
		return re_no;
	}
	public void setRe_no(int re_no) {
		this.re_no = re_no;
	}
	public String getRe_content() {
		return re_content;
	}
	public void setRe_content(String re_content) {
		this.re_content = re_content;
	}
	public int getAsterion() {
		return asterion;
	}
	public void setAsterion(int asterion) {
		this.asterion = asterion;
	}
	public Date getRe_date() {
		return re_date;
	}
	public void setRe_date(Date re_date) {
		this.re_date = re_date;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getEv_id() {
		return ev_id;
	}
	public void setEv_id(int ev_id) {
		this.ev_id = ev_id;
	}
	public int getStation_no() {
		return station_no;
	}
	public void setStation_no(int station_no) {
		this.station_no = station_no;
	}
	public int getReview_count() {
		return review_count;
	}
	public void setReview_count(int review_count) {
		this.review_count = review_count;
	}
	
	
	
}
