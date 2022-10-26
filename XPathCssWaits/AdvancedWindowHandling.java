package com.syntax.XPathCssWaits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class AdvancedWindowHandling {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/window-popup-modal-demo.php");
        driver.manage().window().maximize();
       WebElement instaButton= driver.findElement(By.xpath("//a[@title='Follow @syntaxtech on Instagram']"));
        WebElement fbButton=driver.findElement(By.xpath("//a[@title='Follow @syntaxtech on Facebook']"));
       WebElement bothButton= driver.findElement(By.xpath("//a[text()='Follow Instagram & Facebook']"));
        Thread.sleep(2000);
       instaButton.click();
        Thread.sleep(2000);
       fbButton.click();
        Thread.sleep(2000);
       bothButton.click();
        Thread.sleep(2000);
       String MainPage=driver.getWindowHandle();
       Set<String> allWindowHandles =driver.getWindowHandles();
        System.out.println(allWindowHandles.size());
        Iterator<String> it =allWindowHandles.iterator();
        while(it.hasNext()){//start iterating through handle
            String handle=it.next();//get the next handle
            if(!handle.equals(MainPage)){//set a condition
                driver.switchTo().window(handle);//switch to child window
                driver.manage().window().maximize();
                String title=driver.getTitle();
                System.out.println(title);
                driver.close();
            }
        }
       driver.switchTo().window(MainPage);//switch back to parent window
        instaButton.click();
    }
}
