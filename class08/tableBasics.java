package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class tableBasics {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    // print the whole table on the console
        WebElement allTable = driver.findElement(By.xpath("//table[@id='customers']"));
        String textAllTable = allTable.getText();
    //    System.out.println(textAllTable);

    // print all the rows from the table
        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
        for(WebElement row: rows){
            String text = row.getText();
           // System.out.println(text);
           // System.out.println("--------------");

        }
        System.out.println();
        var iterator = rows.listIterator();
        while(iterator.hasNext()){
            var row = iterator.next();
            String text = row.getText();
            if(text.contains("Google")){
               // System.out.println(text);
            }

        }
    //  print all the individual columns of the table
        List<WebElement> columns = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
        for(WebElement column:columns){
            String text = column.getText();
            System.out.println(text);
            System.out.println("------------");
        }

        driver.quit();
    }
}
