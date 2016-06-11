package placingorder;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class Placingtrainorder {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver = new FirefoxDriver();
		driver.get("https://www.thomaswoodenrailway.com/");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
	}
	@Test
	public void testcase1()
	{
		WebElement Engine,sodar,New,Selectvalue,allitems,Qv,img1,addtocart,checkout,Sco,con,i;
		Engine = driver.findElement(By.className("menu"));
		Engine.click();		
		Actions a = new Actions(driver);
		sodar = driver.findElement(By.cssSelector(".sub-head>a"));
		a.moveToElement(sodar).build().perform();
		New = driver.findElement(By.xpath(".//*[@id='55001']/a"));
		New.click();
		Selectvalue = driver.findElement(By.className("selectedValue"));
		Selectvalue.click();
		allitems = driver.findElement(By.xpath(".//*[@id='select-itemPage']/div[2]/div/div/dl/dd[2]"));
		allitems.click();
		JavascriptExecutor js=(JavascriptExecutor) driver;
    	js.executeScript("window.scrollBy(0,2500)");
    	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    	img1=driver.findElement(By.xpath(".//*[@id='catalogEntry_img_div85598']/a[2]/img"));
    	a.moveToElement(img1).build().perform();
		Qv = driver.findElement(By.xpath(".//*[@id='QuickViewLink_85598']"));
		Qv.click();
		addtocart = driver.findElement(By.xpath(".//*[@id='WC_QuickInfo_Link_addtocartquick']"));
		addtocart.click();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		checkout = driver.findElement(By.xpath(".//*[@id='MiniShoppingCart']/div[1]/div[3]/div[3]/ul/li[2]/a"));
		checkout.click();
		Sco = driver.findElement(By.xpath(".//*[@id='showStartCheckButton']/a"));
		Sco.click();
		
		
		
		Engine=driver.findElement(By.xpath(".//*[@id='select-birth_month']/div[1]/div"));
		Engine.click();
		sodar=driver.findElement(By.xpath(".//*[@id='select-birth_month']/div[2]/div/div/dl/dd[3]"));
		sodar.click();
		
		New = driver.findElement(By.xpath(".//*[@id='select-birth_date']/div[1]/div"));
		New.click();
		Selectvalue = driver.findElement(By.xpath(".//*[@id='select-birth_date']/div[2]/div/div/dl/dd[6]"));
		Selectvalue.click();
		
		allitems = driver.findElement(By.xpath(".//*[@id='select-birth_year']/div[1]/div"));
		allitems.click();
		Qv = driver.findElement(By.xpath(".//*[@id='select-birth_year']/div[2]/div/div/dl/dd[31]"));
		Qv.click();
		}
	@Test

	public void testcase2()
	{
		driver.get("https://www.thomaswoodenrailway.com/shop/OrderShippingView?storeId=11651&catalogId=15051&langId=-1&URL=OrderShippingView&errorViewName=OrderItemDisplayView&isShippingAddressInvalid=false");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebElement Sa,Name,LN,Rn,A1,City,State,val,zip,Cont,bill,ship,contin,popup;
		Sa = driver.findElement(By.xpath(".//*[@id='singleAddress']"));
		Sa.click();
		Name = driver.findElement(By.xpath(".//*[@id='firstName_']"));
		Name.sendKeys("LakshmiPriya");
		LN = driver.findElement(By.xpath(".//*[@id='lastName_']"));
		LN.sendKeys("Mohan");
		Rn = driver.findElement(By.xpath(".//*[@id='MattelBillingShippingAddressForm_']/fieldset/fieldset/div[2]/div/div[1]/label"));
		Rn.click();
		A1 = driver.findElement(By.xpath(".//*[@id='address1_']"));
		A1.sendKeys("8 silver maple court");
		City = driver.findElement(By.xpath(".//*[@id='city_']"));
		City.sendKeys("Brampton");
		zip = driver.findElement(By.xpath(".//*[@id='zipCode_']"));
		zip.sendKeys("33058");
		Cont = driver.findElement(By.xpath(".//*[@id='select-country_']/div[1]/div"));
		Cont.click();
		val = driver.findElement(By.xpath(".//*[@id='select-country_']/div[2]/div/div/dl/dd[2]"));
		val.click();
		State = driver.findElement(By.xpath(".//*[@id='select-state0_']/div[1]/div"));
		State.click();
		val = driver.findElement(By.xpath(".//*[@id='select-state0_']/div[2]/div/div/dl/dd[3]"));
		val.click();		
		bill = driver.findElement(By.xpath(".//*[@id='isBillAddress_']"));
		bill.click();
		ship = driver.findElement(By.xpath(".//*[@id='shippingModeOption_10746']"));
		ship.click();
		contin = driver.findElement(By.xpath(".//*[@id='MattelsingleShipmentOrderTotalsDetail']/div/div/div/div/div[1]/a[2]"));
		contin.click();
		popup = driver.findElement(By.xpath(".//*[@id='address-verification']/div[2]/div[2]/a[2]"));
		popup.click();
		contin = driver.findElement(By.xpath(".//*[@id='MattelsingleShipmentOrderTotalsDetail']/div/div/div/div/div[1]/a[2]"));
		contin.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
