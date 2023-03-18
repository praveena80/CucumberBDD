package stepDefinitions;

import actions.CatalogPage;
import actions.NewAccountFormPage;
import actions.SignInPage;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import util.PageBase;

import javax.xml.catalog.Catalog;

public class CreateAccountPageDefinition extends PageBase {
    CatalogPage catPO = new CatalogPage(driver);
    NewAccountFormPage newAccPO = new NewAccountFormPage(driver);
    SignInPage signInPO = new SignInPage(driver);

//    @Given("User on home page")
//    public void createAccountTest(){
//        initialization();
//    }

//    @When("user selects sign up")
//    public void goToSignUpPage(){
//        catPO.clickSignUp();
//    }

//    @Then("user provides all the required information and clicks on Save button {string}")
//    public void provideInformation(String userName){
//        newAccPO.enterAccountInfo(userName);
//    }

//    @Then("Confirmation message will display {string}")
//    public void verifyConfirmationMsg(String message){
//        Assert.assertEquals(signInPO.getConfirmationMsg(), message);
//    }

    @Given("user selects sign up")
    public void user_selects_sign_up() throws Throwable {
        catPO.clickSignUp();
        throw new PendingException();
    }

    @When("^user provides all the required information and clicks on Save button \"([^\"]*)\"$")
    public void user_provides_all_the_required_information_and_clicks_on_Save_button(String userName) throws Throwable {
        newAccPO.enterAccountInfo(userName);
        throw new PendingException();
    }

    @Then("^Confirmation message will display \"([^\"]*)\"$")
    public void confirmation_message_will_display(String message) throws Throwable {
        Assert.assertEquals(signInPO.getConfirmationMsg(), message);
        throw new PendingException();
    }
}
