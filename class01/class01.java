package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class class01 {
    public static void main(String[] args) {
        //set the path to the driver to the link it with our class
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        //create WebDriver instance
        WebDriver driver= new ChromeDriver();
        // use get() function to open up the required website
        driver.get("http://google.com");
        //get the url
        String url = driver.getCurrentUrl();
        System.out.println(url);
        //get the title
        String title = driver.getTitle();
        System.out.println(title);
        //use equal method to check its condition
        if(title.equals("Google")){
            System.out.println("This is the right title");
        }else{
            System.out.println("Wrong title");
        }
        //close the browser
        driver.quit();

    }
}

