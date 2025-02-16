package com.model;

import java.util.List;

public class CityBasedService {
	private List<Subscription> subcription;
	private List<City> city;
	public CityBasedService() {
		
	}
	public List<Subscription> getSubcription() {
		return subcription;
	}
	public void setSubcription(List<Subscription> subcription) {
		this.subcription = subcription;
	}
	public List<City> getCity() {
		return city;
	}
	public void setCity(List<City> city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "CityBasedService [subcription=" + subcription + ", city=" + city + "]";
	}

}
