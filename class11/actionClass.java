package com.syntax.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class actionClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        maximize
        driver.manage().window().maximize();
        driver.get("https://amazon.com");
        WebElement enHover = driver.findElement(By.xpath("//div[text()='EN']"));
        Actions action = new Actions(driver);
        action.moveToElement(enHover).perform();
        driver.quit();
    }
}
