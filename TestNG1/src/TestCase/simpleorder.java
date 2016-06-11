package TestCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class simpleorder {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
      driver = new FirefoxDriver();
    	 driver.get("https://www.americangirl.com");
    	 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
 		 driver.manage().window().maximize();
	}
	@Test
	public void testcase()
	{
    	 WebElement dolls,caro,choose,acc,add,sb,chk,sc,mon;
//    	 Actions a =new Actions(driver);
    	 dolls=driver.findElement(By.xpath(".//*[@id='mainNav']/div/div[2]/ul[1]/li[2]/a"));
    	 dolls.click();
    	 caro=driver.findElement(By.xpath(".//*[@id='25512']/ul/li[2]/a"));
    	 caro.click();
    	 choose=driver.findElement(By.xpath(".//*[@id='caroline-page']/div[1]/div[1]/div[1]/a/img"));
    	 choose.click();
   	     acc=driver.findElement(By.xpath(".//*[@id='bundleCheckBox1']/label"));
   	     acc.click();   	 
         add=driver.findElement(By.xpath(".//*[@id='mainContent']/div[1]/div/div[4]/div[3]/div[2]/a"));
    	 add.click();
    	 sb=driver.findElement(By.xpath(".//*[@id='GoToShoppingBagLink']"));
    	 sb.click();
    	 chk=driver.findElement(By.xpath(".//*[@id='MattelShopCartOrderTotalsDetail']/div/div[2]/a"));
    	 chk.click();
    	 sc=driver.findElement(By.xpath(".//*[@id='signIn']"));
    	 sc.click();
    	 mon=driver.findElement(By.xpath(".//*[@id='birth_month']"));
    	 mon.click();
    	 driver.findElement(By.linkText("February")).click();
    	 
  //    	 mon=driver.findElement(By.xpath(".//*[@id='birth_month']"));
 //   	 a.moveToElement(mon).build().perform();
 //   	 driver.findElement(By.linkText("February")).click();
    	 //   	 ele=driver.findElement(By.linkText("Month"));
    	 //   	 Actions a =new Actions(driver);
    	 //   	 a.moveToElement(ele).build().perform();
    	 //   	 driver.findElement(By.linkText("February")).click();
    	 //   	 mon=driver.findElement(By.xpath(".//*[@id='birth_month']"));
//    	    	 mon.click();
//    			 mon=driver.findElement(By.linkText("Month"));
    	 
    	 
    	 
    	 
    	 
    	 
    	 
     }
}
