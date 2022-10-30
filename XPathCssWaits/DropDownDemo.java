package com.syntax.XPathCssWaits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;


public class DropDownDemo {
    public static void main(String[] args) throws InterruptedException {
        String url="https://syntaxprojects.com/basic-select-dropdown-demo.php";
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        WebElement daysDD=driver.findElement(By.id("select-demo"));
        Select select=new Select(daysDD);

        List<WebElement> allOptions=select.getOptions();
        int size= allOptions.size();
        System.out.println(size);
        for(int i=1; i<size; i++){
            String option=allOptions.get(i).getText();
            System.out.println("option = " + option);
            select.selectByIndex(i);
            Thread.sleep(1000);
        }}
}
