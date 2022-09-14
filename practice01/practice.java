package com.syntax.practice01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");
        driver.navigate().to("http://amazon.com");
        Thread.sleep(1000);
        driver.navigate().forward();
        driver.navigate().refresh();



    }
}
