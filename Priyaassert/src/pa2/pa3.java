package pa2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class pa3 {
	
WebDriver driver;

@BeforeTest
public void SetUp()
{
	driver=new FirefoxDriver();
	driver.get("http://www.americangirl.com/");
}
@Test

public void link()
{
	WebElement btn,link1,btn2;
	link1=driver.findElement(By.linkText("Shop"));
	link1.click();
	btn=driver.findElement(By.id("search"));
	btn.sendKeys("dolls");
	btn2=driver.findElement(By.className("searchIcon"));
	}

@AfterTest

public void result()
{
	//driver.quit();
}
}
