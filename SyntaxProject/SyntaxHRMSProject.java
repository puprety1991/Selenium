package com.syntax.SyntaxProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class SyntaxHRMSProject {
    public static void main(String[] args) throws IOException, InterruptedException {

        // wrong credentials path
        String path = System.getProperty("user.dir")+"/"+"src"+"/"+"com"+"/"+"syntax"+"/"+"util"+"/"+"wrongCredentials.properties";
        FileInputStream reader = new FileInputStream(path);

        Properties properties = new Properties();

        properties.load(reader);
        String username = properties.getProperty("Username");
        String password = properties.getProperty("password");

        // Right credentials path
        String path1 = System.getProperty("user.dir")+"/"+"src"+"/"+"com"+"/"+"syntax"+"/"+"util"+"/"+"validCredentials.properties";
        FileInputStream reading = new FileInputStream(path1);
        properties.load(reading);
        String username1 = properties.getProperty("Username");
        String password1 = properties.getProperty("password");


        // set up my environment
        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        //login with wrong  credentials
        WebElement txtUsername = driver.findElement(By.id("txtUsername"));
        txtUsername.sendKeys(username);
        WebElement txtPassword = driver.findElement(By.id("txtPassword"));
        txtPassword.sendKeys(password);
        WebElement btnLogin = driver.findElement(By.id("btnLogin"));
        btnLogin.click();

        // Checking valid error message
        WebElement spanMessage = driver.findElement(By.id("spanMessage"));
        String text = spanMessage.getText();
        if(text.equalsIgnoreCase("Invalid credentials")){
            System.out.println("Correct Error Message is displayed: "+"'"+text+"'");
        }else {
            System.out.println("Wrong Error Message is displayed: "+"'"+text+"'");
        }


        // login with valid credentials
        driver.findElement(By.id("txtUsername")).sendKeys(username1);
        driver.findElement(By.id("txtPassword")).sendKeys(password1);
        driver.findElement(By.id("btnLogin")).click();

        // Is logo displayed
        WebElement logo = driver.findElement(By.xpath("//img[@alt='OrangeHRM']"));
        boolean displayed = logo.isDisplayed();
        if(displayed){
            System.out.println("Logo displayed: "+displayed);
        }else {
            System.out.println("Logo  displayed: "+displayed);
        }

        WebElement welcome = driver.findElement(By.id("welcome"));
        welcome.click();
        WebElement aboutDisplayLink = driver.findElement(By.id("aboutDisplayLink"));
        aboutDisplayLink.click();


        driver.quit();

    }
}
