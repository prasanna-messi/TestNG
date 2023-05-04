package AssertClass;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Base.module.BaseClass;
import Pom.LocatorBaseclassess.Login;

public class HardAssert extends BaseClass{

	@BeforeClass
	private void beforeclass() {
		Browserlaunch();
		maximize();
		loadurl("https://adactinhotelapp.com/");
	}
	@AfterClass
	private void afterclass() {
		String printtitle = printtitle();
		System.out.println(printtitle);
	}
	
	@Test
	private void test() {
		Login login = new Login();	//hard assert
		Assert.assertTrue(printurl().contains("hotel"), "url is verified");
		senddata(login.getUsername(), "prasannacurry" );
		senddata(login.getPassword(), "123456");
		String actual = login.callattribute(login.getPassword(), "value");
		Assert.assertEquals(actual, "123456", "password verified");
		click(login.getLogin());

	}
}
