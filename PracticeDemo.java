package com.syntax;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class PracticeDemo {
    public static void main(String[] args) throws InterruptedException {
        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
       WebElement userName = driver.findElement(By.id("txtUsername"));
       WebElement password = driver.findElement(By.id("txtPassword"));
       WebElement loginButton = driver.findElement(By.id("btnLogin"));
       userName.sendKeys("Admin");
       password.sendKeys("Hrm124");
       loginButton.click();
       WebElement errorMsg = driver.findElement(By.xpath("//span[text()='Invalid credentials']"));
       String errorText = errorMsg.getText();
       if(errorText.equals("Invalid credentials")){
           System.out.println("Invalid credentials displayed.");
       }else{
           System.out.println("Got the wrong error message.");
       }
       driver.quit();
    }
}