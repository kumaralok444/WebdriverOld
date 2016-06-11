package TestClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class dragandDrop {
   WebDriver driver;
   @BeforeTest
   public void setup()
    {
     driver=new FirefoxDriver();
     driver.get("http://jqueryui.com/droppable/");
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);  
	 driver.manage().window().maximize();
    }
   @Test
   public void testCase1()
   {
	   driver.switchTo().frame(0);  
	   WebElement source,desti;
	   source=driver.findElement(By.id("draggable"));
	   desti=driver.findElement(By.id("droppable"));
	   Actions a=new Actions(driver);
	   a.dragAndDrop(source, desti).build().perform();
	   
   }
}
