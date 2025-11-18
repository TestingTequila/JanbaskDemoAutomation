package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features", glue = "stepDefinitions", plugin = {"pretty", "html:target/report/janbaskdemo.html"})
public class TestRunner extends AbstractTestNGCucumberTests {
}
