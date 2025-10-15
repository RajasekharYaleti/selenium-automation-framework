package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages.OrangeLogin;

public class OrangeLoginTest {
	
	WebDriver driver;
	orangeLogin login;
	
	@BeforeClass
	public void setup() {
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 
		orangeLogin login = new orangeLogin();
	
		
	}
	
	@Test
	public void testOrangeLogin() {
		OrangeLogin orangeLogin = new OrangeLogin(null);
		orangeLogin.Login("Admin", "Admin123");
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
		
	}

}
