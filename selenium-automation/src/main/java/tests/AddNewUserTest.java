package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.OrangeLogin;
import Pages.AdminPage;  // ✅ import your AdminPage class properly

public class AddNewUserTest {
    WebDriver driver;
    OrangeLogin login;
    AdminPage adminPage;   // ✅ variable name should start lowercase (best practice)
   
   
    @BeforeMethod
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        login = new OrangeLogin(driver);
        login.Login("Admin", "admin123");

        // ✅ Initialize AdminPage after login
        adminPage = new AdminPage(driver);
    }

    @Test
    public void AdminUserPageNavigation() {
        adminPage.clickAdminLink();  // ✅ Now it's initialized
        System.out.println("Navigated to Admin page");
    }

    @Test
    public void AddButtonClick() {
        adminPage.clickAddButton(); // Make sure this method is defined in AdminPage
        System.out.println("Clicked Add button on Admin page");
    }

    
    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
