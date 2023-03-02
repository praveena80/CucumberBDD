package actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.PageBase;

public class NewAccountFormPage extends PageBase {
    private WebDriver driver;
    public NewAccountFormPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(name = "username")
    WebElement username;

    @FindBy(name = "password")
    WebElement password;

    @FindBy(name = "repeatedPassword")
    WebElement confirmPwd;

    @FindBy(name = "firstName")
    WebElement fName;

    @FindBy(name = "lastName")
    WebElement lName;

    @FindBy(name = "email")
    WebElement email;

    @FindBy(name = "phone")
    WebElement phoneNum;

    @FindBy(name = "address1")
    WebElement add1;

    @FindBy(name = "address2")
    WebElement add2;

    @FindBy(name = "city")
    WebElement city;

    @FindBy(name = "state")
    WebElement state;

    @FindBy(name = "zip")
    WebElement zip;

    @FindBy(name = "country")
    WebElement country;

    @FindBy(name = "languagePreference")
    WebElement language;

    @FindBy(name = "favouriteCategoryId")
    WebElement category;

    @FindBy(xpath = "*//button[contains(text(),'Save ')]")
    WebElement saveAccountBtn;

    public void enterAccountInfo(String usrName) {
        username.sendKeys(usrName);
        password.sendKeys("Testing");
        confirmPwd.sendKeys("Testing");
        fName.sendKeys("avc");
        lName.sendKeys("avc");
        email.sendKeys("avc@avc.com");
        phoneNum.sendKeys("1599511559");
        add1.sendKeys("address");
        add2.sendKeys("address2");
        city.sendKeys("cityname");
        state.sendKeys("State");
        zip.sendKeys("23569");
        country.sendKeys("USA");
        saveAccountBtn.click();
    }


}
