package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class newclass {
	WebDriver cakes;
	
	@BeforeTest
	public void Setup()
	{
		cakes=new FirefoxDriver();
		cakes.get("file:///D:/ALOK/testingWebpage.html");
	}
	
	@Test
	public void Testcase()
	{
		pom2 obj=new pom2(cakes);
		obj.webpage("India","India");
		
	}
	@AfterTest
	public void over()
	{
		cakes.quit();
	}

}
