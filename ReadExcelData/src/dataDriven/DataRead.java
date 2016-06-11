package dataDriven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class DataRead {
	private WebDriver driver;
	@DataProvider
	public Object[][] testData() {
		return new Object[][] {
			new Object[]{"Admin","Admin"},
			new Object[]{"Alok","Alok"},
			new Object[]{"Priya","Priya"},
		};
	}
	@BeforeTest
	public void setUp(){
		driver=new FirefoxDriver();
		driver.get("file:///D:/ALOK/testingWebpage.html");
		driver.manage().window().maximize();
	}

}
