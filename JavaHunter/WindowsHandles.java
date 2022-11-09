package com.syntax.JavaHunter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class WindowsHandles {
    public static void main(String[] args) {
        String url = "https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp";
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement helpText = driver.findElement(By.xpath("//a[text()='Help']"));
        helpText.click();
        String mainPage = driver.getWindowHandle();//we are getting the parent tab..assigning inside the mainPage
        Set<String> windowHandles = driver.getWindowHandles();
        System.out.println(windowHandles.size());// number of tabs you opened
        for (Iterator<String> iterator = windowHandles.iterator(); iterator.hasNext(); ) {
            String helpPage = iterator.next();
            driver.switchTo().window(helpPage);
            String title = driver.getTitle();
            if (title.equals("Google Account Help")) {
                System.out.println(title);
                driver.close();
            }


        }
        //driver.switchTo().window(mainPage);


    }
}
