package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Task3 {
    /*
      1.Goto https://syntaxprojects.com/dynamic-elements-loading.php
      2.Click on start button
      3.Get the text Welcome Syntax technologies and print on console.
       */
public static void main(String[] args) {
    String url = "https://syntaxprojects.com/dynamic-elements-loading.php";
    System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
    WebDriver driver = new ChromeDriver();
    driver.get(url);
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    WebElement startButton = driver.findElement(By.id("startButton"));
    startButton.click();
    WebElement msg = driver.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies']"));
    String text = msg.getText();
    System.out.println("message displayed: "+text);

  }
}
