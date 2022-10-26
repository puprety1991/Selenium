package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/*navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
        fill out the form
        click on register
        close the browser*/
public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        String[]id={"customer.firstName","customer.lastName","customer.address.street","customer.address.city",
        "customer.address.state","customer.address.zipCode","customer.phoneNumber","customer.ssn","customer.username",
        "customer.password","repeatedPassword"};
        driver.findElement(By.id(id[0])).sendKeys("Andrew");
        driver.findElement(By.id(id[1])).sendKeys("Lee");
        driver.findElement(By.id(id[2])).sendKeys("6670 Sudley Manor Rd");
        driver.findElement(By.id(id[3])).sendKeys("Manassas");
        driver.findElement(By.id(id[4])).sendKeys("Virginia");
        driver.findElement(By.id(id[5])).sendKeys("22124");
        driver.findElement(By.id(id[6])).sendKeys("703-455-6786");
        driver.findElement(By.id(id[7])).sendKeys("435-65-3456");
        driver.findElement(By.id(id[8])).sendKeys("aLee123");
        driver.findElement(By.id(id[9])).sendKeys("pass123");
        driver.findElement(By.id(id[10])).sendKeys("pass123");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@value='Register']")).click();
        Thread.sleep(2000);
        driver.quit();
    }
}
