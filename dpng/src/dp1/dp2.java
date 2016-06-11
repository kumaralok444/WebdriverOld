package dp1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class dp2 {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
	
	}
	
	
	@Test
	public void testcase()
	{
		driver=new FirefoxDriver();
		driver.get("http://www.demo.guru99.com/V4/");
	}
	
	
	@AfterTest
	public void alok()
	{
	driver.quit();	
	System.out.println("Alok");
	}

}
