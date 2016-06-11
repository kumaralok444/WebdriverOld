package TestClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class objectmove {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new FirefoxDriver();
		driver.navigate().to("http://jqueryui.com/slider/");
		driver.manage().window().maximize();
	}
	@Test
	public void testCase1() throws InterruptedException
	{
		WebElement slide;
		driver.switchTo().frame(0);  
		slide=driver.findElement(By.id("slider"));
		Actions act=new Actions(driver);  
		act.clickAndHold(slide).build().perform();
		//act.moveByOffset(200, 0);
	}

}
