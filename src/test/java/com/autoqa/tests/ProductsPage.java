package com.autoqa.tests;

import com.autoqa.base.BaseTest;
import com.autoqa.pages.ProductsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductTest extends BaseTest {

    @Test
    public void verifySearchProduct() {

        ProductsPage product = new ProductsPage(driver);

        product.searchProduct("Blue Top");

        Assert.assertTrue(product.verifyProduct("Blue Top"));
    }
}