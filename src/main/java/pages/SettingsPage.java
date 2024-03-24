package pages;

import base.BasePageObject;
import elements.SettingsPageElements;

public class SettingsPage extends BasePageObject {
    public void clickLogout() {
        click(SettingsPageElements.LOGOUT_BUTTON);
    }

    public void confirmLogout() {
        click(SettingsPageElements.YES_BUTTON);
    }
}
