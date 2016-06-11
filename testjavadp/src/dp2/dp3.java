package dp2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class dp3 {
	
	public static void main(String args[])
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.demo.guru99.com/V4/");
		driver.manage().window().maximize();
		WebElement user,password,login;
		user=driver.findElement(By.name("uid"));
		user.clear();
		user.sendKeys("mngr12669");
		password=driver.findElement(By.name("password"));
		password.clear();
		password.sendKeys("admin");
		login=driver.findElement(By.name("btnLogin"));
		login.click();
		try
		{
			Alert alert = driver.switchTo().alert();
			String textonalert = alert.getText();
			System.out.println(textonalert);
			alert.accept();
		}
		catch(Exception e)
		{
			
		}
		
		
		
		
		

		
		
		
		
		
		
		
	}

}
