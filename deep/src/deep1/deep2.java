package deep1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class deep2
{
WebDriver driver;

@BeforeTest
public void setup()
{
}
@Test
public void test()
{
	driver=new FirefoxDriver();
	driver.get("http://www.demo.guru99.com/V4/");
	driver.manage().window().maximize();
	
}

@AfterTest
	public void test2()
	{
	//driver.quit();
	
	}

}

