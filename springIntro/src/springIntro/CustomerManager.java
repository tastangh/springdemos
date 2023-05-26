package springIntro;

public class CustomerManager implements ICustomerService {
	//yeni bir desen
	private ICustomerDal customerDal;
	
	
	//constructor injection
//	public CustomerManager(ICustomerDal customerDal) {
//		super();
//		this.customerDal = customerDal;
//	}

	public void add( ) {
		// iş kuralları 
		//bütün şartlar sağlanıyorsa customerdal çağrılır.
		customerDal.add();
		
	}

//setter injection --> constructor daha iyidir ama bu da var
	public void setCustomerDal(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}

}
