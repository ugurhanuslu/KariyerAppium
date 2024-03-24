package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SettingsPageStepsIT extends BaseTestIT {
    @When("user click logout")
    public void userClickLogout() {
        settingsPage.clickLogout();
    }

    @Then("user confirm logout")
    public void userConfirmLogout() {
        settingsPage.confirmLogout();
    }

}
