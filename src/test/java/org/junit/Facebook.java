package org.junit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
	static WebDriver driver;
	@BeforeClass
	public static void beforeClass() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
	
	@Before
	public void beforeMethod() {
		long currentTimeMillis = System.currentTimeMillis();
		System.out.println(currentTimeMillis);
		
	}
	
	@Test
	public void test() {
		
		WebElement txtUsername = driver.findElement(By.id("email"));
		txtUsername.sendKeys("Prasanth");
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys("7397489065");
		WebElement lgnClick = driver.findElement(By.name("login"));
		lgnClick.click();
	}
	
	@After
	public void afterMethod() {
		long currentTimeMillis2 = System.currentTimeMillis();
		System.out.println(currentTimeMillis2);

	}
	
	@AfterClass
	public static void afterClass() {
		driver.quit();
		
	}
	
	
	
}
