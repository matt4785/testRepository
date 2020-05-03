package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.testng.Assert;

import java.net.MalformedURLException;

public class ProductPage extends BaseClass{
    public ProductPage(AndroidDriver<AndroidElement> driver) throws MalformedURLException {
        super(driver);
    }

    @AndroidFindBy(uiAutomator = "text(\"DODAJ DO KOSZYKA\")")
    private AndroidElement addToCartButton;

    public ProductPage checkProductPage(){
        Assert.assertTrue(addToCartButton.isDisplayed());
        return this;
    }

    public CartPage addToCart() throws MalformedURLException {
        addToCartButton.click();
        return new CartPage(driver);
    }
}
