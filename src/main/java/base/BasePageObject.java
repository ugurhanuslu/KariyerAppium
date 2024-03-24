package base;

import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static drivers.AndroidDriverInit.driver;

public class BasePageObject {


    public AndroidElement find(By by) {
        return driver.findElement(by);
    }

    public void type(By by, String text) {
        AndroidElement element = find(by);
        element.clear();
        element.sendKeys(text);
    }

    public void click(By by) {
        find(by).click();
    }

    public String getText(By by) {
        return find(by).getText();
    }

    public boolean isDisplayed(By by) {
        return find(by).isDisplayed();
    }

    public void waitForElementVisible(By by) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 15);


        wait.until(ExpectedConditions.visibilityOf(find(by)));
        System.out.println("element found");

    }

}
