package com.autoqa.tests;

import com.autoqa.base.BaseTest;
import com.autoqa.pages.CartPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CartTest extends BaseTest {

    @Test
    public void verifyAddToCart() {

        CartPage cartPage = new CartPage(driver);

        driver.get("https://automationexercise.com");

        cartPage.addProductToCart();

        Assert.assertTrue(
                cartPage.isProductAdded(),
                "Product not added to cart"
        );
    }
}