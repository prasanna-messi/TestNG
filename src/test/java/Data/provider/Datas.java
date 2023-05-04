package Data.provider;

import org.testng.annotations.DataProvider;

public class Datas {

	@DataProvider(name="curry")		//dataprovider 
	public Object[][] datas() {
		Object [][] obj = new Object[][]{{"prasanna@gmail.com","prasanna123"},{"messi@gmail.com","messi123"}};
		
		return obj;
	}

}
