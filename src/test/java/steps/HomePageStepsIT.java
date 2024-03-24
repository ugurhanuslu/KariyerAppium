package steps;

import elements.HomePageElements;
import io.appium.java_client.MobileBy;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.jupiter.api.Assertions;

public class HomePageStepsIT extends BaseTestIT {

    @And("user click login button")
    public void userClickLoginButton() {
        homePage.clickLoginButton();
    }

    @And("user close ad popup")
    public void userCloseAdPopup() {
        homePage.closeAd();
    }


    @And("user click profile button")
    public void userClickProfileButton() {
        homePage.clickProfileButton();
    }

    @And("user click register button")
    public void userClickRegisterButton() {
        homePage.clickRegisterButton();
    }


    @Given("user is on home page")
    public void userIsOnHomePage() throws InterruptedException {
        Boolean text = base.isDisplayed(HomePageElements.SEARCH_BAR);
        Assertions.assertEquals(true, text);

    }


}
