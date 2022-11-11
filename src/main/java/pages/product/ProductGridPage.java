package pages.product;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;
import java.util.Random;

public class ProductGridPage extends BasePage {
    public ProductGridPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(css = ".product-title")
    private List<WebElement> productGrid;

    public String getRandomProductNameFromGrid() {
        int gridListSize = productGrid.size();
        return productGrid.get(new Random().nextInt(gridListSize)).getText();

    }

}
