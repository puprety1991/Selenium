package com.syntax.practice01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLaunchBrowser {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");
        Thread.sleep(2000);
        String title = driver.getTitle();
        String url = driver.getCurrentUrl();
        System.out.println(title+", "+url);
        driver.findElement(By.linkText("Input Forms")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Input Form Submit")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("first_name")).sendKeys("Omar");
        driver.findElement(By.name("last_name")).sendKeys("Sharma");
        Thread.sleep(2000);
        driver.quit();
    }
}
