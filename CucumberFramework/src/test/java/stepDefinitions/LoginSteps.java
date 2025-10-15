package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginSteps {
	WebDriver driver;
	LoginPage loginPage;
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com");
        loginPage = new LoginPage(driver);
        
	}

	@When("user enters valid username and password")
    public void user_enters_valid_username_and_password() {
        loginPage.enterUserName("Admin");
		loginPage.enterPassword("admin123");
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='username']")));
//		username.sendKeys("admin");

       // driver.findElement(By.xpath("//*[@type='password']")).sendKeys("admin123");
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		loginPage.clickLogin();
		//driver.findElement(By.xpath("//*[contains(@type,\"submit\")]")).click();
	    
	}

	@Then("user should be redirected to the Dashboard Page")
	public void user_should_be_redirected_to_the_dashboard_page() {
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.getTitle();
	    driver.quit();
	}

}
