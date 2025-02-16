package com.model;

import java.util.List;

public class Subscription {
	private List<Userservice> userservicelist;
	public Subscription() {
		
	}
	public List<Userservice> getUserservicelist() {
		return userservicelist;
	}
	public void setUserservicelist(List<Userservice> userservicelist) {
		this.userservicelist = userservicelist;
	}
	@Override
	public String toString() {
		return "Subscription [userservicelist=" + userservicelist + "]";
	}

}
