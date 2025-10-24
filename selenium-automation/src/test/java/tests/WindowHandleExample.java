package tests;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowHandleExample {
	
	 public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	        // ✅ Create WebDriverWait instance
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	        // Wait for username field and enter data
	        WebElement username = wait.until(
	                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='username']"))
	        );
	        username.sendKeys("Admin");

	        // Enter password and click login
	        driver.findElement(By.xpath("//*[@type='password']")).sendKeys("admin123");
	        driver.findElement(By.xpath("//*[@type='submit']")).click();

	     // 3. Get main window ID
	        String mainWindow = driver.getWindowHandle();
	        
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        
	     // 4. Perform action that opens new window
	        driver.findElement(By.xpath("//*[contains(@class,\"oxd-glass-button orangehrm-upgrade-button\")]")).click();
	        
	     // 5. Get all window handles
	        Set<String> allWindows = driver.getWindowHandles();
	        
	     // 6. Loop through each window and switch
	        for (String window : allWindows) {
	            if (!window.equals(mainWindow)) {
	                driver.switchTo().window(window);   // switch to new window
	                System.out.println("Switched to child window: " + driver.getTitle());
	                
	                driver.close();
	            }
	        }
	        
	        // Optional: Wait for next page to load
	        driver.switchTo().window(mainWindow);
	        System.out.println("Back to main window: " + driver.getTitle());

	        driver.quit();
			
	        
	      
	    }
	}


