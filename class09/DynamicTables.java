package com.syntax.class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DynamicTables {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fDefault.aspx");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        WebElement userName = driver.findElement(By.id("ctl00_MainContent_username"));
        WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
        WebElement loginButton = driver.findElement(By.id("ctl00_MainContent_login_button"));

        userName.sendKeys("Tester");
        password.sendKeys("test");
        loginButton.click();

        int count=1;

    // check the checkBox that contains "scree saver" as a product
        List<WebElement> listProduct = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[3]"));
        for(WebElement product:listProduct){
            String text = product.getText();
            if(text.equalsIgnoreCase("ScreenSaver")){
                System.out.print(count+". ");
                System.out.println(text);
            }
            count++;
        }
    // Get the checkBox
        WebElement checkBox1 = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[2]/td[1]"));
        WebElement checkBox3 = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[4]/td[1]"));

    // click on it
        checkBox1.click();
        checkBox3.click();



        driver.quit();
    }
}
