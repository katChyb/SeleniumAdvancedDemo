package search;

import base.Pages;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class SearchTests extends Pages {

    private static Logger log = LoggerFactory.getLogger(SearchTests.class);

    @Test
    @RepeatedTest(10)
    public void RandomProductSearchTest() {

        String productName = productGridPage.getRandomProductNameFromGrid();
        System.out.println("productName " + productName);
        topMenuPage.inputSearchProductByText(productName);
        topMenuPage.triggerSearchProduct();
        String numberOfProductsFound = searchProductResultPage.getNumberOfProductsFound();
        System.out.println("numberOfProductsFound " + numberOfProductsFound);
        SoftAssertions softly = new SoftAssertions();
        softly.assertThat(numberOfProductsFound).isEqualTo(System.getProperty("amountOfExpectedSearchResultsList"));
        String nameOfFoundProduct = searchProductResultPage.getNameOfFoundProduct();
        System.out.println("nameOfFoundProduct " + nameOfFoundProduct);
        softly.assertThat(nameOfFoundProduct).isEqualTo(productName);
        softly.assertAll();

    }

    @Test
    public void dropdownSearchTest () {

    }

}
