package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import util.PageBase;

import java.time.Duration;

public class CatalogPage {
    private WebDriver driver;

    public CatalogPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

//    @FindBy(xpath = "//*[@id=\"MenuContent\"]/a[contains(text(),'Sign Up')]")
    @FindBy(linkText = "Sign Up")
    WebElement signUp;



    public void clickSignUp(){
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//        wait.until(ExpectedConditions.visibilityOfElementLocated((By) signUp));
        Assert.assertTrue(signUp.isDisplayed());
        signUp.submit();
    }

}
