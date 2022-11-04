package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxDemo2 {
    public static void main(String[] args) throws InterruptedException {
        String url = "http://syntaxprojects.com/basic-checkbox-demo.php";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to(url);
        driver.manage().window().maximize();
        // find all the checkboxes
        List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@class='cb1-element']"));
        //traverse through list of checkboxes to find the desired one
        for (WebElement checkBox : checkBoxes) {
// get the attribute value to check if this is the right option to select
            String optionName = checkBox.getAttribute("value");
            //if condition to make sure it is the right checkbox
            if(optionName.equalsIgnoreCase("Option-2")){
                // if it passed then click on it.
                checkBox.click();
            }
        }
    }
}