package swt;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class dp{
	
	
	public static void main(String args[])
	{
		WebDriver driver =new FirefoxDriver();
		driver.get("http://www.americangirl.com/");
		
		String title=driver.getTitle();
		System.out.println(title);
		WebElement contentsearch,search,link1;
		/*
		link1=driver.findElement(By.xpath(".//*[@id='mainHeader']/div/div[2]/div/ul/li[2]/a"));
		link1.click();
		contentsearch=driver.findElement(By.name("Ntt"));
		contentsearch.clear();
		contentsearch.sendKeys("girl of the year");
		
	    search=driver.findElement(By.xpath(".//*[@id='header']/div/div/form/div/a"));
	    search.click();
	    */
		String parentwindowId=driver.getWindowHandle();
		 driver.findElement(By.linkText("Shop")).click();
		    driver.findElement(By.linkText("Shop")).click();
		    driver.findElement(By.cssSelector("#ag-tab1 > a > img.img-responsive")).click();
		    driver.findElement(By.cssSelector("img[alt=\"No Image\"]")).click();
		    driver.findElement(By.id("WC_QuickInfo_Link_addtocart")).click();
		    driver.findElement(By.xpath("(//a[contains(text(),'Checkout')])[2]")).click();
		    driver.findElement(By.id("signIn")).click();
		    new Select(driver.findElement(By.id("birth_month"))).selectByVisibleText("January");
		    new Select(driver.findElement(By.id("birth_date"))).selectByVisibleText("1");
		    new Select(driver.findElement(By.id("birth_year"))).selectByVisibleText("1991");
		    driver.findElement(By.linkText("CONTINUE")).click();
	    /*
	    //link1=driver.findElement(By.id("MiniShoppingCart"));
	    driver.switchTo().frame(0);
	    search=driver.findElement(By.id("loadMiniShopCartCheckoutClickEvent"));
	    search.click();
	    Set<String> windowId=driver.getWindowHandles();
	    System.out.println(windowId);
	    Iterator<String> ite=windowId.iterator();
	    System.out.println(ite);
	    String subwindow=null;
	    int n=windowId.size();
	    System.out.println(n);
	    while(ite.hasNext())
	    {
	    subwindow=ite.next();	
	    }
	    System.out.println(subwindow);
	    driver.switchTo().window(subwindow);*/
	    
	    
	    
	    
	}
	    
	    
	    	    
		
				
		
	}
		
	
	
