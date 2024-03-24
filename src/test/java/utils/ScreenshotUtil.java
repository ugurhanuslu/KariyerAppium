package utils;

import drivers.AndroidDriverInit;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ScreenshotUtil {


    public static String getBase64Image() {
        TakesScreenshot screenshot = AndroidDriverInit.driver;
        String imageByte = screenshot.getScreenshotAs(OutputType.BASE64);
        return imageByte;
    }
}
