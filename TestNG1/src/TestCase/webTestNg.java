package TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class webTestNg {
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
		driver.get("file:///D:/ALOK/testingWebpage.html");
		driver.findElement(By.linkText("Shop")).click();
		driver.findElement(By.cssSelector("#ag-tab1 > a > img.img-responsive")).click();
		driver.findElement(By.cssSelector("img[alt=\"No Image\"]")).click();
		driver.findElement(By.id("WC_QuickInfo_Link_addtocart")).click();
	    driver.findElement(By.xpath("(//a[contains(text(),'Checkout')])[2]")).click();
	   //driver.findElement(By.id("signIn")).click();

}
}
