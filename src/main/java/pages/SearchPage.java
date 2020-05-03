package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.testng.Assert;

import java.net.MalformedURLException;
import java.util.List;


public class SearchPage extends BaseClass{
    public static String elementName;
    public SearchPage(AndroidDriver<AndroidElement> driver) throws MalformedURLException {
        super(driver);
    }

    @AndroidFindBy(id = "pl.allegro:id/searchBox")
    private AndroidElement searchBox;

    @AndroidFindBy(id = "pl.allegro:id/search")
    private AndroidElement startSearchButton;

    @AndroidFindBy(id = "pl.allegro:id/categoryName")
    private List<AndroidElement> categoryName;


    public SearchPage startSearch(String text) throws MalformedURLException {
        searchBox.sendKeys(text);
        startSearchButton.click();

        return new SearchPage(driver);
    }

    public void getElementText(AndroidElement element){
        elementName = element.getText();

    }

    public SearchPage goToSearchResults(){
        categoryName.get(2).click();

        return this;
    }

}
