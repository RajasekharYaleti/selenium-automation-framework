package runners;

//import org.junit.runner.RunWith;
//import io.cucumber.junit.Cucumber;
// import io.cucumber.junit.CucumberOptions;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;



@CucumberOptions(
    features = "src/test/java/features",
    glue = "stepDefinitions",
    plugin = {
        "pretty",
        "html:target/cucumber-reports/cucumber.html",
        "json:target/cucumber-reports/cucumber.json",
        "junit:target/cucumber-reports/cucumber.xml"
    },
    monochrome = true
)
public class TestRunner extends AbstractTestNGCucumberTests {    // we also run this test runner by using juint by removing following text in this line --->"extends AbstractTestNGCucumberTests" with Juint dependencies
}
