package com.syntax.practice05;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Alerts{
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/alerts");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement fClickMe = driver.findElement(By.xpath("//button[@id='alertButton']"));
        fClickMe.click();
        //Alert alert = new Alert();
        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        alert.accept();
        WebElement promtButton = driver.findElement(By.id("promtButton"));
        promtButton.click();
        alert.sendKeys("Hello World!");
        Thread.sleep(2000);
        alert.accept();

        Thread.sleep(2000);
        //driver.quit();
    }
}
