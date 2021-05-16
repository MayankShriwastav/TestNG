package learnAnnotation;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Vegitable {
	
	@Test
	public void beans(){
		System.out.println("vegitable Class -----beans Method");
	}
	
	@Test
	public void calliflower(){
		System.out.println("vegitable Class -----calliflower Method");
	}
	
	@Test
	public void tomatto(){
		System.out.println("vegitable Class -----tomatto Method");
	}

	@BeforeSuite
	public void bfSuite(){
		System.out.println("vegitable Class *************************************Before Suite Method call *******************");
	}
	
	@BeforeTest
	public void bfTest(){
		System.out.println("vegitable Class *************************************Before Test Method call ********************");
	}
}
