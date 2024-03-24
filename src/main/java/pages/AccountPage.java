package pages;

import base.BasePageObject;
import elements.AccountPageElements;
import elements.LoginPageElements;

public class AccountPage extends BasePageObject {


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

    public void goSettingsPage() {
        click(AccountPageElements.MENU_ICON);

    }

    public void clickRenewBtn() {
        click(LoginPageElements.SEND_MAIL_BUTTON);
    }

    public String getUserName() {
        String userName = getText(AccountPageElements.USER_NAME);
        return userName;
    }

    public String getUserMail() {
        String userMail = getText(AccountPageElements.USER_MAIL);
        return userMail;
    }

}
