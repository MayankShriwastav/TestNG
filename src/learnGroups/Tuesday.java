package learnGroups;

import org.testng.annotations.Test;

public class Tuesday {
	
	@Test
	public void d(){
		System.out.println("Tuesday Class -----d method call-----");
	}
	
	@Test
	public void e(){
		System.out.println("Tuesday Class -----e method call-----");
	}
	
	@Test (groups={"Smoke"})
	public void f(){
		System.out.println("Tuesday Class -----f method call-----");
	}

}
