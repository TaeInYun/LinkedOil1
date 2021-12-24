package com.sist.vo;

public class MgrVO {
	private int mgr_no;
	private String mgr_id;
	private String mgr_pwd;
	
	public MgrVO(int mgr_no, String mgr_id, String mgr_pwd) {
		super();
		this.mgr_no = mgr_no;
		this.mgr_id = mgr_id;
		this.mgr_pwd = mgr_pwd;
	}

	public MgrVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getMgr_no() {
		return mgr_no;
	}

	public void setMgr_no(int mgr_no) {
		this.mgr_no = mgr_no;
	}

	public String getMgr_id() {
		return mgr_id;
	}

	public void setMgr_id(String mgr_id) {
		this.mgr_id = mgr_id;
	}

	public String getMgr_pwd() {
		return mgr_pwd;
	}

	public void setMgr_pwd(String mgr_pwd) {
		this.mgr_pwd = mgr_pwd;
	}
	
	
}
