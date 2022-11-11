package com.syntax.JavaBasics.fileHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class fileHandlingDemo {
    public static void main(String[] args) throws IOException {

        String path="/Users/puskaruprety/eclipse-workspace/SeleniumTest/src/com/syntax/util/Credentials.properties";
        String path1="/Users/puskaruprety/eclipse-workspace/SeleniumTest/src/com/syntax/util/Credentials1.properties";
        //connection to write the data to file
        FileInputStream fileInputStream = new FileInputStream(path);
        FileOutputStream fileOutputStream = new FileOutputStream(path1);

        Properties properties = new Properties();

        properties.load(fileInputStream);
        String username = (String) properties.get("username");
        String password = (String) properties.get("password");
        String phone = properties.getProperty("phoneNumber");
        System.out.println(phone);

        //setting the property
        properties.setProperty("phoneNumber","111111");
        //storing the data
        properties.store(fileOutputStream,"changing the number");

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.id("email")).sendKeys(username);
        driver.findElement(By.id("pass")).sendKeys(password);
    }
}
