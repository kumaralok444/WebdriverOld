package pa2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class pa4 {
	private WebDriver driver;
	@DataProvider
	public Object[][]testData()
	{
		return new Object[][]
				{
				new Object[]{"red","green"},
				new Object[]{"blue","yellow"},
				new Object[]{"white","pink"},
											
				};
	}
	@BeforeTest
	public void Setup()
	{
		driver=new FirefoxDriver();
		driver.get("file:///D:/ALOK/testingWebpage.html");
			}
	@Test(dataProvider="testData")
	public void testcase(String uname,String password)
	throws InterruptedException
	{
		try
		{
			WebElement un,pass,btn;
			un=driver.findElement(By.id("username"));
			un.clear();
			un.sendKeys(uname);
			pass=driver.findElement(By.id("password"));
			pass.clear();
			pass.sendKeys(password);
			btn=driver.findElement(By.name("login"));
			btn.click();
		}
		catch(Error e)
		{
			
		}
	}
@AfterTest
public void close()
{
	driver.quit();
}
}
