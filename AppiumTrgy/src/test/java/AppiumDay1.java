import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumDay1 {

    @Test
    public void app() throws MalformedURLException {


        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
     /*   desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("platformVersion", "8.0");
        desiredCapabilities.setCapability("deviceName", "Galaxy C7");
        desiredCapabilities.setCapability("automationName", "UiAutomator2");
        desiredCapabilities.setCapability("app","C:\\Users\\trgy2\\OneDrive\\Masaüstü\\appium\\AppiumTrgy\\src\\Apps\\Calculator.apk"); */
         desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
         desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
         desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "RealDevice");
         desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
         desiredCapabilities.setCapability(MobileCapabilityType.APP, "C:\\Users\\trgy2\\OneDrive\\Masaüstü\\appium\\AppiumTrgy\\src\\Apps\\Calculator.apk");

         AndroidDriver<MobileElement> driver;
        driver = new AndroidDriver<MobileElement>(new URL("http:127.0.0.1:4723/wd/hub"), desiredCapabilities);
    }
}
