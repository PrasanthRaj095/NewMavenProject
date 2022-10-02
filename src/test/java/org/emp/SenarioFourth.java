package org.emp;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SenarioFourth {
	
	public static void main(String[] args) throws IOException{
		
		File file = new File("C:\\Users\\prasa\\eclipse-workspace\\Employee\\ExcelFile\\Sample4.xlsx");
		
		Workbook workbook = new XSSFWorkbook();
		
		Sheet createSheet = workbook.createSheet("Prasanth");
		Row createRow = createSheet.createRow(0);
		Cell createCell = createRow.createCell(0);
		createCell.setCellValue("Prasanth");
		FileOutputStream fos	= new FileOutputStream(file);
		workbook.write(fos);
	
	
	}
	
	
	

}
