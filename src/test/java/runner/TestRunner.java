package runner;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(tags = "",
        features = "src/test/resources/features/LoginPage.feature",
        glue="stepDefinitons",
        monochrome = true,
        strict = true,
        dryRun = true,
        plugin = {})

public class TestRunner {

}
