package com.javacourse.project.hibernateAndJpa.DataAccess;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.javacourse.project.hibernateAndJpa.Entities.City;
import org.hibernate.Session;





@Repository
// JPA - ORM STANDART OLARAK JPA İMPLEMENTASYONU OTOMATİK OLUYOR
public class HibernateCityDal implements ICityDal{
	
	private EntityManager entityManager;
	
	
	
	@Autowired
	public HibernateCityDal(EntityManager entityManager) {

		this.entityManager = entityManager;
	}

	//aop olayı aspcet oriented programming otomatik session açıp kapatmaya yarıyor. aşağıdaki transactional ile oluyo bu .
	@Override
	@Transactional
	public List<City> getAll() {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		List<City> cities = session.createQuery("from City",City.class).getResultList();
		return cities;
	}

	@Override
	public void add(City city) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void update(City city) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(City city) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
