package com.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//annotation
//@Component("database")
public class MsSqlCustomerDal implements ICustomerDal {
	@Value("${database.connectionString}")

	String connectionString;


	@Override
	public void add() {
		System.out.println("MsSql Veri tabanına eklendi.");
		System.out.println("connectionString : " + this.connectionString);

		
	}


	public String getConnectionString() {
		return connectionString;
	}


	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}

	
	
}
