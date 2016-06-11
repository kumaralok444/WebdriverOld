package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;

public class selectfrmdropdown {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
	 driver=new FirefoxDriver();
	driver.get("file:///D:/ALOK/WEBTechnology/Trainning/3_level_responsive_drop_down_navigation_menu/3_level_responsive_drop_down_navigation_menu/index.htm");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	}
	@Test
	public void Testcase1()
	{
	Actions a=new Actions(driver);
	WebElement option,option1;
	option=driver.findElement(By.linkText("Features"));
	a.moveToElement(option).build().perform();       
	option1=driver.findElement(By.linkText("4 Sliders"));
	a.moveToElement(option1).build().perform();
    driver.findElement(By.linkText("Lush slider")).click();
	}

}
