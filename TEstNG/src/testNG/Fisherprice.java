package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Fisherprice {
		   WebDriver driver;
		   @BeforeTest
		   public void setup()
		    {
		     driver=new FirefoxDriver();
		     driver.get("http://www.fisher-price.com");
			 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);  
			 driver.manage().window().maximize();
		    }
		   @Test
		   public void testCase1()
		   {
			   WebElement site,prod,AGE,indimg,addtocart,checkout;
			   site=driver.findElement(By.xpath(".//*[@id='brandbackground']/div/div[1]/div/ul[2]/li[2]/a"));
			   site.click();
			   prod=driver.findElement(By.xpath(".//*[@id='main-nav-list']/li[1]/a"));
			   prod.click();
               AGE=driver.findElement(By.xpath(".//*[@id='product-subMenus']/div[1]/ul/li[5]/a"));
               AGE.click();
               indimg=driver.findElement(By.xpath(".//*[@id='78610']/a/img"));
               indimg.click();
               addtocart=driver.findElement(By.xpath(".//*[@id='product-detail-wrapper']/div[1]/section[1]/div/div[2]/div[3]/a[1]/span"));
               addtocart.click();
               checkout=driver.findElement(By.xpath(".//*[@id='MattelShopCartOrderTotalsDetail']/div/div/div/div/div[1]/a"));
               checkout.click();
               
		   }               
               
					   
			   
			 
		}



