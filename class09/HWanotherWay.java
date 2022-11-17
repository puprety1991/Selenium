package com.syntax.class09;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import static java.lang.System.out;

public class HWanotherWay {
    public static void main(String[] args) throws IOException {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");


                WebElement loginBox = driver.findElement(By.id("txtUsername"));
        loginBox.sendKeys(config("Username"));
        WebElement passBox = driver.findElement(By.name("txtPassword"));
        passBox.sendKeys(config("password"));
        WebElement loginButton = driver.findElement(By.name("Submit"));
        loginButton.click();

        WebElement pimCategory = driver.findElement(By.id("menu_pim_viewPimModule"));
        pimCategory.click();

        List<WebElement> IDs = driver.findElements(By.xpath("//div[@id='tableWrapper']/table/tbody/tr/td[2]"));
        List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));

        Actions scroller = new Actions(driver);
        scroller.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).build().perform();

        for (int i = 0; i < IDs.size(); i++) {
            if (IDs.get(i).getText().equalsIgnoreCase("34438833")) {
                checkBoxes.get(i+1).click();
                out.println("is NO 34438833 selected: "+checkBoxes.get(i+1).isSelected());
            }
        }
        //driver.quit();
    }
    private static String config(String target) throws IOException {
        Properties properties = new Properties();
        String path=System.getProperty("user.dir")+"/"+"src"+"/"+"com"+"/"+"syntax"+"/"+"util"+"/"+"validCredentials.properties";

        FileInputStream inputStream = new FileInputStream(path);
        properties.load(inputStream);
        return properties.get(target).toString();
    }
}
