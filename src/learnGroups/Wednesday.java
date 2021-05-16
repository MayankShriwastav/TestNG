package learnGroups;

import org.testng.annotations.Test;

public class Wednesday {
	
	@Test (groups={"Smoke"})
	public void g(){
		System.out.println("Wednesday Class -----g method call-----");
	}
	
	@Test
	public void h(){
		System.out.println("Wednesday Class -----h method call-----");
	}
	
	@Test
	public void i(){
		System.out.println("Wednesday Class -----i method call-----");
	}

}
