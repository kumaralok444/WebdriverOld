package ddTest;

import static org.testng.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class checkfortitle {
	private WebDriver driver;
	private StringBuffer verificationErrors = new StringBuffer();
	@DataProvider
	public Object[][] testData() {
		return new Object[][] {
			new Object[]{"mngr14771","AbAtejY"},
			new Object[]{"Alok","Alok"},
			new Object[]{"1234","1234"},
		};
	}
	@BeforeTest
	public void setUp(){
		driver=new FirefoxDriver();
		driver.get("http://www.demo.guru99.com/V4/");
		driver.manage().window().maximize();
	}
	@Test(dataProvider = "testData")
	public void testCase(String uname, String password) throws InterruptedException
	{
		//driver.get("file:///D:/ALOK/testingWebpage.html");
		try {
			String t = driver.getTitle();
			WebElement un,pass,btn;
			un=driver.findElement(By.name("uid"));
			un.clear();
			un.sendKeys(uname);
			pass=driver.findElement(By.name("password"));
			pass.clear();
			pass.sendKeys(password);
			btn=driver.findElement(By.name("btnLogin"));
			btn.click();
			String t1 = driver.getTitle();
			 driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			if(t.equals(t1))
			{
			try
			{
			Alert alert = driver.switchTo().alert();
				
			alert.accept();
			}
			catch (Error e) {
				System.out.println(e);
			}
			}
			else
			{
				driver.findElement(By.xpath("html/body/div[2]/div/ul/li[15]/a")).click();
			}
			
		}
		catch (Error e) {
			verificationErrors.append(e.toString());
			
		}
	}
	@AfterTest
	public void tearDown()
	{
		driver.quit();
		
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
		fail(verificationErrorString);
		}
	}

}



