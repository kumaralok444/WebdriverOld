package wd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test {
	public static void main(String args[])
	{
		WebDriver driver =new FirefoxDriver();
		driver.get("http://www.demo.guru99.com/V4/");
		driver.manage().window().maximize();
		WebElement user,passwd,signin,link1;
		user = driver.findElement(By.name("uid"));
		user.clear();
		user.sendKeys("mngr12669");
		
		passwd=driver.findElement(By.name("password"));
		passwd.clear();
		passwd.sendKeys("ytuqydU");
		
		signin=driver.findElement(By.name("btnLogin"));
		signin.click();
		
		link1=driver.findElement(By.xpath("html/body/div[2]/div/ul/li[5]/a"));
		link1.click();
	}

}
