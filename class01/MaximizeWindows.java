package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeWindows {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver= new ChromeDriver();
        //maximize window
        driver.manage().window().maximize();
        //fullscreen window
        //driver.manage().window().fullscreen();
        Thread.sleep(2000);
        driver.get("http://google.com");
        driver.quit();
    }
}
