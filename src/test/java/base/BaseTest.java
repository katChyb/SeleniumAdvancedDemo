package base;

import configuration.properties.AllProperties;
import configuration.properties.BrowserSetup;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BaseTest {
    private static Logger log = LoggerFactory.getLogger(BaseTest.class);
    public WebDriver driver;

    private static AllProperties allProperties;
    private static BrowserSetup browserSetup;

    @BeforeAll
    static void setupDriver() {

        allProperties = AllProperties.getInstance();
        browserSetup = new BrowserSetup();
        log.info(">>>>>>>> WebDriver is set up <<<<<<<<<");
    }

    @BeforeEach
    void setup() {

        driver = browserSetup.getDriver();
        log.info(">>>>>>>> Chrome window is Maximized <<<<<<<<<");
    }

    @AfterEach
    void tearDown() {
        driver.quit();
        log.info(">>>>>>>> WebDriver is closed <<<<<<<<<");
    }

}
