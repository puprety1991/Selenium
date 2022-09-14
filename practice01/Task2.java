package com.syntax.practice01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://facebook.com");
        driver.manage().window().maximize();
        //driver.manage().window().fullscreen();
        String title= driver.getTitle();
        if(title.equalsIgnoreCase("Facebook - Log In or Sign Up")){
            System.out.println("Title is right");
        }else{
            System.out.println("Title is Wrong");
        }
    }
}
