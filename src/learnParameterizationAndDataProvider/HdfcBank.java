package learnParameterizationAndDataProvider;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class HdfcBank {
	
	@BeforeClass
	public void bankingBasics(){
		System.out.println("------------------------HDFC Bank -------------------- ---> ");
	}
	
	@Test
	public void launchURL(){
		System.out.println("HDFC Bank  ---> launchURL");
	}

	@Test
	@Parameters({"uName","pwd"})
	public void login(String userName, String pass){
		System.out.println("HDFC Bank  ---> nevigateToLogin");
		System.out.println(userName);
		System.out.println(pass);
	}

	
	@AfterClass
	public void logout(){
		System.out.println("------------------------HDFC Bank  ---> logout--------------------");
	}

}
