package datadriven;



import net.sf.excelutils.ExcelUtils;

import org.apache.xpath.operations.String;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.opera.core.systems.scope.protos.EcmascriptProtos.Object;

public class TestClass {
	private String sTestCaseName;
	private int iTestCaseRow;
	WebDriver driver;
	@DataProvider
	 public Object[][] Authentication() throws Exception
	 {
		ExcelUtils.setExcelFile("D:/ALOK/Data.xlsx","sheet1");
		
	 }
	@BeforeTest
	public void setUp()
	{
		driver=new FirefoxDriver();
		driver.get("file:///D:/ALOK/testingWebpage.html");
	}
	@Test
	public void testcase()
	{
		
	}
}
