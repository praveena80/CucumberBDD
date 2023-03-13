package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import util.PageBase;

public class Hooks {
    PageBase pageBase = new PageBase();
    @Before
    public void initializeTest() {
        pageBase.initialization();
    }

    @After
    public void endTest() {
        pageBase.tearDown();
    }
}
