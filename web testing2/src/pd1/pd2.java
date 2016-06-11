package pd1;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class pd2 {
	
	public static void main(String args[])
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///D:/ALOK/WEBTechnology/computershop/index.html");
		WebElement cat,so,bt;
		
		so=driver.findElement(By.id("source"));
		Select se=new Select(so);
		se.selectByVisibleText("Laptops");
		
		cat=driver.findElement(By.id("nm"));
		cat.clear();
		cat.sendKeys("Dell");
		
		String parentWindowId=driver.getWindowHandle();

		
		bt=driver.findElement(By.id("btn"));
		bt.click();
		
		
		String subWindowHandler = null;
		
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		while(it.hasNext())
		{
			subWindowHandler=it.next();
		}
		driver.switchTo().window(subWindowHandler);
		so=driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div[2]/ul/li[1]/a"));
		so.click();
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
