package com.autoqa.tests;

import com.autoqa.base.BaseTest;
import com.autoqa.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidationTest extends BaseTest {

    @Test
    public void verifyInvalidLogin() {

        LoginPage login = new LoginPage(driver);

        login.openLoginPage();

        login.login("wrong@gmail.com", "wrong123");

        Assert.assertTrue(
                login.getErrorMessage()
                        .contains("incorrect")
        );
    }
}