package Pom.LocatorBaseclassess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.module.BaseClass;

public class OrderCopy extends BaseClass {

	public OrderCopy() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="order_no")
	private WebElement ordernum;

	public WebElement getOrdernum() {
		return ordernum;
	}
	

}
