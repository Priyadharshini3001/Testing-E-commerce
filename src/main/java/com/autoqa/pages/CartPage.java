package com.autoqa.pages;

import com.autoqa.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {

    public CartPage(WebDriver driver) {
        super(driver);
    }

    By productsBtn = By.xpath("//a[contains(text(),'Products')]");

    By addToCartBtn =
            By.xpath("(//a[contains(text(),'Add to cart')])[1]");

    By continueShoppingBtn =
            By.xpath("//button[contains(text(),'Continue Shopping')]");

    By cartBtn = By.xpath("//a[contains(text(),'Cart')]");

    By cartProduct =
            By.xpath("//td[@class='cart_description']//a");

    public void addProductToCart() {

        click(productsBtn);

        click(addToCartBtn);

        click(continueShoppingBtn);

        click(cartBtn);
    }

    public boolean isProductAdded() {

        return isDisplayed(cartProduct);
    }
}