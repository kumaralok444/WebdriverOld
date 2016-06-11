package priyaptng;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class alertbox {
	WebDriver driver;
	@BeforeTest
	public void red()
	
	{
		driver=new FirefoxDriver();
		driver.get("file:///C:/Users/7eleven1/Desktop/webdesigning/Trainning/javascript/indexNew.html");
		driver.manage().window().maximize();
	}
	@Test
	public void black()
	{
		WebElement usn,pass,enter;
		usn=driver.findElement(By.id("usr"));
		usn.clear();
		usn.sendKeys("alok");
		pass=driver.findElement(By.id("pass"));
		pass.clear();
		pass.sendKeys("alok");
		enter=driver.findElement(By.id("Sub"));
		enter.click();
		try
		{
			Alert mouse=driver.switchTo().alert();
			mouse.accept();
			String waterfall=mouse.getText();
			System.out.println(waterfall);
		}
		catch(Error e)
		{
			System.out.println("Incorrect coding");
		}
	}

}
