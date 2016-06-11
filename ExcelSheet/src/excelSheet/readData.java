package excelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class readData {
	public WebDriver driver;
	public static XSSFSheet ExcelWSheet;
	 
	private static XSSFWorkbook ExcelWBook;

	private static XSSFCell Cell;

	private static XSSFRow Row;

	@BeforeTest
	public void setup()
	{
	driver=new FirefoxDriver();
	driver.get("file:///D:/ALOK/testingWebpage.html");
	driver.manage().window().maximize();
	}
	@Test(dataProvider="empLogin")
    public void testCase(String uname, String passwd)
    {
		try
		{
		WebElement un,pd,bt;
		un=driver.findElement(By.id("username"));
		un.sendKeys(uname);
		pd=driver.findElement(By.id("password"));
		un.sendKeys(passwd);
		bt=driver.findElement(By.name("login"));
		bt.click();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
    }
	@DataProvider(name="empLogin")
	public Object[][] loginData() {
		
		Object[][] arrayObject = getExcelData("D:\\ALOK\\Data.xls","Sheet1");
		
		return arrayObject;
	}
	public String[][] getExcelData(String fileName, String sheetName)
	{
		String[][] arrayExcelData = null;
		
		try
		{
		FileInputStream fs = new FileInputStream(fileName);
		System.out.println(fs);
		 ExcelWBook = new XSSFWorkbook(fs);
		 
		 ExcelWSheet = ExcelWBook.getSheet(sheetName);
		 int startRow = 1;
		 
		   int startCol = 1;

		   int ci,cj;

		   int totalRows = ExcelWSheet.getLastRowNum();

		   // you can write a function as well to get Column count

		   int totalCols = 2;

		   arrayExcelData=new String[totalRows][totalCols];

		   ci=0;

		   for (int i=startRow;i<=totalRows;i++, ci++) {           	   

			  cj=0;

			   for (int j=startCol;j<=totalCols;j++, cj++){

				   try {
					arrayExcelData[ci][cj]=getCellData(i,j);
				} 
				   catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				   System.out.println(arrayExcelData[ci][cj]);  

					}

				}

		}
		catch(FileNotFoundException e)
		{
		e.printStackTrace();	
		}
		catch (IOException e)
		{
			e.printStackTrace();
			e.printStackTrace();
		}
		return arrayExcelData;
	}
	public static String getCellData(int RowNum, int ColNum) throws Exception
	{
		 
		try{

			Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);

			int dataType = Cell.getCellType();

			if  (dataType == 3)
			{

				return "";

			}
			else
			{

				String CellData = Cell.getStringCellValue();

				return CellData;

			}
		}
			catch (Exception e)
		   {

			System.out.println(e.getMessage());

			throw (e);

			}
	}

		

}
