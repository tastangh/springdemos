package springIntro;

public class MsSqlCustomerDal implements ICustomerDal {
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
