package steps;

import constants.GeneralConstants;
import elements.LoginPageElements;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;

public class LoginPageStepsIT extends BaseTestIT {


    @When("user click forgot pass link")
    public void userClickForgotPass() {
        loginPage.clickForgotButton();
    }

    @When("user input mail {string}")
    public void userInputMail(String mail) {
        loginPage.inputMail(mail);
    }

    @When("user input password {string}")
    public void userInputPassword(String password) {
        loginPage.inputPassword(password);
    }

    @When("user click button renew pass")
    public void userClickButtonRenew() {
        loginPage.clickRenewBtn();
    }

    @When("user click button login")
    public void userClickButtonLogin() throws InterruptedException {
        loginPage.clickLoginBtn();
    }

    @When("wait for captcha solve")
    public void waitForCaptcha() throws InterruptedException {
        loginPage.waitForCaptcha();
    }

    @Then("user successfully renew")
    public void userSuccessfullyLogin() {
        String successText = base.getText(LoginPageElements.SUCCESS_SEND_TEXT);
        Assertions.assertEquals(GeneralConstants.SUCCESS_SEND_TEXT, successText);
    }

    @Then("user failed renew")
    public void userUnsuccessfullyLogin() throws InterruptedException {

        String errorText = base.getText(LoginPageElements.ERROR_SEND_TEXT);
        Assertions.assertEquals(GeneralConstants.ERROR_SEND_TEXT, errorText);
    }

    @Then("user check failed login")
    public void userWrongCredLogin() throws InterruptedException {

        String errorText = base.getText(LoginPageElements.ERROR_CRED_TEXT);
        Assertions.assertEquals(GeneralConstants.ERROR_CRED_TEXT, errorText);
    }

    @Then("user try with unregular mail format")
    public void unregularMailFormat() {
        WebElement element = base.find(LoginPageElements.SEND_MAIL_BUTTON);
        Boolean isEnabled = element.isEnabled();
        Assertions.assertEquals(false, isEnabled);
    }

    @Then("check is logout successfully")
    public void checkIsLoginSucessfully() throws InterruptedException {
        loginPage.checkLogout(LoginPageElements.LOGIN_BUTTON);

    }
}