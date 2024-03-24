package elements;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class LoginPageElements {
    public static final By FORGOT_BUTTON = MobileBy.id("com.kariyer.androidproject:id/txt_forgot_password");
    public static final By MAIL_INPUT = MobileBy.id("com.kariyer.androidproject:id/edt_email");
    public static final By PASSWORD_INPUT = MobileBy.id("com.kariyer.androidproject:id/edt_password");
    public static final By LOGIN_BUTTON = MobileBy.id("com.kariyer.androidproject:id/fl_login");
    public static final By SEND_MAIL_BUTTON = MobileBy.id("com.kariyer.androidproject:id/send_mail");
    public static final By SUCCESS_SEND_TEXT = MobileBy.id("com.kariyer.androidproject:id/title");
    public static final By ERROR_SEND_TEXT = MobileBy.id("com.kariyer.androidproject:id/email_error_txt");
    public static final By ERROR_CRED_TEXT = MobileBy.id("com.kariyer.androidproject:id/lbl_error");
}
