package learnHelperAttribute;

import org.testng.annotations.Test;

public class EnabledAndTimeout {

	@Test
	public void agra(){
		System.out.println("Place  ---> Agra");
	}
	
	//this test will not execute
	@Test(enabled=false)
	public void Gurgaon(){
		System.out.println("Place  ---> Gurgao");
	}
	
	//this test will take time 40 sec before throwing exception
	@Test(timeOut=4000)
	public void mumbai(){
		System.out.println("Place  ---> Mumbai");
	}
	
	@Test
	public void ballia(){
		System.out.println("Place  ---> Ballia");
	}
	
	@Test
	public void Delhi(){
		System.out.println("Place  ---> Delhi");
	}
	
}
