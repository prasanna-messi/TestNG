package Base.module;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
private static final String String = null;
public static WebDriver driver;
public static WebDriver Browserlaunch() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	return driver;
}
public static void maximize() {
	driver.manage().window().maximize();
}
public String gettext(WebElement element) {
	
	String text = element.getText();
	return text;
}
public String printurl() {
	String url = driver.getCurrentUrl();
	return url;

}
public static String callattribute(WebElement element,String name) {
	String attribute = element.getAttribute(name);
	return attribute;
}
public String  printtitle() {
	
	String title = driver.getTitle();
	return title;

}
public void click(WebElement element) {
	element.click();
}

public void clear(WebElement element) {
	element.clear();

}
public static void close() {
	driver.close();

}
public static void loadurl(String url) {
	driver.get(url);
}
public void senddata(WebElement element,String keys) {
	element.sendKeys(keys);	
}

public void Selectusingtext(WebElement element,String text) {
	Select s = new Select(element);
	s.selectByVisibleText(text);
}
//wait class

public Timeouts timelag(int time) {
	Timeouts timeouts = driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	return timeouts;

}

}
