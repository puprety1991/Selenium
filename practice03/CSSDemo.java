package com.syntax.practice03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.WeakHashMap;

public class CSSDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fDefault.aspx");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        System.out.println(title);
        driver.findElement(By.cssSelector("input#ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.cssSelector("input[name $= 'password']")).sendKeys("test");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input.button")).click();
        driver.findElement(By.cssSelector("a[id = 'ctl00_MainContent_btnCheckAll' ]")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[src= 'App_Themes/Default/images/button_edit.gif' ]")).click();
        driver.findElement(By.cssSelector("input[name= 'ctl00$MainContent$fmwOrder$TextBox5' ]")).sendKeys("20155");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("a.btn_light")).click();
        driver.quit();

    }
}
