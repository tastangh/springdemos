package com.springdemo;

public class CustomerManager implements ICustomerService {
	//yeni bir desen
	private ICustomerDal customerDal;
	
	
//	constructor injection
	public CustomerManager(ICustomerDal customerDal) {
//		super();
		this.customerDal = customerDal;
	}

	public void add( ) {
		// iş kuralları 
		//bütün şartlar sağlanıyorsa customerdal çağrılır.
		customerDal.add();
		
	}


}
