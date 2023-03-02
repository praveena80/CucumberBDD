package actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.PageBase;

public class SignInPage extends PageBase {

    public SignInPage() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@id=\"MessageBar\"]/p")
    WebElement confirmationMsg;

    public String getConfirmationMsg(){
        return confirmationMsg.getText();
    }

}
