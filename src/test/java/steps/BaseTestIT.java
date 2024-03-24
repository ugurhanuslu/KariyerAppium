package steps;

import base.BasePageObject;
import pages.*;

public class BaseTestIT {

    public LoginPage loginPage = new LoginPage();
    public HomePage homePage = new HomePage();
    public AccountPage accountPage = new AccountPage();
    public SettingsPage settingsPage = new SettingsPage();
    public BasePageObject base = new BasePageObject();
}
