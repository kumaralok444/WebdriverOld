package dp11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class dpclass {

	public static void main(String args[])
	{
		
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///D:/ALOK/testingWebpage.html");
		WebElement username,password,login,male;
		username=driver.findElement(By.id("username"));
		username.clear();
		username.sendKeys("dd");
		password=driver.findElement(By.id("password"));
		password.clear();
		password.sendKeys("pp");
		male=driver.findElement(By.id("f"));
		male.click();
		login=driver.findElement(By.name("login"));
		login.click();
			
		
		
	}
	

}
