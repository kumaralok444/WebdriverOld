package ddTest;

import static org.testng.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class DataDriven {
	private WebDriver driver;
	private StringBuffer verificationErrors = new StringBuffer();
	@DataProvider
	public Object[][] testData() {
		return new Object[][] {
			new Object[]{"Admin","Admin"},
			new Object[]{"Alok","Alok"},
			new Object[]{"1234","1234"},
		};
	}
	@BeforeTest
	public void setUp(){
		driver=new FirefoxDriver();
		driver.get("file:///D:/ALOK/testingWebpage.html");
		driver.manage().window().maximize();
	}
	@Test(dataProvider = "testData")
	public void testCase(String uname, String password) throws InterruptedException
	{
		//driver.get("file:///D:/ALOK/testingWebpage.html");
		try {
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
