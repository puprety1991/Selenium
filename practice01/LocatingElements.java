package com.syntax.practice01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://facebook.com");
         driver.findElement(By.id("email")).sendKeys("puskaruprety2020@gmail.com");
         driver.findElement(By.id("pass")).sendKeys("Puskr019");
         driver.findElement(By.name("login")).click();
         Thread.sleep(2000);
         driver.findElement(By.linkText("Forgot password?")).click();
         //driver.findElement(By.partialLinkText("Forgot")).click();
        Thread.sleep(2000);
        driver.quit();
    }
}
