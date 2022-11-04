package com.syntax.class04;

import com.google.common.collect.Tables;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Task2 {
/*    1.Go to ebay.com
2.get all the categories and print them in the console (in search bar you will see catogeries mentioned as dropdown)
3.select Computers/Tables & Networking
4.click on search
5.verify the title*/
public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.ebay.com/");
//2.get all the categories and print them in the console

    WebElement categories = driver.findElement(By.cssSelector("select#gh-cat"));
    WebElement search=driver.findElement(By.id("gh-btn"));
    Select select = new Select(categories);
    List<WebElement> options = select.getOptions();
    for (WebElement option : options) {
        String text = option.getText();
        System.out.println(text);
        if (text.equalsIgnoreCase("Computers/Tablets & Networking")) {;
            select.selectByVisibleText(text);
            search.click();
            Thread.sleep(2000);
            String title = driver.getTitle();
            if(title.equalsIgnoreCase("Computers, Laptops, Tablets & Network Hardware for Sale - eBay")){
                System.out.println("It is verified.");
            }else{
                System.out.println("It is not verified.");
            }
            driver.quit();
        }


    }

}
}
