package tests;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PlaceOrder {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver-win64.\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.healthtracks.com");
		
		WebElement clinicId = driver.findElement(By.id(":r3:")); 
		clinicId.sendKeys("1789");
		
		WebElement username = driver.findElement(By.id(":r4:")); 
		username.sendKeys("admin");
		
		WebElement password = driver.findElement(By.id(":r5:")); 
		password.sendKeys("devtest");
		
        driver.findElement(By.xpath("//*[contains(@class,\"login-button-grid\")]/button")).click();
		
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),\"Test Orders & Results\")]")));
		
		driver.getTitle();
		
		driver.findElement(By.id("onetrust-close-btn-container")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//*[starts-with(@class,\"MuiTableBody-root css-1xnox0e\")]/tr[1]/td[2]")).click();
		
		WebElement NewLabOrder = driver.findElement(By.xpath("//*[@class=\"startNewLab\"]/button"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", NewLabOrder);

		driver.getTitle();
		
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait1.until(ExpectedConditions.invisibilityOfElementLocated(By.className("test-guides-grid-container")));
		
		driver.findElement(By.xpath("//*[contains(@class,\"step1_owner_container\")]/div[2]/div[1]/div[1]/div[1]/div/div")).click();
		
		WebElement OwnerName = driver.findElement(By.xpath("//*[contains(@class,\"step1_owner_container\")]/div[2]/div[1]/div[1]/div[1]/div/div "));
		OwnerName.sendKeys("raja");

		driver.quit();
		 
		
		}
		
		

	}


