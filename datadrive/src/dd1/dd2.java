package dd1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.gargoylesoftware.htmlunit.javascript.host.Window;

public class dd2 {
	
	public static void main(String args[])
	{
		WebDriver driver=new FirefoxDriver();
		WebElement search,btn,enter,search2;
		driver.get("file:///D:/ALOK/WEBTechnology/computershop/index.html");
		
		
		search=driver.findElement(By.id("source"));
		Select se=new Select(search);
		se.selectByVisibleText("Monitor");
		
		btn=driver.findElement(By.id("nm"));
		btn.clear();
		btn.sendKeys("dell");
		
		String parentWindowid=driver.getWindowHandle();
		System.out.println("Parent Window"+parentWindowid);
		enter=driver.findElement(By.id("btn"));
		btn.click();
		
		String subWindowHandler=null;
		Set<String>handles=driver.getWindowHandles();
		Iterator<String>it=handles.iterator();	
		while(it.hasNext())
		{
			subWindowHandler=it.next();
		}
		driver.switchTo().window(subWindowHandler);
		
		search2=driver.findElement(By.id("source"));
		Select se1=new Select(search2);
		se1.selectByVisibleText("Laptop");
		
	}
		
		
		
		
		
		
	

}
