package com.syntax.practice01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTask {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");
        //Thread.sleep(2000);
        driver.navigate().to("http://facebook.com");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@class = '_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
        Thread.sleep(2000);
        //driver.quit();
        driver.findElement(By.xpath("//input[@name = 'firstname']")).sendKeys("Prakriti");
        driver.findElement(By.xpath("//input[@name = 'lastname']")).sendKeys("Uprety");
        driver.findElement(By.xpath("//input[@name = 'reg_email__']")).sendKeys("loveyou@gmail.com");
        driver.findElement(By.xpath("//input[@name = 'reg_passwd__']")).sendKeys("puskrity");
        driver.findElement(By.xpath("//button[@class = '_6j mvm _6wk _6wl _58mi _3ma _6o _6v']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//img[@class = '_8idr img']")).click();
        Thread.sleep(2000);
        driver.close();
        driver.quit();
    }
}
//<input type="text" class="inputtext _58mg _5dba _2ph-" data-type="text" name="firstname" value="" aria-required="true" placeholder="First name" aria-label="First name" id="u_o_b_+P" tabindex="0">
