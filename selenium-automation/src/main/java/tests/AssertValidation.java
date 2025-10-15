package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertValidation {
	
	@Test
    public void testNumbers() {
        int actual = 5 + 5;
        int expected = 10;
        Assert.assertEquals(actual, expected, "Addition result is incorrect");
    }
}


