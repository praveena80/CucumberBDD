package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/CreateAccount.feature",
        glue="stepDefinitons",
        monochrome = true,
        strict = true,
        dryRun = true,
        plugin = {})
public class TestRunner {

}
