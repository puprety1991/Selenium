package com.syntax.practice01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingTaskPractice {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.findElement(By.id("customer.firstName")).sendKeys("Joe");
        driver.findElement(By.name("customer.lastName")).sendKeys("Biden");
        driver.findElement(By.name("customer.address.street")).sendKeys("43434 Newrock loop");
        driver.findElement(By.id("customer.address.city")).sendKeys("Oak Forest");
        driver.findElement(By.id("customer.address.state")).sendKeys("Virginia");
        driver.findElement(By.name("customer.address.zipCode")).sendKeys("22323");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("708 434 54565");
        driver.findElement(By.id("customer.ssn")).sendKeys("434 54 6566");
        driver.findElement(By.id("customer.username")).sendKeys("joeRocker");
        driver.findElement(By.name("customer.password")).sendKeys("nevergiveup");
        driver.findElement(By.id("repeatedPassword")).sendKeys("nevergiveup");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//input[@value = 'Register']")).click();
        Thread.sleep(4000);


        driver.quit();
    }
}
