package TestClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SubClass {
	WebDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new FirefoxDriver();
		driver.get("file:///D:/ALOK/WEBTechnology/Trainning/3_level_responsive_drop_down_navigation_menu/3_level_responsive_drop_down_navigation_menu/index.htm");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
    @Test
    public void testCase1()
    {
    	Actions a=new Actions(driver);
    	WebElement menu,smenu1,smenu2;
    	menu=driver.findElement(By.linkText("Features"));
    	a.moveToElement(menu).build().perform();
    	smenu1=driver.findElement(By.linkText("4 Sliders"));
    	a.moveToElement(smenu1).build().perform();
    	
    	smenu2=driver.findElement(By.linkText("Lush slider"));
    	smenu2.click();
    	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    }
    @AfterTest
    public void tearDown()
    {
    	driver.quit();
    }

}
