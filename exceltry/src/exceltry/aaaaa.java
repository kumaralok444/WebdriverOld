package exceltry;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;




import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import jxl.read.biff.BiffException;


public class aaaaa {

	public List getData() throws BiffException
	{
		List dataList = new ArrayList();
		try
		{
		FileInputStream fs = new FileInputStream("D:/ALOK/Data1.xlsx");
		 XSSFWorkbook workbook = new XSSFWorkbook(fs);
		 XSSFSheet sheet = workbook.getSheet("Sheet1");
		 java.util.Iterator rows = sheet.rowIterator();
		 while (rows.hasNext()) {
             XSSFRow row = ((XSSFRow) rows.next());
             // int r=row.getRowNum();
             java.util.Iterator cells = row .cellIterator();
             int i = 0;
             String[] testData= new String[2];
             while (cells.hasNext()) {
            	 
                 XSSFCell cell = (XSSFCell) cells.next();
                 String value = cell.getStringCellValue();
                 if (!value.equals(null)) {
                      testData [i] = value;
                      i++;
                 }
             }
             dataList.add(testData);
		 }
		}
		catch (FileNotFoundException e){
			 
			System.out.println("Could not read the Excel sheet");

			e.printStackTrace();

			}

		catch (IOException e){

			System.out.println("Could not read the Excel sheet");

			e.printStackTrace();

			}
		return dataList;
	}
	

}
