package com.autoqa.pages;

import com.autoqa.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {

        super(driver);
        this.driver = driver;
    }

    // Locators
    By homeLogo = By.xpath("//img[@alt='Website for automation practice']");
    By productsBtn = By.xpath("//a[contains(text(),'Products')]");
    By signupLoginBtn = By.xpath("//a[contains(text(),'Signup / Login')]");
    By cartBtn = By.xpath("//a[contains(text(),'Cart')]");
    By logoutBtn = By.xpath("//a[contains(text(),'Logout')]");

    // Verify Home Page Loaded
    public boolean isHomePageVisible() {

        return driver.findElement(homeLogo).isDisplayed();
    }

    // Navigate to Products
    public void clickProducts() {

        driver.findElement(productsBtn).click();
    }

    // Navigate to Login
    public void clickSignupLogin() {

        driver.findElement(signupLoginBtn).click();
    }

    // Navigate to Cart
    public void clickCart() {

        driver.findElement(cartBtn).click();
    }

    // Logout
    public void clickLogout() {

        driver.findElement(logoutBtn).click();
    }
}