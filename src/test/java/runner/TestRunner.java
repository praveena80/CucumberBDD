package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/CreateAccount.feature",
        glue={"stepDefinitions"},
        plugin = {})
public class TestRunner extends AbstractTestNGCucumberTests {

}
