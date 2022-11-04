package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class MultipleSelectDropDown {
    public static void main(String[] args) throws InterruptedException {
        String url = "http://syntaxprojects.com/basic-select-dropdown-demo.php";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to(url);
        driver.manage().window().maximize();
        WebElement drpDwn =driver.findElement(By.id("multi-select"));
        Select select = new Select(drpDwn);
        // By index
        select.selectByIndex(3);
        select.selectByVisibleText("Texas");
        List<WebElement> options=select.getOptions();
        for(int i=0;i<options.size();i++){
            select.selectByIndex(i);
        }
        Thread.sleep(3000);
        select.deselectAll();
        boolean multiSelect = select.isMultiple();
        System.out.println("Is multi Select: "+multiSelect);
        driver.quit();
    }
}
