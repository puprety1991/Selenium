package com.syntax.WindowHandles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class GmailHelp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver,20);
        WebElement helpText =driver.findElement(By.xpath("//a[text()='Help']"));
        helpText.click();
        String mainPage=driver.getWindowHandle();
        Set<String> windowHandles = driver.getWindowHandles();
        System.out.println(windowHandles.size());
        for (Iterator<String> iterator = windowHandles.iterator(); iterator.hasNext(); ) {
            String handle = iterator.next();
            if (!handle.equals(mainPage)) {
                driver.switchTo().window(handle);
                String title = driver.getTitle();
                System.out.println(title);
            }
            driver.switchTo().window(mainPage);
        }

        driver.quit();

    }
}
