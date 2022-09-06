package DriverConfiguration;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import config.ConfigProperties;
import org.openqa.selenium.remote.Browser;
import org.testng.annotations.BeforeTest;

public class WebDriverSetup {
    public static WebDriver driver;
    @BeforeTest
    public static WebDriver SetupDriver(){
        if (ConfigProperties.Browser.equals("Chrome")){
            WebDriverManager.chromedriver().setup();
            driver= new ChromeDriver();
        }else if (ConfigProperties.Browser.equals("Firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver= new FirefoxDriver();
        }else {
            System.out.println("Driver can not be empty");
        }
        return driver;
    }
}
