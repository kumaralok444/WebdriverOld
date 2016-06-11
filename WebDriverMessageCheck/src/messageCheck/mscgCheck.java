package messageCheck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class mscgCheck {
	public static void main(String args[]) throws Exception
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///D:/ALOK/testingWebpage.html");
		WebElement msg = driver.findElement(By.xpath("html/body/form/p"));
		String msgtext = msg.getText();
		System.out.println(msgtext);
		try
		{
		Assert.assertEquals("Sorry is wrong",msgtext);
		}
		catch(Error e)
		{
			System.out.println(e);
		}
		boolean y;
		y = msg.isDisplayed();
		System.out.println(y);	
	}

}
