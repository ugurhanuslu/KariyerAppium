package drivers;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AndroidDriverInit {

    public static AndroidDriver<AndroidElement> driver;

    public static void initialize() {
        //initialize driver capabilites
        System.out.println("driver init start");
        DesiredCapabilities caps = new DesiredCapabilities();
        String DIR = System.getProperty("user.dir");
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "device");
        caps.setCapability(MobileCapabilityType.UDID, "g6diobdqgyvgqwjb");
        caps.setCapability(MobileCapabilityType.APP, DIR + "/src/test/resources/apk/base.apk");
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");
        caps.setCapability("avdLaunchTimeout", 28000);
        caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 120);
        caps.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, true);

        //initialise appium server
        //you can change server url below
        String url = "http://0.0.0.0:4723/wd/hub";
        try {
            driver = new AndroidDriver<>(new URL(url), caps);
            //implicit wait
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public static void quit() {
        driver.quit();
    }

}
