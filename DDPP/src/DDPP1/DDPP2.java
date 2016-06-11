package DDPP1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DDPP2 {
	public static void main(String args[])
	
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///D:/ALOK/WEBTechnology/computershop/index.html");
		WebElement so,bt,login;
		so=driver.findElement(By.id("source"));
		Select se=new Select(so);
		se.selectByVisibleText("Laptops");
		
		bt=driver.findElement(By.id("nm"));
		bt.clear();
		bt.sendKeys("Dell");
		
		String parentWindowID=driver.getWindowHandle();
		System.out.println(parentWindowID);
		
		login=driver.findElement(By.id("btn"));
		login.click();
		
		String subwindowhandler=null;
		
		Set<String> handles=driver.getWindowHandles();
		System.out.println(handles);
		Iterator<String> it = handles.iterator();
		while(it.hasNext())
		{
			subwindowhandler=it.next();
								
		}
		driver.switchTo().window(subwindowhandler);
		
		bt=driver.findElement(By.linkText("Laptops"));
		bt.click();
		
		
		driver.switchTo().window(parentWindowID);
		so=driver.findElement(By.id("source"));
		Select se1=new Select(so);
		se1.selectByVisibleText("Laptops");
		
		bt=driver.findElement(By.id("nm"));
		bt.clear();
		bt.sendKeys("Dell");
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
