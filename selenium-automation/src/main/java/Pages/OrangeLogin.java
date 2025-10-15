package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrangeLogin {
	
	WebDriver driver;
	
	//Constructor
	
	public OrangeLogin(WebDriver driver) {
		this.driver = driver;
	}
	
	
	By username = By.xpath("//*[@name=\"username\"]");
	By password = By.xpath("//*[@type=\"password\"]");
	By LoginButton = By.xpath("//*[@class=\"oxd-form-actions orangehrm-login-action\"]/button");
	
	
	//Actions
	public void Login(String user, String pass) {
	((WebElement) driver.findElements(username)).sendKeys(user);
	driver.findElement(password).sendKeys(pass);
	driver.findElement(LoginButton).click();

}
}
