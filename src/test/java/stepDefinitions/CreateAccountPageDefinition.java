package stepDefinitions;

import actions.CatalogPage;
import actions.NewAccountFormPage;
import actions.SignInPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import util.PageBase;

import javax.xml.catalog.Catalog;

public class CreateAccountPageDefinition extends PageBase {
    CatalogPage catPO = new CatalogPage();
    NewAccountFormPage newAccPO = new NewAccountFormPage();
    SignInPage signInPO = new SignInPage();

    @Given("User on home page")
    public void createAccountTest(){
        PageBase.initialization();
    }

    @When("user selects sign up")
    public void goToSignUpPage(){
        catPO.clickSignUp();
    }

    @Then("user provides all the required information and clicks on Save button {string}")
    public void provideInformation(String userName){
        newAccPO.enterAccountInfo(userName);
    }

    @Then("Confirmation message will display {string}")
    public void verifyConfirmationMsg(String message){
        Assert.assertEquals(signInPO.getConfirmationMsg(), message);
    }
}
