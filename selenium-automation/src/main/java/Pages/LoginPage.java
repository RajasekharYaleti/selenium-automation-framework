package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage {

    WebDriver driver;

    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    By clinicId = By.id(":r3:");
    By username = By.id(":r4:");
    By password = By.id(":r5:");
    By loginButton = By.xpath("//*[contains(@class,'login-button-grid')]/button");

    // Actions
    public void login(String clinic, String user, String pass) {
        driver.findElement(clinicId).sendKeys(clinic);
        driver.findElement(username).sendKeys(user);
        driver.findElement(password).sendKeys(pass);
        driver.findElement(loginButton).click();
    }
}



