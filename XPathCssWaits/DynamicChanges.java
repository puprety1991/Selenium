package com.syntax.XPathCssWaits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicChanges {
    public static void main(String[] args) throws InterruptedException {
        String url="https://syntaxprojects.com/dynamic-data-loading-demo.php";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        Thread.sleep(2000);
        WebDriverWait wait = new WebDriverWait(driver, 20);
        WebElement getNewUser =driver.findElement(By.xpath("//button[contains(text(),'Get New User')]"));
        for(int i=0;i<3;i++){
           getNewUser.click();
            Thread.sleep(1000);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'First Name :')]")));

            WebElement text=driver.findElement(By.xpath("//p[contains(text(),'First Name')]"));
            String firstName= text.getText();
            System.out.println(firstName);
        }
        driver.quit();




    }



}
