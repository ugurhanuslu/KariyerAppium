package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class AccountPageStepsIT extends BaseTestIT {
    @When("check user credentials {string} , {string}")
    public void checkUserCredentials(String mail, String username) {
        String userMail = accountPage.getUserMail();
        String userName = accountPage.getUserName();
        Assertions.assertEquals(userMail, mail);
        Assertions.assertEquals(userName, username);
    }

    @Then("user go to settings page")
    public void goSettingsPage() {
        accountPage.goSettingsPage();
    }

}
