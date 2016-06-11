package assert2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class assert3 {
    WebDriver driver;
	@BeforeTest
	public void setUp(){
	driver=new FirefoxDriver();
	driver.get("http://newtours.demoaut.com/");
	
	}
	@Test
	public void testCase(){
		WebElement unm,pwd,btn;
		unm=driver.findElement(By.name("userName"));
		unm.clear();
		unm.sendKeys("alok");
		pwd=driver.findElement(By.name("password"));
		pwd.clear();
		pwd.sendKeys("alok");
		btn=driver.findElement(By.name("login"));
		btn.click();
		String title=driver.getTitle();
		Assert.assertEquals(title, "Find a Flight: Mercury Tours:");
	}
	@AfterTest
	public void tearDown()
	{
		
	
	}

}
