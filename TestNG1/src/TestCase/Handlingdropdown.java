package TestCase;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Handlingdropdown {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new FirefoxDriver();
		driver.get("file:///D:/ALOK/WEBTechnology/index%20%282%29.html");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	@Test
	public void testcase()
	{
		Actions a=new Actions(driver);
		WebElement option,option1;
		option=driver.findElement(By.linkText("Tab 2"));
		a.moveToElement(option).build().perform();
		option1=driver.findElement(By.linkText("Sub Tab 1"));
		a.moveToElement(option1).build().perform();
		driver.findElement(By.linkText("Subm Tab 1")).click();
	}

		
	}

