package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Task1 {
   /*
    1.goto http://accounts.google.com/signup
    2.click on help and privacy btn
    3.click on community Button
    4.goto gmail.com page and enter your username in form
     */
   public static void main(String[] args) throws InterruptedException {
       String url = "http://accounts.google.com/signup";
       System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
       WebDriver driver = new ChromeDriver();
       driver.get(url);
       driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
       WebElement helpLink = driver.findElement(By.xpath("//a[text()='Help']"));
       WebElement privacyLink = driver.findElement(By.xpath("//a[text()='Privacy']"));
       helpLink.click();
       privacyLink.click();
       String mainPage = driver.getWindowHandle();
       Set<String> windowHandles = driver.getWindowHandles();
       for(String handle:windowHandles){
           driver.switchTo().window(handle);
       }
       WebElement communityLink = driver.findElement(By.xpath("//a[text()='Community']"));
       communityLink.click();
       Thread.sleep(2000);
       driver.switchTo().window(mainPage);
       WebElement usernameBox = driver.findElement(By.id("username"));
       usernameBox.sendKeys("syntax123");
       Thread.sleep(2000);
       driver.quit();



   }

}
