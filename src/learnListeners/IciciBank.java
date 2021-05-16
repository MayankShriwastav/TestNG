package learnListeners;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class IciciBank {

	@Test
	public void bankingBasics(){
		System.out.println();
		System.out.println();
		System.out.println("------------------------ICICI Bank -------------------- ---> ");
	}
	
	@Test
	public void launchURL(){
		System.out.println("ICICI Bank  ---> launchURL");
	}

	@Test
	public void login(){
		System.out.println("ICICI Bank  ---> login");
		Assert.assertTrue(false);
	}
	
	@Test
	public void logout(){
		System.out.println("------------------------ICICI Bank  ---> logout--------------------");
	}
	
}
