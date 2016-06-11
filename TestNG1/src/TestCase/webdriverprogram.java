package TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;


public class webdriverprogram {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
	    driver =new FirefoxDriver();
		driver.get("file:///D:/ALOK/testingWebpage.html");
		driver.manage().window().maximize();
	}
	@Test
	public void testcase1()
	{
		WebElement uname,pass,m,login;
		uname=driver.findElement(By.id("username"));
		uname.sendKeys("india");
		pass=driver.findElement(By.id("password"));
		pass.sendKeys("password");
		m=driver.findElement(By.id("m"));
		m.click();
		login=driver.findElement(By.name("login"));
		login.click();
		
	}
	@AfterTest
	public void close()
	{
	driver.close();	
	}

}
