package com.dao;

import org.springframework.stereotype.Repository;

import com.model.CityBasedService;

@Repository
public interface CityBasedServiceDAO {
	public boolean addCityBasedService(CityBasedService citybasedservice);

}
