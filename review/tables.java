package com.syntax.review;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class tables {
    public static void main(String[] args) {
        //        set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        maximize
        driver.manage().window().maximize();
        //  go to the website
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
                //fill out username
                driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("admin");
        //fill out password
        driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("Hum@nhrm123");
        //press the Login button
        driver.findElement(By.xpath("//input[@name='Submit']")).click();
        //find the PIM button
        WebElement pimBtn = driver.findElement(By.xpath("//b[text()='PIM']"));
        //click on it
        pimBtn.click();
        //find the Employee List
        WebElement employeeListBtn = driver.findElement(By.xpath("//a[text()='Employee List']"));
        //click on it
        employeeListBtn.click();

//        go to table look for the ID 45156A
       // List<WebElement> idColumn = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));
    //    counter variable

        int rowCount=0;
        int idCounter=1;
        boolean notFound = true;
  // a while loop continue to execute till the condition in the parenthesis is TRUE
    while (notFound) {

        List<WebElement> idColumn = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));
        for (WebElement id : idColumn) {
            String personID = id.getText();;
            if (personID.equals("42188A") || personID.equals("42232A")) {
                idCounter++;
                rowCount++;
                WebElement checkBox = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + (rowCount) + "]/td[1]"));
                checkBox.click();
                if(idCounter==2){
                    notFound=false;
                }else{
                    idCounter++;
                    break;
                }
            }
                rowCount++;
        }
        if(notFound){
            WebElement nextBtn = driver.findElement(By.xpath("//a[text()='Next']"));
            nextBtn.click();
            rowCount=0;
        }

        //driver.quit();
        }

    }
}
///table[@id='resultTable']/tbody/tr/td[1]
