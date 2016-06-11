package priyaptng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

public class testng {
	private WebDriver driver;
	@BeforeTest
	public void Setup()
	{
	driver = new FirefoxDriver();		
	}
	@Test
	public void priya()
	{
		WebElement btn1,btn2,se;
		driver.get("file:///D:/ALOK/WEBTechnology/computershop/index.html");
		se=driver.findElement(By.id("source"));
		Select rasagula=new Select(se);
		rasagula.selectByVisibleText("Tablets");
		btn1=driver.findElement(By.id("nm"));
		btn1.clear();
		btn1.sendKeys("Dell");
		btn2=driver.findElement(By.id("btn"));
		btn2.click();	
		}
	@AfterTest
	public void quit()
	{
		driver.quit();
		
	}
}

