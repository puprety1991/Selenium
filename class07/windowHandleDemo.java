package com.syntax.class07;

import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class windowHandleDemo {
    public static void main(String[] args) throws InterruptedException {

        String url = "https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fe-11-d64c77db985c514eb5e1714f4b917-52da65ae5920c676b40faa7b60471433bb3029c2&flowName=GlifWebSignIn&flowEntry=SignUp";
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        click on help button
        WebElement helpBtn = driver.findElement(By.xpath("//a[text()='Help']"));
        helpBtn.click();
//        click on privacy button
        WebElement privacyBtn = driver.findElement(By.xpath("//a[text()='Privacy']"));
        privacyBtn.click();

// the title of my desired page is    Google Account Help

//        get all the window handles
        Set<String> allHandles = driver.getWindowHandles();

        for(String handle:allHandles){
//            switching the focus to the current handle from list
            driver.switchTo().window(handle);
//            get the title of the window to which the driver has switched
            String title = driver.getTitle();

//            compare if the title is of the help
            if(title.equalsIgnoreCase("Google Account Help")){

                System.out.println("the current page under focus is :"+title);
                break;
            }
        }
        //find the community button and cluck on it
        WebElement communityBtn = driver.findElement(By.xpath("//a[text()='Community']"));
        communityBtn.click();

    }
}
