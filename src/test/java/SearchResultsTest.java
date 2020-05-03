import config.TestConfig;
import helpers.Helpers;
import org.testng.annotations.Test;
import pages.*;

import java.net.MalformedURLException;

public class SearchResultsTest extends TestConfig {

    @Test
    protected void checkIfSearchByCategoryResultsAreCorrect() throws MalformedURLException, InterruptedException {
        new HomePage(driver).openApp();
        new BottomBar(driver).goToSearchPage();
        new Helpers(driver).scrollToText("Uroda").click();
        new SearchPage(driver).goToSearchResults()
                .goToSearchResults()
                .goToSearchResults();
        new SearchResultsPage(driver).openProductPage();
        new ProductPage(driver).checkProductPage();
    }

    @Test
    protected void swipeTest() throws MalformedURLException {
        new HomePage(driver).openApp();
        new Helpers(driver).swipeDown();

    }
}
