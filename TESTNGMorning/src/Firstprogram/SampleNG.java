package Firstprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class SampleNG {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new FirefoxDriver();
		driver.get("file:///D:/ALOK/testingWebpage.html");
		driver.manage().window().maximize();
	}
	@Test
	public void testcase()
	{
		WebElement uname,pass,m,login;
		uname=driver.findElement(By.id("username"));
		uname.sendKeys("india");
		pass=driver.findElement(By.id("password"));
		pass.sendKeys("pass123");
		m=driver.findElement(By.id("m"));
		m.click();
		login=driver.findElement(By.name("login"));
		login.click();
	}
	
	@AfterTest
	public void close()
	{
	  driver.quit();
	}
	
}