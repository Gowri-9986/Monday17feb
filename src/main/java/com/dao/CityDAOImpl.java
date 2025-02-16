package com.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.model.City;
@Component

public class CityDAOImpl implements CityDAO {
	List<City> citylist=new ArrayList<>();
	@Override
	public boolean addCity(City city) {
		// TODO Auto-generated method stub
		try {
			citylist.add(city);
			return true;
		}
		catch(Exception e){
		return false;
	}

}
}
