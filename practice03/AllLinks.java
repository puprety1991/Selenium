package com.syntax.practice03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AllLinks {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://facebook.com");
        List<WebElement> links =driver.findElements(By.tagName("a"));
        System.out.println(links.size());
        for(WebElement allLinks : links){
            String linkList = allLinks.getAttribute("href");
            String linkText = allLinks.getText();
            if(!linkText.isEmpty()){
                System.out.println(linkText+" -------> "+linkList);
            }
        }
        driver.quit();
    }
}
