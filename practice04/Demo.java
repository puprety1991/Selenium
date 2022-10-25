package com.syntax.practice04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");
        driver.findElement(By.linkText("Alerts & Modals")).click();

        driver.findElement(By.linkText("Window Popup Modal")).click();

        WebElement button = driver.findElement(By.linkText("Follow On Instagram"));

        button.click();

        // Store the current window handle
        String winHandleBefore = driver.getWindowHandle();

        // Perform the click operation that opens new window

        // Switch to new window opened
        for(String winHandle : driver.getWindowHandles())
        {
            driver.switchTo().window(winHandle);
        }


        driver.manage().window().maximize();


        //div[contains(text(),'Follow')]


        //div[contains(text(),'Log In')]


        Thread.sleep(2000);
        button = driver.findElement(By.xpath("//div[text()='Follow']"));
        Thread.sleep(4000);
        button.click();

        //button.click();


        //button = driver.findElement(By.linkText("Follow"));

        //button.click();



        // Perform the actions on new window

        Thread.sleep(1000);

        // Close the new window, if that window no more required
        driver.close();

        // Switch back to original browser (first window)
        driver.switchTo().window(winHandleBefore);

        // Continue with original browser (first window)

        button = driver.findElement(By.linkText("Like us On Facebook"));

        button.click();

        Thread.sleep(1000);

        // Close the new window, if that window no more required
        driver.close();
    }
}
