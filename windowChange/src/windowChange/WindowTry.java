package windowChange;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class WindowTry {
	private static final boolean String = false;

	public static void main(String args[])
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///D:/ALOK/WEBTechnology/computershop/index.html");
		driver.manage().window().maximize();
		WebElement so,cat,bt;
		
		so=driver.findElement(By.id("source"));
		Select se=new Select(so);
		se.selectByVisibleText("Laptops");
	
		
		cat=driver.findElement(By.id("nm"));
		cat.clear();
		cat.sendKeys("Dell");
		
		//String parentWindowId = driver.getWindowHandle();
		//System.out.println("Parent Window"+parentWindowId);
		
		bt=driver.findElement(By.id("btn"));
		bt.click();
		
		String subWindowHandler = null;
		Set<String> handles = driver.getWindowHandles();
		System.out.println(handles);
		Iterator<String> it = handles.iterator();
		System.out.println(it);
		while (it.hasNext()){
			
         subWindowHandler = it.next();
		}
		System.out.println(subWindowHandler);
		
		driver.switchTo().window(subWindowHandler);
		//driver.switchTo().window(parentWindowId);
		so=driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div[2]/ul/li[1]/a"));
		so.click();
	}

}
