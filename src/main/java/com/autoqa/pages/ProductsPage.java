package com.autoqa.pages;

import com.autoqa.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage extends BasePage {

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    By productsBtn = By.xpath("//a[contains(text(),'Products')]");

    By searchBox = By.id("search_product");

    By searchBtn = By.id("submit_search");

    By searchedProduct =
            By.xpath("//div[@class='productinfo text-center']/p");

    public void openProducts() {

        click(productsBtn);
    }

    public void searchProduct(String product) {

        type(searchBox, product);

        click(searchBtn);
    }

    public boolean verifyProduct(String productName) {

        return getText(searchedProduct)
                .equalsIgnoreCase(productName);
    }
}