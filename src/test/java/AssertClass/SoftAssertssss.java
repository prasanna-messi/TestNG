package AssertClass;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Base.module.BaseClass;
import Pom.LocatorBaseclassess.Login;

public class SoftAssertssss extends BaseClass {


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
	private void test() { //while we are using assert all that time only
				//failure mentioned in console otherwise failure will not display in console
		
		
		SoftAssert s = new SoftAssert(); //soft assert(to validate optional field)
		Login login = new Login();	
		s.assertTrue(printurl().contains("Hotel"), "url is verified");
		senddata(login.getUsername(), "prasannacurry" );
		senddata(login.getPassword(), "123456");
		String actual = login.callattribute(login.getPassword(), "value");
		s.assertEquals(actual, "123456", "password verified");
		click(login.getLogin());
		
		s.assertAll();//to highlight the failure

	}

}
