package wde;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testlog {
	
	public static void main(String args[])
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.demo.guru99.com/V4/");
		driver.manage().window().maximize();
		WebElement user,password,signin,link1;
		
		user = driver.findElement(By.name("uid"));
		user.clear();
		user.sendKeys("mngr12669");
		
		password = driver.findElement(By.name("password"));
		password.clear();
		password.sendKeys("ytuqydU");
		
		signin=driver.findElement(By.name("btnLogin"));
		signin.click();
		
		link1=driver.findElement(By.xpath("html/body/div[2]/div/ul/li[5]/a"));
		link1.click();
		
		
	}

}
