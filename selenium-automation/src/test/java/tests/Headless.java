package tests;

import java.time.Duration;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Headless {

	public static void main(String[] args) {
		
		
		HtmlUnitDriver driver = new HtmlUnitDriver(true);

		driver.setJavascriptEnabled(false);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.google.co.in/");

		System.out.println(driver.getTitle());


	}

}
