package priya;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class priyasubclass {
	WebDriver driver;
	@BeforeTest
	public void red()
	{
		driver=new FirefoxDriver();
		driver.get("file:///D:/ALOK/WEBTechnology/Trainning/3_level_responsive_drop_down_navigation_menu/3_level_responsive_drop_down_navigation_menu/index.htm");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
@Test()
public void pink()
{
	WebElement menu,menu1,menu2;
	Actions a=new Actions(driver);
	menu=driver.findElement(By.linkText("Features"));
	a.moveToElement(menu).build().perform();
	menu1=driver.findElement(By.linkText("4 Sliders"));
	a.moveToElement(menu1).build().perform();
	menu2=driver.findElement(By.linkText("Lush slider"));
	a.moveToElement(menu2).build().perform();
	menu2.click();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
}
@AfterTest
public void green()
{
	driver.quit();
}
}
