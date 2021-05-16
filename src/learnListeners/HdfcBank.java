package learnListeners;

import org.testng.Reporter;
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
	public void login(){
		System.out.println("HDFC Bank  ---> nevigateToLogin");
	}
	
	@AfterClass
	public void logout(){
		System.out.println("------------------------HDFC Bank  ---> logout--------------------");
	}

}
