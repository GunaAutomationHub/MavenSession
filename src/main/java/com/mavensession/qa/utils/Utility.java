package com.mavensession.qa.utils;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.commons.io.FileUtils;


import com.mavensession.qa.base.TestBase;

public class Utility extends TestBase{
	static Workbook book;
	static Sheet sheet;
	static String path;
	public static Object[][] readInput(String sheetname){
		Object[][] data;		
		try {
			path = System.getProperty("user.dir")+"/src/main/java/com/mavensession/qa/testdata/TestData.xlsx";
			FileInputStream fis = new FileInputStream(path);
			book = WorkbookFactory.create(fis);
			sheet = book.getSheet(sheetname);
			int rows = sheet.getLastRowNum();
			int cols = sheet.getRow(0).getLastCellNum();
			data = new Object[rows][cols]; 
			for(int row=1;row<rows;row++) {
				cols = sheet.getRow(row).getLastCellNum();
				for(int col=0;col<cols;col++) {
					data[row][col] = sheet.getRow(row).getCell(col).toString();
				}
			}
			return data;
		}catch (Exception e) {
			e.printStackTrace();
			return data=null;
		}
	}

}
