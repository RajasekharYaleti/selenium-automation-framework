package tests;

import org.testng.Assert;

public class AssertInavidusernameTest {
	
	public void main(String[] args) {
	
	try{

		Assert.assertEquals("expUserName", "actUserName");

		}catch(Exception e){

		System.out.println("name is invalid");

		}
}
}