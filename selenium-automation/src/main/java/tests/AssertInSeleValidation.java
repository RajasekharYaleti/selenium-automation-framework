package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AssertInSeleValidation {

	public static void main(String[] args) {

		   WebDriver driver = new ChromeDriver();
	        driver.get("https://google.com");

	        String actualTitle = driver.getTitle();
	        String expectedTitle = "Google";

	        Assert.assertEquals(actualTitle, expectedTitle, "Title does not match");
	        driver.quit();
	    }
	

	}


