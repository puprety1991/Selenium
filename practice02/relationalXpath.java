package com.syntax.practice02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class relationalXpath {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fDefault.aspx");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        System.out.println(title);
        driver.findElement(By.name("login")).click();

        driver.findElement(By.xpath("//input[@name = 'ctl00$MainContent$username']")).sendKeys("Tester");
        driver.findElement(By.xpath("//input[@id = 'ctl00_MainContent_password']")).sendKeys("test");
        driver.findElement(By.xpath("//input[contains(@id, 'ctl00_MainContent_login_button')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[starts-with(text(), 'L')]")).click();
        Thread.sleep(2000);
        driver.quit();
    }
}