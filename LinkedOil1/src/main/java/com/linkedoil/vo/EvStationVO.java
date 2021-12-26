package com.linkedoil.vo;

public class EvStationVO {
	private	int	ev_id;
	private	String ev_name;
	private	String ev_addr;
	private	double	ev_x;	
	private	double	ev_y;	
	private	String oil_code;
	private	int	local_code;	
	private int mgr_no;

	public EvStationVO() {
		super();
		// TODO Auto-generated constructor stub
	}


	public EvStationVO(int ev_id, String ev_name, String ev_addr, double ev_x, double ev_y, String oil_code,
			int local_code, int mgr_no) {
		super();
		this.ev_id = ev_id;
		this.ev_name = ev_name;
		this.ev_addr = ev_addr;
		this.ev_x = ev_x;
		this.ev_y = ev_y;
		this.oil_code = oil_code;
		this.local_code = local_code;
		this.mgr_no = mgr_no;
	}



	public int getMgr_no() {
		return mgr_no;
	}


	public void setMgr_no(int mgr_no) {
		this.mgr_no = mgr_no;
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

	public double getEv_x() {
		return ev_x;
	}

	public void setEv_x(double ev_x) {
		this.ev_x = ev_x;
	}

	public double getEv_y() {
		return ev_y;
	}

	public void setEv_y(double ev_y) {
		this.ev_y = ev_y;
	}

	public String getOil_code() {
		return oil_code;
	}

	public void setOil_code(String oil_code) {
		this.oil_code = oil_code;
	}

	public int getLocal_code() {
		return local_code;
	}

	public void setLocal_code(int local_code) {
		this.local_code = local_code;
	}


	@Override
	public String toString() {
		return "EvStationVO [ev_id=" + ev_id + ", ev_name=" + ev_name + ", ev_addr=" + ev_addr + ", ev_x=" + ev_x
				+ ", ev_y=" + ev_y + ", oil_code=" + oil_code + ", local_code=" + local_code + ", mgr_no=" + mgr_no
				+ "]";
	}
	
	
}
