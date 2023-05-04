package Prameters.pass;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Base.module.BaseClass;
import Pom.LocatorBaseclassess.Login;

public class Task extends BaseClass{

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
	@Parameters({"userName","password"}) //passing parameters
	@Test
	private void test(String x,String y) {
		Login login = new Login();
		senddata(login.getUsername(), x );
		senddata(login.getPassword(), y);
		click(login.getLogin());

	}
}
