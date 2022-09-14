package com.syntax.practice03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LinkCount {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://amazon.com");
        driver.manage().window().maximize();
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());
        for(WebElement allLink : links){
            String fullLink = allLink.getAttribute("href");
            String linkText = allLink.getText();
            if(!linkText.isEmpty()){
                System.out.println(linkText+" ----> "+fullLink);
            }
        }
        driver.quit();
    }
}
