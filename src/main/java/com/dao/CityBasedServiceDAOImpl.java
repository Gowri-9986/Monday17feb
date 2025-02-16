package com.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.model.City;
import com.model.CityBasedService;

@Component
public class CityBasedServiceDAOImpl implements CityBasedServiceDAO {
	List<CityBasedService> CityBasedlist=new ArrayList<>();

	@Override
	public boolean addCityBasedService(CityBasedService citybasedservice) {
		// TODO Auto-generated method stub
		try {
			CityBasedlist.add(citybasedservice);
			return true;
		}
		catch(Exception e) {
		return false;
	}

}
}
