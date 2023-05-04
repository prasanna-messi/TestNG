package Data.provider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Base.module.BaseClass;
import Pom.LocatorBaseclassess.Login;

public class sample extends BaseClass {

	@Test(dataProvider="curry")
	private void test(String x,String y) {
		Browserlaunch();
		maximize();
		loadurl("https://adactinhotelapp.com/");
		Login login = new Login();
		senddata(login.getUsername(), x );
		senddata(login.getPassword(), y);
		click(login.getLogin());

}

	@DataProvider(name="curry")		//dataprovider 
	public Object[][] datas() {
		Object [][] obj = new Object[2][2];
		
		obj[0][0]="prasanna@gmail.com";
		obj[0][1]="prasanna123";
		
		obj[1][0]="messi@gmail.com";
		obj[1][1]="messi123";
		
		return obj;
	}
}
