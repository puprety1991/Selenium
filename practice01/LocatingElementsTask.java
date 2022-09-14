package com.syntax.practice01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElementsTask {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/Login.aspx");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        driver.findElement(By.name("ctl00$MainContent$login_button")).click();
        String title = driver.getTitle();
        System.out.println(title);
        if(title.equalsIgnoreCase("Web Orders")){
            System.out.println("Its verified");
        }else{
            System.out.println("Its not verified");
        }
        Thread.sleep(2000);
        driver.findElement(By.id("ctl00_logout")).click();
        Thread.sleep(3000);
        driver.quit();
    }
}
