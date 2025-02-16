package com.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.model.Userservice;

@Component

public class UserserviceDAOImpl implements UserserviceDAO {
	
	List<Userservice> userservicelist=new ArrayList<>();
	

	@Override
	public boolean addUserservice(Userservice userservice) {
		// TODO Auto-generated method stub
		try {
			userservicelist.add(userservice);
			return true;
		}
		catch(Exception e) {
			return false;
		}
	}
}
