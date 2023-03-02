package actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.PageBase;

public class CatalogPage extends PageBase {

    public CatalogPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@id=\"MenuContent\"]/a[contains(text(),'Sign Up')]")
    WebElement signUp;


    public void clickSignUp(){
        signUp.click();
    }

}
