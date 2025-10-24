package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.LoginPage;


public class LoginTest {

    WebDriver driver;
    LoginPage loginPage;

    @BeforeMethod
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.healthtracks.com");

        loginPage = new LoginPage(driver);
    }

    @Test
    public void testLogin() {
        loginPage.login("1789", "daucoin", "Woof78!!");
        // Add verification/assertions here
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
