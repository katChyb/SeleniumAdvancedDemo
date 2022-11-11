package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TopMenuPage extends BasePage {

    public TopMenuPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".ui-autocomplete-input")
    private WebElement searchInputBox;

    @FindBy(css= "button .search")
    private WebElement searchBoxButton;


    public void inputSearchProductByText(String text){
        sendKeys(searchInputBox, text);
    }

    public void triggerSearchProduct(){
        searchBoxButton.click();
    }

}
