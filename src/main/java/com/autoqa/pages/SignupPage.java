package com.autoqa.pages;

import com.autoqa.base.BasePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignupPage extends BasePage {

    WebDriver driver;

    public SignupPage(WebDriver driver) {

        super(driver);
        this.driver = driver;
    }

    // Signup
    By name =
            By.name("name");

    By email =
            By.xpath("//input[@data-qa='signup-email']");

    By signupBtn =
            By.xpath("//button[@data-qa='signup-button']");

    // Account Info
    By mrRadio =
            By.id("id_gender1");

    By passwordField =
            By.id("password");

    By day =
            By.id("days");

    By month =
            By.id("months");

    By year =
            By.id("years");

    By firstName =
            By.id("first_name");

    By lastName =
            By.id("last_name");

    By address =
            By.id("address1");

    By country =
            By.id("country");

    By state =
            By.id("state");

    By city =
            By.id("city");

    By zipcode =
            By.id("zipcode");

    By mobile =
            By.id("mobile_number");

    By createAccountBtn =
            By.xpath("//button[@data-qa='create-account']");

    By accountCreatedText =
            By.xpath("//b[text()='Account Created!']");

    // Register User
    public void register(
            String user,
            String mail) {

        // Signup
        type(name, user);

        type(email, mail);

        click(signupBtn);

        // Fill Account Info
        click(mrRadio);

        type(passwordField, "Test@123");

        driver.findElement(day)
                .sendKeys("10");

        driver.findElement(month)
                .sendKeys("May");

        driver.findElement(year)
                .sendKeys("2000");

        type(firstName, "Guru");

        type(lastName, "Test");

        type(address, "Chennai");

        driver.findElement(country)
                .sendKeys("India");

        type(state, "Tamil Nadu");

        type(city, "Chennai");

        type(zipcode, "600001");

        type(mobile, "9876543210");

        click(createAccountBtn);
    }

    // Verify Account Created
    public boolean isAccountCreated() {

        return driver.findElement(
                        accountCreatedText)
                .isDisplayed();
    }
}