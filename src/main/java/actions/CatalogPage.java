package actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.PageBase;

public class CatalogPage {
    private WebDriver driver;

    public CatalogPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@id=\"MenuContent\"]/a[contains(text(),'Sign Up')]")
    WebElement signUp;


    public void clickSignUp(){
        signUp.click();
    }

}
