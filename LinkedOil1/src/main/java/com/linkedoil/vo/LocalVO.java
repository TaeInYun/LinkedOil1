package com.sist.vo;

public class LocalVO {

	private int local_code; 
	private String local_name;
	
	public LocalVO(int local_code, String local_name) {
		super();
		this.local_code = local_code;
		this.local_name = local_name;
	}

	public LocalVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getLocal_code() {
		return local_code;
	}

	public void setLocal_code(int local_code) {
		this.local_code = local_code;
	}

	public String getLocal_name() {
		return local_name;
	}

	public void setLocal_name(String local_name) {
		this.local_name = local_name;
	}
	
	
	
}
