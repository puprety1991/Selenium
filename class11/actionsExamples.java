package com.syntax.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class actionsExamples {
    public static void main(String[] args) {
        String url="http://demo.guru99.com/test/simple_context_menu.html";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(url);

        WebElement rightClickBtn = driver.findElement(By.xpath("//span[text()='right click me']"));
        Actions action = new Actions(driver);
        action.contextClick(rightClickBtn).perform();
        WebElement Edit = driver.findElement(By.xpath("//span[text()='Edit']"));
        Edit.click();

    }
}
