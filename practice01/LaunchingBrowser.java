package com.syntax.practice01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.file.Watchable;

public class LaunchingBrowser {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");
        String title = driver.getTitle();
        System.out.println(title);
        driver.wait(1000);
        driver.navigate().to("http://facebook.com");
    }
}
