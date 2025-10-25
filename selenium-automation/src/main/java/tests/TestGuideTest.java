package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages.LoginPage;
import Pages.TestGuidePage;

public class TestGuideTest {
	
    WebDriver driver;
    LoginPage loginPage;
    TestGuidePage testGuidePage;
	
	@BeforeClass
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.healthtracks.com/");
		
		
		// initialise page objects
		
		loginPage = new LoginPage(driver);
		testGuidePage = new TestGuidePage(driver);
	}
		
	@Test
	public void TestGuideNavigation() {
		
		loginPage.login("1789", "admin", "devtest");
		
		testGuidePage.clickTestGuide();
		
		System.out.println("Navigated to Test Guide page!");
		
	}
	
	@AfterClass
	public void tearDown() { 
		
		driver.quit();
	
	
		
	}
	

}
