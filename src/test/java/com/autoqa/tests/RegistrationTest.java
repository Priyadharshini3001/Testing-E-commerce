package com.autoqa.tests;

import com.autoqa.base.BaseTest;
import com.autoqa.pages.LoginPage;
import org.testng.annotations.Test;

public class RegistrationTest extends BaseTest {

    @Test
    public void verifyRegistrationPage() {

        LoginPage loginPage =
                new LoginPage(driver);

        loginPage.openLoginPage();
    }
}