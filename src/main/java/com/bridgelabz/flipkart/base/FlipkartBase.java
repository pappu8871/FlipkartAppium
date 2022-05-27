package com.bridgelabz.flipkart.base;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
public class FlipkartBase {
    public static AndroidDriver driver;
    @BeforeTest
    public void setUP()throws MalformedURLException{

        DesiredCapabilities cap= new DesiredCapabilities();
        cap.setCapability("deviceName","emulator-5554");
        cap.setCapability("platformName","Android");
        cap.setCapability("platformVersion", "9.0");
        cap.setCapability("app","D:\\AmazoneAppium\\src\\main\\resources\\Flipkart\\com.flipkart.apk");
        cap.setCapability("appPackage", "com.flipkart.android");
        cap.setCapability("appActivity", "com.flipkart.android.activity.HomeFragmentHolderActivity");

        driver=new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),cap);
        driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
        System.out.println("Test passed Application lunched sucessfully");
    }

    @AfterTest
    public void tearDown(){
//        driver.quit();
    }
}
