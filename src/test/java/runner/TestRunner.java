package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;
import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/CreateAccount.feature",
        glue={"src/test/java/stepDefinitions"},
        monochrome = true,
        strict = true,
        dryRun = false,
        plugin = {})
public class TestRunner {
        private TestNGCucumberRunner testNGCucumberRunner;
        @BeforeClass(alwaysRun = true)
        public void setUpClass() {
            testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
        }
        @Test(dataProvider = "features")
        public void feature(CucumberFeatureWrapper cucumberFeature) {
            testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
        }
        @DataProvider
        public Object[][] features() {
            return testNGCucumberRunner.provideFeatures();
        }
        @AfterClass(alwaysRun = true)
        public void testDownClass() {
            testNGCucumberRunner.finish();
        }
}
