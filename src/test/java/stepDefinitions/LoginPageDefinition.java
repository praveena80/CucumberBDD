package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import util.PageBase;

public class LoginPageDefinition extends PageBase{

    @Given("User is on HRM page {string}")
    public void loginTest(String url){
        PageBase.initialization(url);
    }

    @When("User provides username and password as {string}")
    public void goToHomePage(String uname, String pwd){

    }
}
