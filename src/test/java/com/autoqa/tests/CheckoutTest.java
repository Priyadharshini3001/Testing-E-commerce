package com.autoqa.tests;

import com.autoqa.base.BaseTest;
import com.autoqa.pages.CheckoutPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckoutTest extends BaseTest {

    @Test
    public void verifyCheckoutPage() {

        CheckoutPage checkoutPage = new CheckoutPage(driver);

        driver.get("https://automationexercise.com");

        checkoutPage.proceedToCheckout();

        Assert.assertTrue(
                checkoutPage.isCheckoutVisible(),
                "Checkout page not displayed"
        );
    }
}