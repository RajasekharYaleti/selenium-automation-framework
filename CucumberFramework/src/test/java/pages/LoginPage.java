package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginPage {
		WebDriver driver;
		WebDriverWait wait;
		
		//Locators
		
		By UserNameField = By.xpath("//*[@name='username']");
		By PasswordField = By.xpath("//*[@type='password']");
		By LoginButton = By.xpath("//*[@type=\"submit\"]");
		
		//constructor
		public LoginPage(WebDriver driver) {
	        this.driver = driver;
	        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));  // ✅ initialize wait properly
	    }
		
		//Actions
		public void enterUserName(String UserName) {
			WebElement usernameInput = wait.until(ExpectedConditions.visibilityOfElementLocated(UserNameField));
	        usernameInput.sendKeys(UserName);
		}
		
		public void enterPassword(String password) {
			driver.findElement(PasswordField).sendKeys(password);
		}
		
		public void clickLogin() {
			driver.findElement(LoginButton).click();
		}
		
		//Combined methods
		public void Login(String UserName, String password) {
			enterUserName(UserName);
			enterPassword(password);
			clickLogin();
		}
		

	}


