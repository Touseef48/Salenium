package TestCases;

import config.ConfigProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import DriverConfiguration.WebDriverSetup;
import ReuseableFunctions.ReuseableActions;

public class Login extends WebDriverSetup {
    public static String URL=ConfigProperties.Url;
    public static String UserName=ConfigProperties.User;
    public static String Password=ConfigProperties.Password;
    //public static WebDriver driver=WebDriverSetup.SetupDriver();


    @Test
    public void LoginSwagLabs() {
        WebDriver driver=WebDriverSetup.SetupDriver();
        driver.get(URL);
        //driver.quit();
    }

    @Test
    public void LoginSuccess(){
        WebDriver driver=WebDriverSetup.SetupDriver();
        driver.get(URL);
        WebElement UserField=driver.findElement(By.id("user-name"));
        WebElement PassField=driver.findElement(By.id("password"));
        WebElement Submitfield=driver.findElement(By.id("login-button"));
        ReuseableActions.sendkeysOnwebElement(UserField,UserName);
        ReuseableActions.sendkeysOnwebElement(PassField,Password);
        ReuseableActions.clickOnwebElement(driver,Submitfield,3000);
    }

    @Test
    public void LoginFailure(){
        WebDriver driver=WebDriverSetup.SetupDriver();
        driver.get(URL);
        WebElement UserField=driver.findElement(By.id("user-name"));
        WebElement PassField=driver.findElement(By.id("password"));
        WebElement SubmitField=driver.findElement(By.id("login-button"));
        ReuseableActions.sendkeysOnwebElement(UserField,UserName);
        ReuseableActions.sendkeysOnwebElement(PassField,"abc");
        ReuseableActions.clickOnwebElement(driver,SubmitField,3000);
    }
}
