package learnParameterizationAndDataProvider;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class IciciBank {

	@BeforeClass
	public void bankingBasics(){
		System.out.println("------------------------ICICI Bank -------------------- ---> ");
	}
	
	@Test
	public void launchURL(){
		System.out.println("ICICI Bank  ---> launchURL");
	}

	@Test
	@Parameters({"uName","pwd"})
	public void login(String userName, String pass){
		System.out.println("ICICI Bank  ---> login");
		System.out.println(userName);
		System.out.println(pass);
	}
	
	@Test
	public void performOperation(){
		System.out.println("ICICI Bank  ---> performOperation");
	}

	
	
	@AfterClass
	public void logout(){
		System.out.println("------------------------ICICI Bank  ---> logout--------------------");
	}
	
	@BeforeTest
	public void msg(){
		System.out.println("---------------Pass data through Parameterization-----------------Pass URL and credentials from Xml------");
	}

}
