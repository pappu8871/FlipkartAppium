package com.bridgelabz.flipkart.test;

import com.bridgelabz.flipkart.base.FlipkartBase;
import com.bridgelabz.flipkart.page.Flipkart;
import org.testng.annotations.Test;

public class FlipkartTest extends FlipkartBase {

    @Test(priority = 1)
    public void selectLanguage() throws InterruptedException {
        Flipkart flipkart = new Flipkart(driver);
        flipkart.selectLanguage();
        flipkart.continueButton();
    }

    @Test(priority = 2)
    public void login(){
        Flipkart flipkart=new Flipkart(driver);
        flipkart.login();
    }

}
