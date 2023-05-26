  package springIntro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		ICustomerService customerService = context.getBean("service",ICustomerService.class);
		
		customerService.add();
		
		
		
	}
	
	//		IoC - Inversion of Control 
	// 		ayağa kaldıran yapı Dependency Injection sql ve oracle new'lemeyi yapmamız bu ioc ise bunu otomatik yapması
	//		spagetti birbirine karışan kod olmamalı
	//	 	IoC ile birbirinin alternatifi işleri yazıyoruz.
	//		SOLID -> yeni bir özellik eklediğinde mevcut hiçbir koda dokunamazsın
	

}
