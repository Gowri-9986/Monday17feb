package com.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="ItemRecords")
public class Item {
	@Id
	private String Itemid;
	private String Itemname;
	private boolean Batched;
	
	private int dateofmanufacturing;
	public Item() {
		
	}
	public String getItemid() {
		return Itemid;
	}
	public void setItemid(String itemid) {
		Itemid = itemid;
	}
	public String getItemname() {
		return Itemname;
	}
	public void setItemname(String itemname) {
		Itemname = itemname;
	}
	public boolean isBatched() {
		return Batched;
	}
	public void setBatched(boolean batched) {
		Batched = batched;
	}
	public int getDateofmanufacturing() {
		return dateofmanufacturing;
	}
	public void setDateofmanufacturing(int i) {
		this.dateofmanufacturing = i;
	}
	@Override
	public String toString() {
		return "Item [Itemid=" + Itemid + ", Itemname=" + Itemname + ", Batched=" + Batched + ", dateofmanufacturing="
				+ dateofmanufacturing + "]";
	}
	

}
