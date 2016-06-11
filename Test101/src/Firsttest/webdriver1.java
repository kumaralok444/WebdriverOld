package Firsttest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.*;

public class webdriver1 {
	public static void main(String args[])
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.flipkart.com/");
		//driver.manage().window().maximize();
		
		WebElement btn;
		btn=driver.findElement(By.xpath("html/body/div[8]/div[2]/span"));
		btn.click();
		//driver.close();
	}

}
