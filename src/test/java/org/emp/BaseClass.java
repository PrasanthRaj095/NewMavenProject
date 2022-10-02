package org.emp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	WebDriver driver;
	//1.Get Driver
	public void getDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	//2.Launch URL in Browser
	public void enterUrl(String Url) {
		driver.get(Url);
	}
	
	//3.Maximize the Window
	public void maximizeTheWindow() {
		driver.manage().window().maximize();
	}
	
	//4.Send values through Send Keys
	public void elementSendKeys(WebElement element, String data) {
			element.sendKeys(data);
	}
	
	//5.Click
	public void elementClick(WebElement element) {
		element.click();
	}

	//6.Get Title
	public String getWindowTitle() {
		String title = driver.getTitle();
		return title;
	}
	
	//7.Find Locator By ID
	public WebElement findLocatorById(String attributeValue) {
		WebElement findElement = driver.findElement(By.id(attributeValue));
		return findElement;
	}
	
	//8.Find Locator By Name
	public WebElement findLocatorByName(String attributevalue) {
		WebElement findElement = driver.findElement(By.name(attributevalue));
		return findElement;
	}
	
	//9. Find Locator by ClassName
	public WebElement findLocatorByClassName(String attributevalue) {
		WebElement findElement = driver.findElement(By.className(attributevalue));
		return findElement;
		}
	
	//10. Find Locator by XPATH
	public WebElement findLocatorByXpath(String xpathExpression) {
		WebElement findElement = driver.findElement(By.xpath(xpathExpression));
		return findElement;
	}
	
	//11. Get Text
	public String elementGetText(WebElement element) {
		String text = element.getText();
		return text;
	}
	
	//12. Close Window
	public void closeWindow() {
		driver.close();
	}
	
	//13. Quit Window
	public void quitWindow() {
		driver.quit();
	}
	
	//14.Get Attribute Value
	public String elementGetAttributeValue(WebElement element) {
		String attribute = element.getAttribute("value");
		return attribute;
	}
	
	//15. Select option by Text
	public void selectOptionByText(WebElement element) {
		Select select = new Select(element);
		select.selectByVisibleText("text");
	}
	
	//16. Select Options by Attribute
	public void selectOptionByValue(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);
	}
	
	//17. SendKeys Using Java Script
	public void elementSendKeysJs(WebElement element, String data) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].setAttribute('value','"+data+"')", element);
	}
	
	//18. Right Click
	public void elementRightClick(WebElement element) {
		Actions actions = new Actions(driver);
		actions.contextClick(element).perform();
	}
	
	//19. Double Click
	public void elementDoubleClick(WebElement element) {
		Actions action = new Actions(driver);
		action.doubleClick(element).perform();
	}
	
	//20. Select Options By Index
	public void selectoptionsByIndex(WebElement element, int i) {
		Select select = new Select(element);
		select.selectByIndex(i);
	}
	
	//21.Get options
	public List elementGetOptions(WebElement element) {
		Select select = new Select(element);
		List<WebElement> options = select.getOptions();
		return options;
	}
	
	//22. Deselect By Value
	public void deselectOptionByValue(WebElement element, String value) {
		Select select = new Select(element);
		select.deselectByValue(value);
	}
	
	//23. DeSelect option by Text
	public void deselectOptionByText(WebElement element) {
			Select select = new Select(element);
			select.deselectByVisibleText("text");
		}
	
	//24. DeSelect Options By Index
	public void deselectoptionsByIndex(WebElement element, int i) {
			Select select = new Select(element);
			select.deselectByIndex(i);
		}
	
	//25. Deselect All options
	public void deselectAllOptions(WebElement element) {
			Select select = new Select(element);
			select.deselectAll();
		}
		
	//26. Accept the Alert Box
	public void acceptTheAlertbox() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	
	//27. Dismiss the Alert Box	
	public void dismisTheAlertbox() {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}
	
	//28.Move to Element
	
	public void moveToElement(WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();
	}
	
	//29. KeyPress
	public void keyPressInElement() throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);

	}
	
	//30.Key Release
	public void keyReleaseInElement() throws AWTException {
		Robot robot = new Robot();
		robot.keyRelease(KeyEvent.VK_ENTER);

	}
	
	
	
	//31 Drag & Drop the element
	public void dragAndDropTheElement(WebElement element1, WebElement element2) {
		Actions actions = new Actions(driver);
		actions.dragAndDrop(element1, element2).perform();	
	}
	
	
	//32. Click Button Using Java Script
		public void clicktheButtonJs(WebElement element) {
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click()", element);
		}
	
	//33. Scroll Down using Java Script
			public void scrollDownJs(WebElement element) {
					JavascriptExecutor executor = (JavascriptExecutor) driver;
					executor.executeScript("arguments[0].scrollIntoView(true)", element);
				}
	
	//33. Scroll Up using Java Script
		public void scrollUpJs(WebElement element) {
				JavascriptExecutor executor = (JavascriptExecutor) driver;
				executor.executeScript("arguments[0].scrollIntoView(flase)", element);
				}
		
	//34. Navigate to Next Page
		public void navigateToNextpage() {
			driver.navigate().to("Url");
		}
		
	//34. Navigate to old Page
			public void navigateToOldPage() {
				driver.navigate().back();
				}
			
	//34. Refresh the page
			public void refreshTheCurrentPage() {
			driver.navigate().refresh();
			}
			
	//35. Switch to New Window by String URL
			public void switchToNewWindowByUrl() {
				driver.switchTo().window("url");

			}
			
	//35. Switch to New Window by String Title
			public void switchToNewWindowByTitle(String title) {
				driver.switchTo().window(title);

			}			
	//36. Switch to Frame by String Id
			public void switchtoFramebyId(String name) {
				driver.switchTo().frame(name);
				
			}
	//37. Submit
			public void submit(WebElement element) {
				element.submit();
			}
	
	//38. Clear
			public void clear(WebElement element) {
				element.clear();
			}
	
	//39. GetSize
			public Dimension getSize(WebElement element) {
				Dimension size = element.getSize();
				return size;
			}
			
	//40. Multiple Select
			public void multipleSelect(WebElement element) {
				Select select = new Select(element);
				select.isMultiple();
			}
			
	//41. Navigate to url
			public void navigatetoUrl(String url) {
				driver.navigate().to(url);
			}
			
	//42. Get Tag Name	
			public String getTagName(WebElement element) {
				String tagName = element.getTagName();
				return tagName;
			}
			
	//43. Get css Value
			public String getCssValue(WebElement element, String value) {
				String cssValue = element.getCssValue(value);
				return cssValue;

			}
			
			
	//44. Find Element by Partial Link Text
			public WebElement findElementByPartialLinkText(String attributeValue) {
				WebElement findElement = driver.findElement(By.partialLinkText(attributeValue));
				return findElement;
				}
	//45. Find Element by Link Test
			public WebElement findElementBylinkText(String attributeValue) {
				WebElement findElement = driver.findElement(By.linkText(attributeValue));
				return findElement;
			}
			
	//46.Find Element By Tag Name
			public WebElement findElementByTagName(String attributeValue) {
				WebElement findElement = driver.findElement(By.tagName(attributeValue));
				return findElement;
			}
	
			
	//47. GET DATA FROM EXCEL		
			
	public String getData(String sheetName, int rowNum, int cellNum) throws IOException {
		 String data = " ";
		
		File file = new File("C:\\Users\\prasa\\eclipse-workspace\\Employee\\ExcelFile\\Adactin hotel App.xlsx");
		FileInputStream fileInputStream = new FileInputStream(file);
				
		Workbook workbook = new XSSFWorkbook(fileInputStream);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rowNum);
		Cell cell = row.getCell(cellNum);
		CellType type = cell.getCellType();
		
		switch (type) {
		case STRING:
			data = cell.getStringCellValue();
			break;
			
		case NUMERIC: 
			if (DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/YY");
				data = dateformat.format(dateCellValue);
			} 
			else {
				double numericCellValue = cell.getNumericCellValue();
				BigDecimal valueof = BigDecimal.valueOf(numericCellValue);
				data = valueof.toString();

			}
		default:
			break;
		}
		
		return data;		
		
		
		
	}
			
	// Update the Value in Cell
	
	public void updateData(String sheetname, int rownum, int cellNum, String oldData, String newData) throws IOException {
		
		File file = new File("C:\\Users\\prasa\\eclipse-workspace\\Employee\\ExcelFile\\Adactin hotel App.xlsx");
		
		FileInputStream fileInputStream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(fileInputStream);
		
		Sheet sheet = workbook.getSheet(sheetname);
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellNum);
		String stringCellValue = cell.getStringCellValue();
		
		if (stringCellValue.equals(oldData)) {
			cell.setCellValue(newData);
		}
		
		FileOutputStream fos = new FileOutputStream(file);
		workbook.write(fos);
		
	}
	
	// Create Cell and Insert Data
	
	public void writeData(String sheetname, int rowNum, int cellNum, String data) throws IOException {

		File file = new File("C:\\Users\\prasa\\eclipse-workspace\\Employee\\ExcelFile\\Adactin hotel App.xlsx");	
		
		FileInputStream fileInputStream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(fileInputStream);
		
		Sheet sheet = workbook.getSheet(sheetname);
		Row row = sheet.getRow(rowNum);
		Cell cell = row.createCell(cellNum);
		cell.setCellValue(data);
		
		FileOutputStream fos = new FileOutputStream(file);
		workbook.write(fos);
		
		}
	
				
}
