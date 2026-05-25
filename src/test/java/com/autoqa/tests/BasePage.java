package com.autoqa.base;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {

    WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    // Click Method
    public void click(By locator) {

        WebElement element = driver.findElement(locator);

        // Scroll to element
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);

        // JS Click
        js.executeScript("arguments[0].click();", element);
    }

    // Type Method
    public void type(By locator, String text) {

        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
    }

    // Get Text
    public String getText(By locator) {

        return driver.findElement(locator).getText();
    }

    // Display Check
    public boolean isDisplayed(By locator) {

        return driver.findElement(locator).isDisplayed();
    }
}