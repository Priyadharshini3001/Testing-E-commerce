package com.autoqa.pages;

import com.autoqa.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    By signupLoginBtn =
            By.xpath("//a[contains(text(),'Signup / Login')]");

    By email =
            By.xpath("//input[@data-qa='login-email']");

    By password =
            By.xpath("//input[@data-qa='login-password']");

    By loginBtn =
            By.xpath("//button[@data-qa='login-button']");

    By logoutBtn =
            By.xpath("//a[contains(text(),'Logout')]");

    By errorMessage =
            By.xpath("//*[contains(text(),'incorrect')]");

    public void openLoginPage() {
        click(signupLoginBtn);
    }

    public void login(String userEmail, String userPassword) {

        openLoginPage();

        type(email, userEmail);

        type(password, userPassword);

        click(loginBtn);
    }

    public boolean isLogoutVisible() {

        return isDisplayed(logoutBtn);
    }

    public String getErrorMessage() {

        return getText(errorMessage);
    }
}