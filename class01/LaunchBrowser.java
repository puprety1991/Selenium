package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.file.Watchable;

public class LaunchBrowser {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://google.com");
        driver.manage().window().maximize();
        driver.navigate().to("http://facebook.com");
        Thread.sleep(100);
        driver.quit();
        System.out.println("hello world");
    }
}
