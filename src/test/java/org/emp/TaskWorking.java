package org.emp;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TaskWorking {
public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://omrbranch.com/apitestingtraininginchennaiomr");
		
		WebElement conLst = driver.findElement(By.id("country-list"));
		
		File file = new File("C:\\Users\\prasa\\eclipse-workspace\\Employee\\ExcelFile\\CountryListNew.xlsx");
		Workbook workbook = new XSSFWorkbook();
		Sheet createSheet = workbook.createSheet("CountryList");
		
				
		Select select = new Select(conLst);
		List<WebElement> options = select.getOptions();
		
		for (int i = 0; i < options.size(); i++) {
			
			String text = options.get(i).getText();
		
				Row createRow = createSheet.createRow(i);
				Cell cell = createRow.getCell(0);
				cell.setCellValue(text);
								
				}			
			
		FileOutputStream fos = new FileOutputStream(file);
		workbook.write(fos);

}

}


