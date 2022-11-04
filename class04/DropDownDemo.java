package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownDemo {

    public static void main(String[] args) throws InterruptedException {
        String url = "http://syntaxprojects.com/basic-select-dropdown-demo.php";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to(url);
        driver.manage().window().maximize();
        WebElement clickSelect =driver.findElement(By.id("select-demo"));
        clickSelect.click();
        Select select = new Select(clickSelect);
        select.selectByVisibleText("Tuesday");
        Thread.sleep(2000);

        //get all the options available in the dropdown
        List<WebElement> options=select.getOptions();
        for(int i=0;i<options.size();i++){
            WebElement option=options.get(i);
            String text =option.getText();
            if(text.equalsIgnoreCase("Friday")){
                select.selectByIndex(i);
            }

        }
        driver.quit();
    }
}