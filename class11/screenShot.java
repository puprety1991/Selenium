package com.syntax.class11;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class screenShot {
    public static void main(String[] args) throws IOException {
        String url="http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(url);
        WebElement userName = driver.findElement(By.name("ctl00$MainContent$username"));
        userName.sendKeys("Tester", Keys.TAB);
        WebElement password = driver.findElement(By.name("ctl00$MainContent$password"));
        password.sendKeys("test",Keys.ENTER);

        TakesScreenshot screenshot = (TakesScreenshot)driver;
        //screenshot is taken at this point
        File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(sourceFile,new File("screenshots/SmartBear/adminLogin1.png"));



    }
}
