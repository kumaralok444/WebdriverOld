package test;
import static org.testng.Assert.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import POM.login1;

public class testingClass {
	WebDriver driver;
	login1 obj;
	@BeforeTest
	public void setup()
	{
		driver=new FirefoxDriver();
		driver.get("file:///D:/ALOK/testingWebpage.html");
	}
	@Test
	public void testCase()
	{
		obj=new login1(driver);
	
		obj.loginPage("hrithik", "hrithik");
	}
	

}
