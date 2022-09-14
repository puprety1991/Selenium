package com.syntax.practice01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPracticeToLocatingElement {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/Login.aspx");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name = 'ctl00$MainContent$username']")).sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        driver.findElement(By.name("ctl00$MainContent$login_button")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("View all products")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Order")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("ctl00$MainContent$fmwOrder$txtQuantity")).sendKeys("5");
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtDiscount")).sendKeys("2");
        driver.findElement(By.xpath("//input[@type = 'submit']")).click();
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName")).sendKeys("Harry Sharma");
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox2")).sendKeys("434 roderick street");
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox3")).sendKeys("IL");
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5")).sendKeys("204354");
        driver.findElement(By.linkText("Process")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("View all orders")).click();
        Thread.sleep(3000);
        driver.quit();


    }
}
