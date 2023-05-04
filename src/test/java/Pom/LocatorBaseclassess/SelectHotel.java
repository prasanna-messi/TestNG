package Pom.LocatorBaseclassess;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.module.BaseClass;

public class SelectHotel extends BaseClass{

	public SelectHotel() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@type='radio']")
	WebElement radiobutton;
	
	@FindBy(name="continue")
	WebElement next;

	public WebElement getRadiobutton() {
		return radiobutton;
	}

	public WebElement getNext() {
		return next;
	}
	
}
