package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
    public static void main(String[] args) {
        String url="https://syntaxprojects.com/basic-first-form-demo.php";
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to(url);
        driver.findElement(By.id("user-message")).sendKeys("Hello world");
        

    }
}
