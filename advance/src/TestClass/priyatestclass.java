package TestClass;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class priyatestclass {

	WebDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new FirefoxDriver();
		driver.get("file:///D:/ALOK/WEBTechnology/computershop/index.html#");
		driver.manage().window().maximize();
	}
@Test(priority=1)
public void test1()
{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
}
	@Test(priority=2)
	public void test2()
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
	}
@AfterTest
public void close()
{
	//driver.quit();
}

}


