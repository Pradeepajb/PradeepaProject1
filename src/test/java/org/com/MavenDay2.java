package org.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MavenDay2 {
	public static void main(String[] args) throws IOException {
		
		
File f=new File("C:\\Users\\Pradeepa\\eclipse-workspace\\Pradeepa\\Excel\\MavenSample1.xlsx");

FileInputStream fin = new FileInputStream(f);

Workbook w = new XSSFWorkbook(fin);

Sheet s = w.getSheet("Sheet1");

Row r = s.getRow(0);

Cell c = r.getCell(1);

System.out.println(c);
 for (Cell cell : r) {
	 System.out.println(cell);

}

	}
	
	
	

}
