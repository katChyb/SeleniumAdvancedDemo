package search;

import base.Pages;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.product.ProductGridPage;

import static org.assertj.core.api.Assertions.assertThat;

public class RandomProductSearch extends Pages {

    private static Logger log = LoggerFactory.getLogger(RandomProductSearch.class);

    @Test
    public void simpleTest(){

//TODO
        productGridPage.getRandomProductFromGrid();






//            String actualTitle = driver.getTitle();
//            log.info(">>>>>>>> My website address id: " + System.getProperty("appUrl") + "<<<<<<<<<");
//            assertThat(actualTitle).isEqualTo(System.getProperty("title"));


    }

}
