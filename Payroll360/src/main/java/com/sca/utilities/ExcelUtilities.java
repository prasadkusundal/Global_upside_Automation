package com.sca.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;

public class ExcelUtilities {

	static String filePath="\\C:\\Users\\Hp\\Documents\\GitHub\\Global_upside_Automation\\Payroll360\\src\\main\\java\\com\\sca\\resources\\Testdata1..xlsx";
	//static String filePath=System.getProperty("user.dir")+"/Payroll360/src/main/java/com/sca/resources/Testdata1..xlsx";

	
	static Workbook book;
	static Sheet Company;
	static JavascriptExecutor js;

	public static Object[][] getExcel(String sheetName) {
		FileInputStream file = null;
		try {
			file = new FileInputStream(filePath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			book = WorkbookFactory.create(file);
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Company = (Sheet) book.getSheet(sheetName);
		Object[][] data = new Object[(Company).getLastRowNum()][(Company).getRow(0).getLastCellNum()];
		// System.out.println(sheet.getLastRowNum() + "--------" +
		// sheet.getRow(0).getLastCellNum());
		for (int i = 0; i < (Company).getLastRowNum(); i++) {
			for (int k = 0; k < (Company).getRow(0).getLastCellNum(); k++) {
				data[i][k] = (Company).getRow(i + 1).getCell(k).toString();
			//	System.out.println(data[i][k]);
			}
		}
		return data;
	}

	
}
