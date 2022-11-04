package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDemo {
    public static void main(String[] args) throws InterruptedException {
        String url = "http://syntaxprojects.com/basic-checkbox-demo.php";
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to(url);
        driver.manage().window().maximize();
        WebElement checkBox =driver.findElement(By.id("isAgeSelected"));
        checkBox.click();
        Thread.sleep(2000);
        driver.quit();
    }
}
