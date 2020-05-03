package helpers;

import config.TestConfig;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import pages.BaseClass;

import java.net.MalformedURLException;

public class Helpers extends BaseClass {
    private static String text;
    private String textToFind;
    private TouchAction touch;

    public Helpers(AndroidDriver<AndroidElement> driver) throws MalformedURLException {
        super(driver);
    }

    public void setText(String text){
        this.text = text;
    }

    public static String getText(){
        return text;
    }



    public AndroidElement scrollToText(String textToFind){
        AndroidElement scrollTo = driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(textMatches(\""+textToFind+"\"))");
        return scrollTo;
    }

    public AndroidElement searchForText(String textToFind){
        AndroidElement text = driver.findElementByAndroidUIAutomator("text(\""+textToFind+"\")");
        return text;
    }

    public void swipeDown(){
        int screenHeight = driver.manage().window().getSize().height;
        int screenWidth = driver.manage().window().getSize().width;
        touch = new TouchAction(driver);
        touch.longPress(PointOption.point(screenWidth/2, screenHeight/2)).moveTo(PointOption.point(screenWidth/2,screenHeight/8)).release().perform();
    }

    public void swipeUp(){
        int screenHeight = driver.manage().window().getSize().height;
        int screenWidth = driver.manage().window().getSize().width;
        touch = new TouchAction(driver);
        touch.longPress(PointOption.point(screenWidth/2, screenHeight/2)).moveTo(PointOption.point(screenWidth/2,screenHeight)).release().perform();
    }

    public void swipeLeft(){
        int screenHeight = driver.manage().window().getSize().height;
        int screenWidth = driver.manage().window().getSize().width;
        touch = new TouchAction(driver);
        touch.longPress(PointOption.point(screenWidth/2, screenHeight/2)).moveTo(PointOption.point(screenWidth/8,screenHeight/2)).release().perform();
    }

    public void swipeRight(){
        int screenHeight = driver.manage().window().getSize().height;
        int screenWidth = driver.manage().window().getSize().width;
        touch = new TouchAction(driver);
        touch.longPress(PointOption.point(screenWidth/2, screenHeight/2)).moveTo(PointOption.point(screenWidth,screenHeight/2)).release().perform();
    }
}


