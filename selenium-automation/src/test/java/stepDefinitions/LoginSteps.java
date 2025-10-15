package stepDefinitions;

import io.cucumber.java.en.*;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class LoginSteps {
    WebDriver driver;

    @Given("user is on login page")
    public void user_is_on_login_page() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.healthtracks.com");
    }

    @When("user enters valid Clinic Id , username and password")
    public void user_enters_valid_clinic_id_username_and_password() {
        driver.findElement(By.id(":r3:")).sendKeys("1789");
        driver.findElement(By.id(":r4:")).sendKeys("admin");
        driver.findElement(By.id(":r5:")).sendKeys("devtest");
    }

    @When("clicks on login button")
    public void clicks_on_login_button() {
        driver.findElement(By.xpath("//*[contains(@class,\"login-button-grid\")]/button")).click();
    }

    @Then("user should be redirected to the Test Orders and  Results Page")
    public void user_should_be_redirected_to_the_test_orders_and_results_page() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlContains("testOrdersResults"));
        
        String actualUrl = driver.getCurrentUrl();
        System.out.println("Actual URL after login: " + actualUrl);
        
        driver.quit();
         }

    }

