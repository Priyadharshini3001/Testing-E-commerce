package com.autoqa.base;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver) {

        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public void click(By locator) {

        WebElement element =
                wait.until(ExpectedConditions.elementToBeClickable(locator));

        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].click();", element);
    }

    public void type(By locator, String text) {

        WebElement element =
                wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

        element.clear();
        element.sendKeys(text);
    }

    public boolean isDisplayed(By locator) {

        try {
            return wait.until(
                            ExpectedConditions.visibilityOfElementLocated(locator))
                    .isDisplayed();

        } catch (Exception e) {
            return false;
        }
    }

    public String getText(By locator) {

        return wait.until(
                        ExpectedConditions.visibilityOfElementLocated(locator))
                .getText();
    }
}