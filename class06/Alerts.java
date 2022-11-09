package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {
        String url = "https://syntaxprojects.com/javascript-alert-box-demo.php";
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        WebElement fClickMeButton =driver.findElement(By.xpath("(//button[text()='Click me!'])[1]"));
        fClickMeButton.click();
        Thread.sleep(2000);

        Alert alert=driver.switchTo().alert();

        alert.accept();
        WebElement sClickMeButton=driver.findElement(By.xpath("(//button[text()='Click me!'])[2]"));
        sClickMeButton.click();
        Thread.sleep(2000);
        alert.accept();

        sClickMeButton.click();
        Thread.sleep(2000);
        alert.dismiss();

        WebElement clickPromptBox =driver.findElement(By.xpath("//button[text()='Click for Prompt Box']"));
        clickPromptBox.click();
        Thread.sleep(2000);
        alert.sendKeys("Hello");
        alert.accept();

    }
}
