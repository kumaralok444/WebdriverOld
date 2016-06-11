package testNG;

	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class testngPOM {
		WebDriver driver;
		JavaPOM obj;
		@BeforeTest
		public void setup()
		{
			driver=new FirefoxDriver();
			driver.get("https://accounts.google.com/ServiceLogin?service=mail&continue=https://mail.google.com/mail/#identifier");
		}
		@Test
		public void testCase()
		{
		obj = new JavaPOM(driver);
		obj.userName();
		}
		

	}


