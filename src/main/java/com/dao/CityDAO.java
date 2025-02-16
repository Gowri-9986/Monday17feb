package com.dao;

import org.springframework.stereotype.Repository;

import com.model.City;

@Repository
public interface CityDAO {
	public boolean addCity(City city);

}
