package springIntro;

public class OracleCustomerDal implements ICustomerDal {
	String connectionString;


	
	public void add () {
		System.out.println("connectionString : " + this.connectionString);

		System.out.println("Oracle veritabanına eklendi");
		
	}



	public String getConnectionString() {
		return connectionString;
	}



	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}
	
}
