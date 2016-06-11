package NareshPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testTry {
	public static void main(String args[])
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.demo.guru99.com/V4/");
		driver.manage().window().maximize();
		
		WebElement uname,passwd,signin;
	
		uname = driver.findElement(By.name("uid"));
		uname.clear();
		uname.sendKeys("naresh");
		
		passwd = driver.findElement(By.name("password"));
		passwd.clear();
		passwd.sendKeys("ytuqydU");
		
	    
		 signin = driver.findElement(By.name("btnLogin"));
		 signin.click();
		 
		 
	}

}
