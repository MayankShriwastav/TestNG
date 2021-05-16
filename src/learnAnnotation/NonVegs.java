package learnAnnotation;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class NonVegs {
	
	@Test
	public void chicken(){
		System.out.println("NonVegs Class -----chicken Method");
	}
	
	@Test
	public void fish(){
		System.out.println("NonVegs Class -----fish Method");
	}
	
	@Test
	public void mutton(){
		System.out.println("NonVegs Class -----mutton Method");
	}

	@AfterSuite
	public void sweets(){
		System.out.println("NonVegs Class **********************After Suite Method call ******************");
	}
	
	@AfterTest
	public void icecream(){
		System.out.println("NonVegs Class **********************After Test Method call *******************");
	}
}
