package priya;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class priyanavigate {
	WebDriver driver;
	@BeforeTest
	public void India()
	{
		driver=new FirefoxDriver();
		driver.navigate().to("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
@Test
public void Rome()
{
	
	WebElement link1;
	link1=driver.findElement(By.linkText("your destination"));
	link1.click();
	driver.navigate().back();
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	driver.navigate().forward();
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
}
@AfterTest
public void Germany()
{
	driver.quit();
}
}