package pages;

import base.BasePageObject;
import drivers.AndroidDriverInit;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import elements.HomePageElements;
import org.openqa.selenium.By;

import java.net.MalformedURLException;
import java.time.Duration;

public class HomePage extends BasePageObject {


    public void checkHomePage() {
    }

    public void clickLoginButton() {
        click(HomePageElements.LOGIN_BUTTON);
    }

    public void closeAd() {
        click(HomePageElements.CLOSE_AD_BUTTON);
    }

    public void clickRegisterButton() {
        click(HomePageElements.REGISTER_BUTTON);
    }

    public void clickProfileButton() {
        click(HomePageElements.CLOSE_BUTTON);
        click(HomePageElements.ACCOUNT_BUTTON);
    }

    public void checkHomePage(By by) throws InterruptedException {
        waitForElementVisible(by);
    }


}
