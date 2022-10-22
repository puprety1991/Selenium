package com.syntax.practice02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchFacebook {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver face=new ChromeDriver();
        face.get("https://facebook.com/");

        face.findElement(By.id("email")).sendKeys("janel@gmail.com");
        face.findElement(By.id("pass")).sendKeys("janel123");

        Thread.sleep(2000);
        face.findElement(By.linkText("Forgot password?")).click();
        Thread.sleep(2000);
        face.findElement(By.id("identify_email")).sendKeys("545454545");
        Thread.sleep(3000);
        face.findElement(By.id("did_submit")).click();
        Thread.sleep(3000);
        //face.findElement(By.name("login")).click();
        face.quit();




    }}

