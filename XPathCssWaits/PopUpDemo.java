package com.syntax.XPathCssWaits;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpDemo {
    public static void main(String[] args) throws InterruptedException {
        String url="https://syntaxprojects.com/javascript-alert-box-demo.php";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        WebElement clickMeButton =driver.findElement(By.xpath("//button[text()='Click me!']"));
        clickMeButton.click();
        Thread.sleep(2000);
       Alert popUp= driver.switchTo().alert();
       popUp.accept();
       WebElement promptBoxButton=driver.findElement(By.xpath("//button[text()='Click for Prompt Box']"));
       promptBoxButton.click();
        Thread.sleep(2000);
       Alert promptAlert=driver.switchTo().alert();
       promptAlert.dismiss();
       promptBoxButton.click();
       Thread.sleep(900);
        Alert promptAlert1=driver.switchTo().alert();
        Thread.sleep(1000);
        promptAlert1.sendKeys("Janel");
        promptAlert1.accept();



    }
}
