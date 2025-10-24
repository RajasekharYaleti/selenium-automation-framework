package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdminPage {
    WebDriver driver;

    // Locators
    By Adminlink = By.xpath("(//*[contains(@class,\"oxd-icon oxd-main-menu-item--icon\")])[1]");
    By AddButton = By.xpath("//div[contains(@class,'orangehrm-header-container')]//button[contains(., 'Add')]");


    // Constructor
    public AdminPage(WebDriver driver) {
        this.driver = driver;
    }

    // Actions
    public void clickAdminLink() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement adminBtn = wait.until(ExpectedConditions.elementToBeClickable(Adminlink));
        adminBtn.click();
        System.out.println("Clicked on Admin button successfully!");
    }

    public void clickAddButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Better XPath that targets the button, not the <i> icon inside it
        By addButtonLocator = By.xpath("//button[normalize-space()='Add']");

        WebElement addBtn = wait.until(ExpectedConditions.elementToBeClickable(addButtonLocator));
        addBtn.click();
        System.out.println("Clicked on Add button successfully!");
    }

}
