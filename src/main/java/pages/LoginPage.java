package pages;

import base.BasePageObject;
import elements.HomePageElements;
import elements.LoginPageElements;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class LoginPage extends BasePageObject {

    public void clickForgotButton() {
        click(LoginPageElements.FORGOT_BUTTON);
    }

    public void inputMail(String mail) {

        type(LoginPageElements.MAIL_INPUT, mail);
    }

    public void inputPassword(String password) {

        type(LoginPageElements.PASSWORD_INPUT, password);
    }

    public void clickLoginBtn() throws InterruptedException {
        click(LoginPageElements.LOGIN_BUTTON);
    }

    public void waitForCaptcha() throws InterruptedException {
        Thread.sleep(9000);
    }

    public void checkLogout(By by) throws InterruptedException {
        waitForElementVisible(by);
    }

    public void clickRenewBtn() {
        click(LoginPageElements.SEND_MAIL_BUTTON);
    }



}
