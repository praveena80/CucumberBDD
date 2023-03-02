package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import util.PageBase;

public class Hooks {
    PageBase pageBase;
    @Before
    public void initializeTest() {
        pageBase = new PageBase();
        pageBase.initialization();
    }

    @After
    public void endTest() {
        PageBase.driver.quit();
    }
}
