package com.model;

public class City {
	private String cityname;
	private String state;
	private int pincode;
	public City() {
		
	}
	public String getCityname() {
		return cityname;
	}
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "City [cityname=" + cityname + ", state=" + state + ", pincode=" + pincode + "]";
	}

}
