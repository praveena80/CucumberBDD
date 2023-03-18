package util;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
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

    public void initialization() {
        String browser = prop.getProperty("browser");
        if(browser.equals("chrome")){
            WebDriverManager.chromedriver().setup();
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
            chromeOptions.addArguments("--remote-allow-origins=*");
            driver = new ChromeDriver(chromeOptions);
            driver.get(prop.getProperty("petUrl"));
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        }
    }

    public void tearDown(){
        driver.quit();
    }


}
