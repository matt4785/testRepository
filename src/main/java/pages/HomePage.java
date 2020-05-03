package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.net.MalformedURLException;

public class HomePage extends BaseClass{
    public HomePage(AndroidDriver driver) throws MalformedURLException {
        super(driver);
    }


    @AndroidFindBy(id = "android:id/button1")
    private AndroidElement agreeButton;//test



    @AndroidFindBy(uiAutomator = "text(\"Czego szukasz?\")")
    private AndroidElement searchBar;



    public HomePage openApp(){
        agreeButton.click();

        return this;
    }

    public SearchPage activateSearchBar() throws MalformedURLException {
        searchBar.click();
        return new SearchPage(driver);
    }



}
