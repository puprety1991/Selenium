package com.syntax.practice03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementsCommands {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");
        driver.navigate().to("https://omayo.blogspot.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
       WebElement bikeButton =  driver.findElement(By.xpath("//input[@value = 'Bike']"));
        WebElement bicycleButton =  driver.findElement(By.xpath("//input[@value = 'Bicycle']"));
        boolean isSelected = bikeButton.isSelected();
        System.out.println("before selecting: "+bikeButton.isSelected());
        boolean isEnabled = bikeButton.isEnabled();
        System.out.println(isEnabled);
        bikeButton.click();
        System.out.println("After selecting: "+bikeButton.isSelected());

       //bicycleButton.click();
        System.out.println(bikeButton);
        driver.quit();


    }
}
