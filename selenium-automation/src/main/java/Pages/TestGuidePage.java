package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestGuidePage {
		
   WebDriver driver;
   
// Locators
   By TestGuideLink = By.xpath("//*[contains(@class,\"nav-tabs\")]/a[3]");
   
   // Constructor
   public TestGuidePage(WebDriver driver) {
       this.driver = driver;
       
   }
   
   // Actions
   public void clickTestGuide() {
       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
       WebElement testGuideBtn = wait.until(
               ExpectedConditions.elementToBeClickable(TestGuideLink)
       );
       testGuideBtn.click();
       System.out.println("Clicked on Test Guide successfully!");
   
	}

}
