package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class GetAllLinks {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.ebay.com/");
        // get all the links ie. anchor tags from the website
        List<WebElement>ebayLInks =driver.findElements(By.tagName("a"));
        // print the size
        System.out.println("The size of the list is: "+ebayLInks.size());
        // implementing a for loop to traverse through the list of WebElements
        for(WebElement ebayLink:ebayLInks){
            String link = ebayLink.getAttribute("href");
            ///print the link
            System.out.println(link);
        }
        driver.quit();
    }
}
