package com.sist.vo;

public class EvStationVO {

	private int ev_id;
	private String ev_name;
	private String ev_addr;
	private int ev_x;
	private int ev_y;
	private String oil_code;
	private int mgr_no;
	private int local_code;
	
	public EvStationVO(int ev_id, String ev_name, String ev_addr, int ev_x, int ev_y, String oil_code, int mgr_no,
			int local_code) {
		super();
		this.ev_id = ev_id;
		this.ev_name = ev_name;
		this.ev_addr = ev_addr;
		this.ev_x = ev_x;
		this.ev_y = ev_y;
		this.oil_code = oil_code;
		this.mgr_no = mgr_no;
		this.local_code = local_code;
	}

	public EvStationVO() {
		super();
		// TODO Auto-generated constructor stub
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

	public int getEv_x() {
		return ev_x;
	}

	public void setEv_x(int ev_x) {
		this.ev_x = ev_x;
	}

	public int getEv_y() {
		return ev_y;
	}

	public void setEv_y(int ev_y) {
		this.ev_y = ev_y;
	}

	public String getOil_code() {
		return oil_code;
	}

	public void setOil_code(String oil_code) {
		this.oil_code = oil_code;
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
