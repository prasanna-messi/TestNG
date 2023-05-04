package Pom.LocatorBaseclassess;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import Base.module.BaseClass;

public class SearchHotals extends BaseClass{

	public SearchHotals() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="location") //using findby find a locator
	private WebElement location;
	
	//FindBys working under AND Function | ata a time can't mention ID & Class  
	@FindBys({@FindBy(id="hotels"),@FindBy(xpath="(//select[@class='search_combobox'])[2]")})
	private WebElement hotels;
	
	//FindAll worked by OR condition based 
	@FindAll ({@FindBy(id="room_type"),@FindBy(name="room_type")})
	private WebElement roomtype;
	
	@CacheLookup //to clear the data from webelement and fill new data in finded element
	@FindBy(name="datepick_in")
	private WebElement checkin;
	
	@CacheLookup
	@FindBy(name="datepick_out")
	private WebElement checkout;
	
	@FindBy(id="room_nos")
	private  WebElement rooms;
	
	@FindBy(id="adult_room")
	private WebElement adults;
	
	@FindBy(id="child_room")
	private WebElement child;
	
	@FindBy(id="Submit")
	private WebElement submit;
	
	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getRooms() {
		return rooms;
	}

	public WebElement getCheckin() {
		return checkin;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getAdults() {
		return adults;
	}

	public WebElement getChild() {
		return child;
	}

	public WebElement getSubmit() {
		return submit;
	}
	
}
