package com.syntax.XPathCssWaits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class simpleWindowHandling {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://accounts.google.com/signup/v2/webcreateaccount?continue=https%3A%2F%2Faccounts.google.com%2FManageAccount%3Fnc%3D1&biz=false&flowName=GlifWebSignIn&flowEntry=SignUp");
        String mainPageHandle=driver.getWindowHandle(); // getting current window handle
        System.out.println("Parent handle: "+mainPageHandle);
        WebElement helpLink =driver.findElement(By.linkText("Help"));
        helpLink.click();

        Set<String> allWindowHandles=driver.getWindowHandles();//will automatically return LInkHasSet
        System.out.println(allWindowHandles.size());//it will give info how many tabs open

        Iterator<String> it = allWindowHandles.iterator();//creating iterator in order to Iterate through windows
        //mainPageHandle= it.next();//stepping forward to the main page
        String childHandle =it.next();//stepping forward to the child
        System.out.println("Child handle: "+childHandle);
        Thread.sleep(2000);
        driver.switchTo().window(mainPageHandle);
        Thread.sleep(2000);
        driver.close();

    }
}
