package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class GetElementCssPropertiesTest {

	public static void main(String[] args) {
		
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.healthtracks.com");
		
	
		WebElement clinicId = driver.findElement(By.id(":r3:")); 
		clinicId.sendKeys("1789");
		
		WebElement username = driver.findElement(By.id(":r4:")); 
		username.sendKeys("admin");
		
		WebElement password = driver.findElement(By.id(":r5:")); 
		password.sendKeys("devtest");
		
        driver.findElement(By.xpath("//*[contains(@class,\"login-button-grid\")]/button"));
		
		WebElement Login = driver.findElement(By.xpath("//*[contains(@class,\"login-button-grid\")]/button"));

		// Get color
		String color = Login.getCssValue("color");

		// Get background color
		String bgColor = Login.getCssValue("background-color");

		// Get font size
		String fontSize = Login.getCssValue("font-size");

		// Get font family
		String fontFamily = Login.getCssValue("font-family");

		System.out.println("Text Color: " + color);
		System.out.println("Background Color: " + bgColor);
		System.out.println("Font Size: " + fontSize);
		System.out.println("Font Family: " + fontFamily);

	}

}
