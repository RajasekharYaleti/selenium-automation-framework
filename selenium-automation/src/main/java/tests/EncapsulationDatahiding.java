package tests;

// Encapsulation (Data hiding using classes & methods)

// Defination
// Wrapping data (variables) and methods into a single unit (class) and restricting direct access using private keyword.

public class EncapsulationDatahiding {
	
 private String Username;
 private String password;
 
 public void SetLoginDetails(String User, String pass) {
	 this.Username = "User";
	 this.password = "pass";
 }
	 
	 public void login() {
		 System.out.println("Login with "+Username);
		 // driver.findElement(By.id("username")).sendKeys(username);
	        // driver.findElement(By.id("password")).sendKeys(password);
	 }
	 
 }

// ✅ Used in Selenium:
//Encapsulation is used to protect element locators and test data inside Page Object Classes — Page Object Model (POM) design.
