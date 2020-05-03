package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.net.MalformedURLException;

public class BottomBar extends BaseClass {

    public BottomBar(AndroidDriver<AndroidElement> driver) throws MalformedURLException {
        super(driver);
    }

    @AndroidFindBy(id = "pl.allegro:id/nav_home")
    private AndroidElement naviHomeButton;

    @AndroidFindBy(id = "pl.allegro:id/nav_search_or_inspirations")
    private AndroidElement naviSearchButton;

    @AndroidFindBy(id = "pl.allegro:id/nav_cart")
    private AndroidElement naviCartButton;

    @AndroidFindBy(id = "ppl.allegro:id/nav_watched")
    private AndroidElement naviWatchedButton;

    @AndroidFindBy(id = "pl.allegro:id/nav_my_allegro")
    private AndroidElement naviMyAllegroButton;


    public HomePage goToHomePage() throws MalformedURLException {
        naviHomeButton.click();
        return new HomePage(driver);
    }

    public SearchPage goToSearchPage() throws MalformedURLException {
        naviSearchButton.click();
        return new SearchPage(driver);
    }

    public CartPage goToCartPage() throws MalformedURLException {
        naviCartButton.click();
        return new CartPage(driver);
    }

    public WatchedPage goToWatchedPage() throws MalformedURLException {
        naviWatchedButton.click();
        return new WatchedPage(driver);
    }

    public MyAllegroPage goToMyAllegroPage() throws MalformedURLException {
        naviMyAllegroButton.click();
        return new MyAllegroPage(driver);
    }

}
