package cheating;

import com.thoughtworks.selenium.Selenium;
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;

import org.openqa.selenium.*;
import org.openqa.selenium.htmlunit.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.ie.*;
import org.testng.annotations.*;

import static org.testng.Assert.*;

public class aaaa {

	WebDriver driver;
	Selenium selenium;

	@BeforeMethod
	public void startSelenium() {
		driver = new FirefoxDriver();
		selenium = new WebDriverBackedSelenium(driver, "file:///D:/ALOK/WEBTechnology/computershop/index.html");
	}

	@AfterMethod
	public void stopSelenium() {
		driver.close();
	}

	@Test
	public void testUntitled() {
		selenium.open("file:///D:/ALOK/WEBTechnology/computershop/index.html");
		selenium.select("id=source", "label=Monitors");
		selenium.type("id=nm", "dell");
		selenium.click("id=btn");
		selenium.waitForPopUp("", "30000");
	}

}
