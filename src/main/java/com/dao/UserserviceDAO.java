package com.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.model.Userservice;
@Repository
public interface UserserviceDAO {
	public boolean addUserservice(Userservice userservice);
	

}
