package learnGroups;

import org.testng.annotations.Test;

public class Friday {
	
	@Test
	public void p(){
		System.out.println("Friday Class -----p method call-----");
	}
	
	@Test (groups={"Smoke"})
	public void q(){
		System.out.println("Friday Class -----q method call-----");
	}
	
	@Test (groups={"Smoke"})
	public void r(){
		System.out.println("Friday Class -----r method call-----");
	}

}
