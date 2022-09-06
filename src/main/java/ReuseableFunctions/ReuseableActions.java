package ReuseableFunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ReuseableActions {
    /*
    ----------------------------------------------
    This is for click element
    ----------------------------------------------
     */
    public static void clickOnwebElement(WebDriver driver,WebElement element,int waitTimeInSeconds){
        WebDriverWait webwait=new WebDriverWait(driver, Duration.ofSeconds(waitTimeInSeconds));
        WebElement elements=null;
        elements=webwait.until(ExpectedConditions.elementToBeClickable(element));
        elements.click();
    }

    /*
    ------------------------------------------------
    This is for send keys Actions:: on text field
    ------------------------------------------------
     */

    public static void sendkeysOnwebElement(WebElement element,String Text){
        element.click();
        element.clear();
        element.sendKeys(Text);
    }

    /*
    ------------------------------------------------
    This is for selecting drop-down list
    ------------------------------------------------
     */

    public static void selectByVisibleText(WebElement element,String text){

        Select select=new Select(element);
        select.selectByVisibleText(text);
    }

    /*
    ------------------------------------------------
    This is for Accepting Alert from UI
    ------------------------------------------------
     */

    public static void acceptAlert(WebDriver driver){
        driver.switchTo().alert().accept();
    }
}
