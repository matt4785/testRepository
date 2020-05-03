package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.net.MalformedURLException;
import java.util.List;

public class SearchResultsPage extends BaseClass{
    public SearchResultsPage(AndroidDriver<AndroidElement> driver) throws MalformedURLException {
        super(driver);
    }

    @AndroidFindBy(className = "android.widget.ImageView")
    private List<AndroidElement> displayedProductList;


    public ProductPage openProductPage() throws MalformedURLException, InterruptedException {
        Thread.sleep(4000);
        displayedProductList.get(2).click();
        return new ProductPage(driver);
    }
}
