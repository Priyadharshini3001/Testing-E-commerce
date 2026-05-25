package com.autoqa.base;

import com.autoqa.utils.ConfigReader;
import com.autoqa.utils.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    public WebDriver driver;

    @BeforeMethod
    public void setup() {

        driver = DriverFactory.initializeDriver();

        driver.get(ConfigReader.getProperty("baseUrl"));
    }

    @AfterMethod
    public void teardown() {

        if (driver != null) {
            driver.quit();
        }
    }
}