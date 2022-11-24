package com.syntax.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;



public class keyValues {
    public static void main(String[] args) {
        String url="http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(url);
        WebElement userName = driver.findElement(By.name("ctl00$MainContent$username"));
        userName.sendKeys("Tester", Keys.TAB);
        WebElement password = driver.findElement(By.name("ctl00$MainContent$password"));
        password.sendKeys("test",Keys.ENTER);

    }
}
