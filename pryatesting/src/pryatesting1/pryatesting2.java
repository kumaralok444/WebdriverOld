package pryatesting1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class pryatesting2 {
	WebDriver driver;
	@BeforeTest
	public void SetUp()
	{
		driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
	}

	@Test
	public void Test()
	{
		WebElement usn,pwd,login;
		usn=driver.findElement(By.name("userName"));
		usn.clear();
		usn.sendKeys("alok");
		pwd=driver.findElement(By.name("password"));
		pwd.clear();
		pwd.sendKeys("alok");
		login=driver.findElement(By.name("login"));
		login.click();
	}
	
	@AfterTest
	public void finish()
	{
		//driver.quit()
				
		
		
	}
}
