package Data.provider;

import org.testng.annotations.Test;

import Base.module.BaseClass;
import Pom.LocatorBaseclassess.Login;

public class Dataprovider extends BaseClass {

@Test(dataProvider="curry",dataProviderClass=Datas.class)
private void test(String x,String y) {
	Browserlaunch();
	maximize();
	loadurl("https://adactinhotelapp.com/");
	Login login = new Login();
	senddata(login.getUsername(), x );
	senddata(login.getPassword(), y);
	click(login.getLogin());
}

}
