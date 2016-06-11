package swt;

import static org.junit.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class drive {
	private WebDriver driver;
	private StringBuffer verificationErrors = new StringBuffer();
	@BeforeTest
	public void setup()
	{
	driver = new FirefoxDriver();
	}
	@Test
	public void testCase1()
	{
		driver.get("http://www.americangirl.com/");
		driver.findElement(By.linkText("Shop")).click();
		driver.findElement(By.cssSelector("#ag-tab1 > a > img.img-responsive")).click();
		driver.findElement(By.cssSelector("img[alt=\"No Image\"]")).click();
		driver.findElement(By.id("WC_QuickInfo_Link_addtocart")).click();
	    driver.findElement(By.xpath("(//a[contains(text(),'Checkout')])[2]")).click();
	   //driver.findElement(By.id("signIn")).click();
	    //new Select(driver.findElement(By.id("birth_month"))).selectByVisibleText("January");
	}
	@AfterTest
	public void tearDown() throws Exception
	{	
		driver.close();
		String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	}
}
