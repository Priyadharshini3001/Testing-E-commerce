package com.autoqa.pages;

import com.autoqa.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaymentPage extends BasePage {

    WebDriver driver;

    public PaymentPage(WebDriver driver) {

        super(driver);
        this.driver = driver;
    }

    // Locators
    By nameOnCard = By.name("name_on_card");

    By cardNumber = By.name("card_number");

    By cvc = By.name("cvc");

    By expiryMonth = By.name("expiry_month");

    By expiryYear = By.name("expiry_year");

    By payBtn = By.id("submit");

    By successMessage =
            By.xpath("//*[contains(text(),'Congratulations')]");

    // Enter Payment Details
    public void enterPaymentDetails(
            String name,
            String number,
            String cvv,
            String month,
            String year) {

        driver.findElement(nameOnCard).sendKeys(name);

        driver.findElement(cardNumber).sendKeys(number);

        driver.findElement(cvc).sendKeys(cvv);

        driver.findElement(expiryMonth).sendKeys(month);

        driver.findElement(expiryYear).sendKeys(year);
    }

    // Click Pay Button
    public void clickPayButton() {

        driver.findElement(payBtn).click();
    }

    // Verify Order Success
    public boolean isOrderPlaced() {

        return driver.findElement(successMessage).isDisplayed();
    }
}