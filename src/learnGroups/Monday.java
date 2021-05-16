package learnGroups;

import org.testng.annotations.Test;

public class Monday {
	
	@Test
	public void a(){
		System.out.println("Monday Class -----a method call-----");
	}
	
	@Test (groups={"Smoke"})
	public void b(){
		System.out.println("Monday Class -----b method call-----");
	}
	
	@Test
	public void c(){
		System.out.println("Monday Class -----c method call-----");
	}

}
