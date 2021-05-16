package learnHelperAttribute;

import org.testng.annotations.Test;

public class LearnDependsOnMethod {

	@Test
	public void cat(){
		System.out.println("Animal  --->  cat ");
	}
	
	@Test
	public void dog(){
		System.out.println("Animal  --->  dog");
	}
	
	@Test
	public void elephant(){
		System.out.println("Animal  --->  elephant");
	}
	

	@Test(dependsOnMethods = {"zebra","yak"} )
	public void tiger(){
		System.out.println("Animal  --->  tiger");
	}
	
	@Test
	public void zebra(){
		System.out.println("Animal  --->  zebra");
	}
	
	@Test
	public void yak(){
		System.out.println("Animal  --->  yak");
	}
}
