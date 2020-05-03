package pages;

import config.TestConfig;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;

public class BaseClass extends TestConfig {
    private String text;

    public BaseClass(AndroidDriver<AndroidElement> driver) throws MalformedURLException {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }





}
