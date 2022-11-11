package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ImplicitWait {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

//  go to faceBook.com
        driver.get("https://www.facebook.com/%22");

//        click on create new account
        WebElement createNewAccountBtn = driver.findElement(By.xpath("//a[text()='Create New Account']"));
        createNewAccountBtn.click();


//        Send the first name
        WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
        firstName.sendKeys("abracadabra");

    }
}
