package learnAnnotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Foods {
	
	@Test
	public void donuts(){
		System.out.println("Foods Class -----@Test method call----donuts Method");
	}
	
	@Test
	public void momos(){
		System.out.println("Foods Class -----@Test method call----momos Method");
	}
	
	@Test
	public void maggi(){
		System.out.println("Foods Class -----@Test method call----maggi Method");
	}

	@BeforeClass
	public void highCalory(){
		System.out.println("Foods Class *****************Before Class Method call*****************");

	}
	
	@AfterClass
	public void afterEat(){
		System.out.println("Foods Class *****************After Class Method call*****************");

	}
	
	@BeforeMethod
	public void good(){
		System.out.println("Food Class  ******************Before Method call ********************");

	}
	
	@AfterMethod
	public void exercise(){
		System.out.println("Food Class  *******************After Method call **********************");

	}
}
