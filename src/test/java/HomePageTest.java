import config.TestConfig;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SearchPage;

import java.net.MalformedURLException;

public class HomePageTest extends TestConfig {
    private HomePage homePage;
    private SearchPage searchPage;


    @Test
    protected void checkMainPageCardsTest() throws MalformedURLException {
        new HomePage(driver).openApp();
    }


}
