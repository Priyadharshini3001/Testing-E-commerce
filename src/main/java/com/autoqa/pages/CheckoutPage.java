package com.autoqa.pages;

import com.autoqa.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage extends BasePage {

    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    By productsBtn = By.xpath("//a[contains(text(),'Products')]");

    By addToCartBtn =
            By.xpath("(//a[contains(text(),'Add to cart')])[1]");

    By continueShoppingBtn =
            By.xpath("//button[contains(text(),'Continue Shopping')]");

    By cartBtn = By.xpath("//a[contains(text(),'Cart')]");

    By checkoutBtn =
            By.xpath("//a[contains(text(),'Proceed To Checkout')]");

    public void proceedToCheckout() {

        click(productsBtn);

        click(addToCartBtn);

        click(continueShoppingBtn);

        click(cartBtn);

        click(checkoutBtn);
    }

    public boolean isCheckoutVisible() {

        return isDisplayed(checkoutBtn);
    }
}