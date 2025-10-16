package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages.OrangeLogin;

public class OrangeLoginTest {
	
	WebDriver driver;
	OrangeLogin login;
	
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		login = new OrangeLogin(driver);
	}
	
	@Test
	public void testOrangeLogin() {
		login.Login("Admin", "Admin123");
	}
	
	@AfterClass
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		
	}

	}
}
