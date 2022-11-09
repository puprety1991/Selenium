package com.syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class IframeDemo {
    public static void main(String[] args) {
        String url = "https://chercher.tech/practice/frames";
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver= new ChromeDriver();
        //driver.get(url);
        driver.get("https://chercher.tech/practice/frames");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        WebElement frame1 = driver.findElement(By.id("frame1"));
        driver.switchTo().frame(frame1);
        WebElement textBox = driver.findElement(By.xpath("(//input)[1]"));
        textBox.sendKeys("Hello World");

        WebElement frame3 = driver.findElement(By.id("frame3"));
        driver.switchTo().frame(frame3);
        driver.findElement(By.id("a")).click();

        driver.switchTo().defaultContent();

        WebElement frame2 = driver.findElement(By.id("frame2"));
        driver.switchTo().frame(frame2);
        WebElement AnimalText = driver.findElement(By.xpath("//b[text()='Animals :']"));
        String text = AnimalText.getText();
        System.out.println(text);
        WebElement selectDrp = driver.findElement(By.id("animals"));
        Select select = new Select(selectDrp);
        select.selectByVisibleText("Baby Cat");

    }
}
