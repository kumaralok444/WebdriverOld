package excel;

import java.io.FileInputStream;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Try {
	public static void main(String args[])
	{
		
		try{
		FileInputStream fs = new FileInputStream("D:/ALOK/Data.xls");
		Workbook wb = Workbook.getWorkbook(fs);
		Sheet sh = wb.getSheet("Sheet1");
		int totalNoOfCols = sh.getColumns();
		int totalNoOfRows = sh.getRows();
		System.out.println(totalNoOfRows);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
