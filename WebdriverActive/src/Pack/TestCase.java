package Pack;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import static org.hamcrest.CoreMatchers.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeTest
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://www.americangirl.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testUntitled() throws Exception {
    driver.get("http://www.americangirl.com/");
    driver.findElement(By.linkText("Shop")).click();
    driver.findElement(By.linkText("Shop")).click();
    driver.findElement(By.cssSelector("#ag-tab1 > a > img.img-responsive")).click();
    driver.findElement(By.cssSelector("img[alt=\"No Image\"]")).click();
    driver.findElement(By.id("WC_QuickInfo_Link_addtocart")).click();
    driver.findElement(By.xpath("(//a[contains(text(),'Checkout')])[2]")).click();
    driver.findElement(By.id("signIn")).click();
    new Select(driver.findElement(By.id("birth_month"))).selectByVisibleText("January");
    new Select(driver.findElement(By.id("birth_date"))).selectByVisibleText("1");
    new Select(driver.findElement(By.id("birth_year"))).selectByVisibleText("1991");
    driver.findElement(By.linkText("CONTINUE")).click();
  }

  @AfterTest
  public void tearDown() throws Exception {
    driver.quit();
   /* String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }*/
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
