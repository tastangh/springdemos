package com.javacourse.project.hibernateAndJpa2.Business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.javacourse.project.hibernateAndJpa2.DataAccess.ICityDal;
import com.javacourse.project.hibernateAndJpa2.Entities.City;


@Service
public class CityManager implements ICityService{
	
	
	private ICityDal cityDal;
	
	//sen git otomatik olarak icity dal a bak. uygun bişi varsa onu ver.
	@Autowired  
	public CityManager(ICityDal cityDal) {
		this.cityDal = cityDal;
	}

	//buraya da transactional koyma sebebi data acces ile burası farklı burası business katmanı
	@Override
	@Transactional
	public List<City> getAll() {
		// TODO Auto-generated method stub
		return this.cityDal.getAll();
	}

	@Override
	@Transactional
	public void add(City city) {
		
		// buraya iff else li gereksinimli iş kodları yazılır
		this.cityDal.add(city);
	}

	@Override
	@Transactional
	public void update(City city) {
		this.cityDal.update(city);
		
	}

	@Override
	@Transactional
	public void delete(City city) {
		this.cityDal.delete(city);
		
	}

	@Override
	public City getById(int id) {
		return this.cityDal.getByID(id);
	}
	
	

}
