package util;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PageBase {

    public static WebDriver driver;
    public static Properties prop;

    public PageBase() {
        try{
            prop= new Properties();
            FileInputStream fis = new FileInputStream("/Users/prave/IdeaProjects/CucumberBDD/" +
                    "src/main/java/config/config.properties");
            prop.load(fis);
        }  catch (IOException e) {
            e.printStackTrace();
        }
    }

    public WebDriver initialization() {
        String browser = prop.getProperty("browser");
        if(browser.equals("chrome")){
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get(prop.getProperty("petUrl"));
        }
//        WebDriverManager.chromedriver().setup();

        return driver;
    }


}
