package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestTrainer {
	WebDriver cakes;
	
	@BeforeTest
	public void Setup()
	{
		System.setProperty("webdriver.chrome.driver","D:\\ALOK\\SWT\\sserver\\chromedriver_win32\\chromedriver.exe");
		cakes=new ChromeDriver();
		cakes.get("file:///D:/ALOK/testingWebpage.html");
	}
	
	@Test
	public void Testcase()
	{
		pom2 obj=new pom2(cakes);
		obj.webpage("India","India");
		
	}
	@AfterTest
	public void over()
	{
		cakes.quit();
	}


}
