package priyaptng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class priyadatadriven {
private WebDriver summer;
@DataProvider
public Object[][] testdata()
{
return new Object[][]
     {
		new Object[]{"Hrithik","Hrithik"},
		new Object[]{"cake","coneice"},
		new Object[]{"Teddybear","barbie"}
    };
}
@BeforeTest
public void Setup()
{
	summer=new FirefoxDriver();
	summer.get("file:///D:/ALOK/testingWebpage.html");
	summer.manage().window().maximize();
}
@Test(dataProvider= "testdata")
public void data(String username,String password) throws InterruptedException
{
	WebElement usn,pwd,login;
	try
	{
	usn=summer.findElement(By.id("username"));
	usn.clear();
	usn.sendKeys(username);
	pwd=summer.findElement(By.id("password"));
	pwd.clear();
	pwd.sendKeys(password);
	login=summer.findElement(By.name("login"));
	login.click();
		
	}
	catch(Error e)
	{
	System.out.println("Error occured");	
	}
	
}
}

