package com.syntax.practice04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxDemo {
    public static String url = "http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fDefault.aspx";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
        driver.findElement(By.id("ctl00_MainContent_login_button")).click();
        Thread.sleep(2000);
        List<WebElement> optionCheckBoxes =driver.findElements(By.xpath("//input[@type = 'checkbox']"));
        int optionCount = optionCheckBoxes.size();
        System.out.println(optionCount);
        for(WebElement checkBoxes:optionCheckBoxes){
            if(checkBoxes.isEnabled()){
                String value = checkBoxes.getAttribute("value");
                
                checkBoxes.click();
                Thread.sleep(1000);
            }



                }

            }

        }
        //driver.quit();

////input[@type = 'checkbox']

//ctl00_MainContent_orderGrid_ctl04_OrderSelector

