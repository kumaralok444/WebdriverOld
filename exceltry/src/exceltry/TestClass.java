package exceltry;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class TestClass
{
	WebDriver driver;
	@BeforeTest
	 public void setUp() throws Exception {
         driver = new FirefoxDriver();
         driver.get("file:///D:/ALOK/testingWebpage.html");
         driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
	@Test
	public void testngcase()throws Exception 
	{
		aaaaa readXls = new aaaaa();
		 List dataList = readXls.getData();
		 for (int i = 1; i < dataList.size(); i++)
		 {
			 String[] testCase = new String[5];
			 String[] test = (String[]) dataList.get(i);
			 String uName = test[0];
             String passwd = test[1];
             driver.findElement(By.id("username")).sendKeys(uName);
             driver.findElement(By.id("password")).sendKeys(passwd);
             driver.findElement(By.xpath("html/body/form/input[5]")).click();
             
		 }
	}
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
}