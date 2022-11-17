package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class HW {
 /*
    go to https://the-internet.herokuapp.com/dynamic_controls
    click on checkbox and click on remove
    verify the text
    click on enable verify the textbox is enabled
    enter text and click disable
    verify the textbox is disabled
 */
 public static void main(String[] args) {
     String url="https://the-internet.herokuapp.com/dynamic_controls";
     System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
     WebDriver driver=new ChromeDriver();
     driver.get(url);
     driver.manage().window().maximize();

     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
     WebDriverWait wait = new WebDriverWait(driver,20);

     WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
     WebElement removeButton = driver.findElement(By.xpath("//button[@onclick='swapCheckbox()']"));
     checkBox.click();
     removeButton.click();

     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));

     WebElement textDisplay = driver.findElement(By.xpath("//p[@id='message']"));
     String getText = textDisplay.getText();
     if(getText.equalsIgnoreCase("It's gone!")){
         System.out.println("Text verified: "+getText);
     }else {
         System.out.println("Text is not verified: "+getText);
     }

     WebElement enableButton = driver.findElement(By.xpath("//button[text()='Enable']"));
     enableButton.click();


     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));

     WebElement textBox = driver.findElement(By.xpath("//input[@type='text']"));
     WebElement disableButton = driver.findElement(By.xpath("//button[text()='Disable']"));
     boolean isTextBoxEnable = textBox.isEnabled();
     if(isTextBoxEnable){
         System.out.println("Textbox is enable: "+isTextBoxEnable);
         textBox.sendKeys("Syntax Technologies");

     }else{
         System.out.println("Textbox is disabled");
     }

     disableButton.click();

     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));

     WebElement displayMsg = driver.findElement(By.xpath("//p[@id='message']"));
     String disableText = displayMsg.getText();
     if(disableText.equalsIgnoreCase("It's disabled!")){
         System.out.println("It's verified: "+disableText);
     }else{
         System.out.println("It's verified that textBox is Enabled");

     }
     driver.quit();
 }
}
