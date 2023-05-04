package Pom.LocatorBaseclassess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.module.BaseClass;

public class BookAHotel extends BaseClass{

	public BookAHotel() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="first_name")
	private WebElement firstname;
	
	@FindBy(name="last_name")
	private WebElement lastname;
	
	@FindBy(id="address")
	private WebElement adress;
	
	@FindBy(name="cc_num")
	private WebElement cardnum;
	
	@FindBy(id="cc_type")
	private WebElement cardType;
	
	@FindBy(name="cc_exp_month")
	private WebElement expiremonth;
	
	@FindBy(name="cc_exp_year")
	private WebElement expireyear;
	
	@FindBy(name="cc_cvv")
	private WebElement cvv;
	
	public WebElement getCvv() {
		return cvv;
	}


	@FindBy(id="book_now")
	private WebElement next;

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAdress() {
		return adress;
	}

	public WebElement getCardnum() {
		return cardnum;
	}

	public WebElement getCardType() {
		return cardType;
	}

	public WebElement getExpiremonth() {
		return expiremonth;
	}

	public WebElement getExpireyear() {
		return expireyear;
	}

	public WebElement getNext() {
		return next;
	}

	
	
	
	
	
}
