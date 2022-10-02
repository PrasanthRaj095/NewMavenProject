package org.junit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactinHotelApp {
	static WebDriver driver;
	@BeforeClass
	public static void beforeClass() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
				
	}
	
	@Before
	public void beforeMethod() {
		long beforeTime = System.currentTimeMillis();
		System.out.println(beforeTime);
			
	}
	
	@Test
	public void test() {
		
		WebElement txtUserName = driver.findElement(By.id("username"));
		txtUserName.sendKeys("Prasanth095");
		WebElement txtPassword = driver.findElement(By.id("password"));
		txtPassword.sendKeys("Pras@902792");
		WebElement clckLogin = driver.findElement(By.id("login"));
		clckLogin.click();

	}
	
	@After
	public void afterMethod() {
		
		long afterTime = System.currentTimeMillis();
		System.out.println(afterTime);
		
	}
	
	@AfterClass
	public static void afterClass() {
		driver.quit();
		
	}
	
	
	
	
}
