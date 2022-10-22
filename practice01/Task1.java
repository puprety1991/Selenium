package com.syntax.practice01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        /*
        1. launch the browser
        2.navigate to amazon website
        3. print out the title and the url in the console.
         */

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        String url = driver.getCurrentUrl();
        System.out.println(url);
        String title = driver.getTitle();
        System.out.println(title);
        driver.navigate().to("https://www.amazon.com/");
        driver.navigate().back();
        Thread.sleep(1000); // pauses the thread for the given millisecs
        driver.navigate().forward();
        Thread.sleep(1000);
        driver.navigate().refresh();
        //driver.close(); close current tab
        driver.quit(); // will quit the whole browser
    }
}

