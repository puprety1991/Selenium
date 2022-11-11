package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Task2 {
    /*
      1. goto https://syntaxprojects.com/dynamic-data-loading-demo.php
      2. click on get New User
      3. get the firstname  of user and print it on console
       */
public static void main(String[] args) {
    String url = "https://syntaxprojects.com/dynamic-data-loading-demo.php";
    System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
    WebDriver driver = new ChromeDriver();
    driver.get(url);
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    WebElement getNewUser = driver.findElement(By.id("save"));
    getNewUser.click();
    WebElement getUserName = driver.findElement(By.xpath("//p[contains(text(),'First Name : ')]"));
    String firstName = getUserName.getText();
    System.out.println(firstName);
    driver.quit();
}
}
