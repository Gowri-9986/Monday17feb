package com.model;

public class Userservice {
	private int serviceid;
	private String servicename;
	private String servicetype;
	public Userservice() {
		
	}
	public int getServiceid() {
		return serviceid;
	}
	public void setServiceid(int serviceid) {
		this.serviceid = serviceid;
	}
	public String getServicename() {
		return servicename;
	}
	public void setServicename(String servicename) {
		this.servicename = servicename;
	}
	public String getServicetype() {
		return servicetype;
	}
	public void setServicetype(String servicetype) {
		this.servicetype = servicetype;
	}
	@Override
	public String toString() {
		return "Userservice [serviceid=" + serviceid + ", servicename=" + servicename + ", servicetype=" + servicetype
				+ "]";
	}
	

}
