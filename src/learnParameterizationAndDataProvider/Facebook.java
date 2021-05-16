package learnParameterizationAndDataProvider;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Facebook {

	@Test
	public void launchURL() {
		System.out.println("Facebook  ---> launchURL");
	}

	@BeforeTest
	public void msg(){
		System.out.println("------------------Pass data through DataProvider-----------------Pass from  credentials from DataProvider methods------");
	}

	
	@Test
	@Parameters({"URL"})
	public void aaa(String url ) {
		System.out.println("Facebook  --->aaaa");
		System.out.println("aaaaa-->"+url);
	}
	
	
	@Test(dataProvider = "getData")
	public void login(String userName , String Password) {
		System.out.println("Facebook  ---> login with below Credentials");
		System.out.println(userName);
		System.out.println(Password);
	}

	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[3][2];
		data[0][0] = "FirstUser";
		data[0][1] = "FirstUserPwd";

		data[1][0] = "SecondUser";
		data[1][1] = "SecondUserPwd";

		data[2][0] = "ThirdUser";
		data[2][1] = "ThirdUserPwd";

		return data;
	}

}
