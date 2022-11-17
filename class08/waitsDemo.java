package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class waitsDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    //    click on the button "change text to selenium webDriver"
        WebElement changeTextButton = driver.findElement(By.id("populate-text"));
        changeTextButton.click();

    //     get the text selenium webDriver
        WebElement webDriverText = driver.findElement(By.xpath("//h2[text()='Selenium Webdriver']"));
    //     print out text on the screen
        System.out.println(webDriverText.getText());

    // click on button "display text after 10 sec"
        WebElement displayTextButton = driver.findElement(By.id("display-other-button"));
        displayTextButton.click();
    // as the button appears up after some time so in order to click it or get text from it we need to
    //  define some explicit wait

        WebDriverWait wait = new WebDriverWait(driver,20);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Enabled']")));
        WebElement enabledButton = driver.findElement(By.xpath("//button[text()='Enabled']"));
        String text = enabledButton.getText();
        System.out.println(text);
        boolean enabled = enabledButton.isEnabled();
        System.out.println(enabled);
        enabledButton.click();



        WebElement enabledAfterButton = driver.findElement(By.id("enable-button"));
        enabledAfterButton.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.id("disable")));

        WebElement disableButton = driver.findElement(By.id("disable"));
        disableButton.click();


        //driver.quit();


    }
}
