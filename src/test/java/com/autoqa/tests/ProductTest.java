package com.autoqa.tests;

import com.autoqa.base.BaseTest;
import com.autoqa.pages.ProductsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductTest extends BaseTest {

    @Test
    public void verifyProductSearch() {

        ProductsPage productsPage =
                new ProductsPage(driver);

        productsPage.openProducts();

        productsPage.searchProduct("Blue Top");

        Assert.assertTrue(
                productsPage.verifyProduct("Blue Top"),
                "Product not found"
        );
    }
}