package utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Driver {

    public static AppiumDriver<MobileElement> getAppiumDriver() {
        URL appiumDriverURL = null;

        try {
            appiumDriverURL = new URL("http://localhost:4723/wd/hub");
        } catch (MalformedURLException e) {
            e.printStackTrace();
            throw new RuntimeException("Appium Server URL is invalid.");
        }

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, ConfigReader.getProperty("platformName"));
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, ConfigReader.getProperty("deviceName"));
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, ConfigReader.getProperty("platformVesion"));
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, ConfigReader.getProperty("automationName"));
        desiredCapabilities.setCapability(MobileCapabilityType.APP, "C:\\Users\\hakan\\IdeaProjects\\Java ile Appium\\apps\\HepsiBurada.apk");
        desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.hepsiburada.ui.startup.SplashActivity");
        desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.pozitron.hepsiburada");

    }
    




}