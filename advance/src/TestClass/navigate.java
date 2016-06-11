package TestClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class navigate {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new FirefoxDriver();
		driver.navigate().to("http://newtours.demoaut.com/");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
    @Test
    public void test1()
    {
    	WebElement link1;
    	link1=driver.findElement(By.linkText("your destination"));
    	link1.click();
    	driver.navigate().back();
    	driver.navigate().forward();
    	
    }
}
