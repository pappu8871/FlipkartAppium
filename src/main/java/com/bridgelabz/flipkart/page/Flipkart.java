package com.bridgelabz.flipkart.page;

import com.bridgelabz.flipkart.base.FlipkartBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import javax.swing.*;

public class Flipkart extends FlipkartBase {
    @AndroidFindBy(id= "com.flipkart.android:id/select_btn")
    @CacheLookup
    private AndroidElement Continue_Button;

    @AndroidFindBy(id= "")
    @CacheLookup
    private AndroidElement Keyboard;

    @AndroidFindBy(id = "com.flipkart.android:id/phone_input")
    @CacheLookup
    private AndroidElement Login;

    @AndroidFindBy(id = "com.flipkart.android:id/button")
    @CacheLookup
    private AndroidElement Login_Continue_Button;

    public Flipkart(AndroidDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    public void selectLanguage(){
        scroll();
    }
    public static void scroll(){
        ((AndroidDriver<MobileElement>) driver).findElementByAndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).setAsVerticalList()" +
                        ".scrollIntoView(new UiSelector().text(\"English\"))").click();
    }
    public void continueButton() throws InterruptedException {
        Continue_Button.click();
        Thread.sleep(5000);
    }

//    public void hideKeyboard(){
//        if (Keyboard != null){
//            driver.pressKey(AndroidKey.KEY_ESCAPE);
//        }
//    }
    public void login() {
        Login.click();
        driver.hideKeyboard();
        Keyboard.sendKeys("8871312779");
        Login_Continue_Button.click();

    }
}

