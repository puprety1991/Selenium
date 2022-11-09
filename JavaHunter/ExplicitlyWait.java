package com.syntax.JavaHunter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ExplicitlyWait {
    public static void main(String[] args) {
        String url = "https://syntaxprojects.com/dynamic-elements-loading.php";
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to(url);
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver,20);
        WebElement startButton = driver.findElement(By.id("startButton"));
        startButton.click();
       // WebElement expectedOutput = driver.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies']"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[text()='Welcome Syntax Technologies']")));

    }
}
