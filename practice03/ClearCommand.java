package com.syntax.practice03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearCommand {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fDefault.aspx");
        driver.manage().window().maximize();
        WebElement isUsername = driver.findElement(By.xpath("//input[@name = 'ctl00$MainContent$username']"));
        isUsername.sendKeys("Tester");
        WebElement isPass = driver.findElement(By.xpath("//input[@id = 'ctl00_MainContent_password']"));
        isPass.sendKeys("test");

        Thread.sleep(2000);
        isUsername.clear();
        isPass.clear();
        driver.quit();




    }
}
