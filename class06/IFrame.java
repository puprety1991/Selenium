package com.syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class IFrame {
    public static void main(String[] args) throws InterruptedException {
        String url = "https://syntaxprojects.com/bootstrap-iframe.php";
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver= new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement firstFrame = driver.findElement(By.name("FrameOne"));
        driver.switchTo().frame(firstFrame);

        WebElement fRegisterClick = driver.findElement(By.id("makaha-ButtonElement--XMO5BoJfiAVGcnXXwIIj"));
        fRegisterClick.click();

        driver.switchTo().defaultContent();

        WebElement secondFrame = driver.findElement(By.name("FrameTwo"));
        driver.switchTo().frame(secondFrame);
        WebElement sRegisterClick = driver.findElement(By.id("makaha-ButtonElement--XMO5BoJfiAVGcnXXwIIj"));
        sRegisterClick.click();

        Thread.sleep(4000);

        driver.switchTo().defaultContent();
        driver.quit();


    }
}
