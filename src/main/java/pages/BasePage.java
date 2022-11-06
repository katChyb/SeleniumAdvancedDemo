package pages;

import configuration.properties.AllProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;

public class BasePage {

    public BasePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver =driver;
        actions = new Actions(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }
    public WebDriver driver;
    public Actions actions;
    public WebDriverWait wait;

    Logger logger = LoggerFactory.getLogger(BasePage.class);
    public void click (WebElement element){
       // System.out.println("clicking on: " + element.getText());
        logger.info("clicking on: " + element.getText());
        element.click();
    }

    public void sendKeys (WebElement element, String textToSet){
        logger.info("typing: " + textToSet );
        element.sendKeys(textToSet);
    }
    public void clearAndSendKeys (WebElement element, String textToSet){
        logger.info("clearing input and typing: " + element + " " + textToSet );
        element.clear();
        sendKeys(element,textToSet);
    }
    //TODO poprawic pobieranie zmiennej do replace
    public double getPrice (WebElement element){
        return Double.parseDouble(element.getText().replace("$", " "));
    }

    public String getValue (WebElement element){
        return element.getAttribute("value");
    }

    public void waitToBeVisible(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}