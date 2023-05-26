package com.javacourse.project.hibernateAndJpa2.DataAccess;
import java.util.List;

import com.javacourse.project.hibernateAndJpa2.Entities.City;


public interface ICityDal {
	
	List<City> getAll();
	void add(City city);
	void update(City city);
	void delete (City city);
	City getByID(int id);	
	
	

}
