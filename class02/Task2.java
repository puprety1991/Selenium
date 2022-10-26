package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/*navigate to fb.com
    click on create new account
    fill up all the textboxes
   close the pop up
   close the browser*/
public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Create new account")).click();
        //Thread.sleep(1000);
        driver.findElement(By.name("firstname")).sendKeys("Alex");
        driver.findElement(By.name("lastname")).sendKeys("Patel");
        driver.findElement(By.name("reg_email__")).sendKeys("patelAlex@gmail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("pass123");
        Thread.sleep(2000);
        driver.findElement(By.name("websubmit")).click();
        Thread.sleep(1000);

        driver.quit();
    }
}
