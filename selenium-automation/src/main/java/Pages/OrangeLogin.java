package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrangeLogin {
	WebDriver driver;
	WebDriverWait wait;
	
	By usernameField = By.xpath("//*[@name=\"username\"]");
	By passwordField = By.xpath("//*[@type=\"password\"]");
	By LoginButton = By.xpath("//*[@class=\"oxd-form-actions orangehrm-login-action\"]/button");
	
	//Constructor
	public OrangeLogin(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	public void enterusername(String username) {
		WebElement usernameInput = wait.until(ExpectedConditions.visibilityOfElementLocated(usernameField));
        usernameInput.sendKeys(username);
	}
	
	public void enterPassword(String password) {
		driver.findElement(passwordField).sendKeys(password);
	}
	
	public void clickLogin() {
		driver.findElement(LoginButton).click();
	}
	
	
	
	//Actions
		public void Login(String UserName, String password) {
			enterusername(UserName);
			enterPassword(password);
			clickLogin();

}
}
