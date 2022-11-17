package com.syntax.practice05;

import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class Frames {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://chercher.tech/practice/frames");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        WebElement frame1 = driver.findElement(By.id("frame1"));
        driver.switchTo().frame(frame1);
        WebElement textBox = driver.findElement(By.xpath("//input"));
        textBox.sendKeys("Hello World");

        WebElement frame3 = driver.findElement(By.id("frame3"));
        driver.switchTo().frame(frame3);
        driver.findElement(By.id("a")).click();

        driver.switchTo().defaultContent();

        WebElement frame2 = driver.findElement(By.id("frame2"));
        driver.switchTo().frame(frame2);
        WebElement animals = driver.findElement(By.id("animals"));
        Select select = new Select(animals);
        select.selectByVisibleText("Baby Cat");
        Thread.sleep(3000);
        driver.quit();

    }

}
