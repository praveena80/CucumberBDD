package actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.PageBase;

public class LoginPage extends PageBase {

    @FindBy(name = "txtUsername")
    WebElement userName;

    @FindBy(name = "password")
    public WebElement pword;

    @FindBy(xpath = "//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/span")
    public WebElement missingUsernameErrorMessage;

    @FindBy(xpath = "//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
    public WebElement login;

    @FindBy(xpath = "//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p")
    public  WebElement errorMessage;

    public LoginPage() {
        PageFactory.initElements(driver,this);
    }

    public void login(String uname, String pwd){
        userName.sendKeys(uname);
        pword.sendKeys(pwd);
        login.click();
    }

}
