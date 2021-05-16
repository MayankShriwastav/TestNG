package learnParameterizationAndDataProvider;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SbiBank {
	
	@BeforeClass
	public void bankingBasics(){
		System.out.println("------------------------SBI Bank -------------------- ---> ");
	}
	
	@Parameters({"URL"})
	@Test
	public void launchURL(String url){
		System.out.println("SBI Bank  ---> launchURL");
		System.out.println(url);
	}
	
	@Test
	@Parameters({"uName","pwd"})
	public void login(String userName, String pass){
		System.out.println("SBI Bank  ---> login");
		System.out.println(userName);
		System.out.println(pass);
	}
	
	@Test
	public void performOperation(){
		System.out.println("SBI Bank  ---> performOperation");
	}
	
	@AfterClass
	public void logout(){
		System.out.println("------------------------SBI Bank  ---> logout--------------------");
	}

}
