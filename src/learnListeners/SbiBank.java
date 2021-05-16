package learnListeners;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SbiBank {
	
	@Test
	public void bankingBasics(){
		System.out.println("------------------------SBI Bank -------------------- ---> ");
	}
	
	@Test
	public void launchURL(){
		System.out.println("SBI Bank  ---> launchURL");
	}
	
	@Test
	public void login(){
		System.out.println("SBI Bank  ---> login");
	}
	
	
	@Test
	public void logout(){
		System.out.println("------------------------SBI Bank  ---> logout--------------------");
	}

}
