package com.syntax.XPathCssWaits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommand {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");
        Thread.sleep(2000);
        WebElement ageRadioButton = driver.findElement(By.xpath("//input[@value='0 - 5']"));
        boolean isEnabled = ageRadioButton.isEnabled();
        if(isEnabled){
            System.out.println("The radio button is enabled");
        }else{
            System.out.println("The radio button is enabled");
        }
        boolean isDisplayed = ageRadioButton.isDisplayed();
        if(isDisplayed){
            System.out.println("The radio button displayed");
        }else{
            System.out.println("The radio button Not displayed");
        }
        System.out.println("before clicking isSelected: "+ageRadioButton.isSelected());
        ageRadioButton.click();
        System.out.println("after clicking isSelected: "+ageRadioButton.isSelected());
        Thread.sleep(2000);

        driver.quit();
    }
}
