package com.syntax.class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HW {
   /*
    http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login
    got to the url
    click on PIM
    click on Employee List
    from the table choose one id (it must be from the first page)
    and check the checkBox for that id   (your logic should be dynamic, should work for any ID number)
    the username is
    admin
    the password is
    Hum@nhrm123
 */
   public static void main(String[] args) {
       System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
       WebDriver driver = new ChromeDriver();
       driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
       driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
       driver.manage().window().maximize();

       WebElement username = driver.findElement(By.id("txtUsername"));
       WebElement password = driver.findElement(By.id("txtPassword"));
       WebElement login = driver.findElement(By.id("btnLogin"));

       username.sendKeys("admin");
       password.sendKeys("Hum@nhrm123");
       login.click();

       WebElement pim = driver.findElement(By.linkText("PIM"));
       pim.click();

       WebElement employeeList = driver.findElement(By.id("menu_pim_viewEmployeeList"));
       employeeList.click();

       List<WebElement> listID = driver.findElements(By.xpath("//table[@id]/tbody/tr/td[2]"));
       for(int i=0;i<listID.size();i++){
           String text = listID.get(i).getText();
           int row = i+1;
           if(text.equalsIgnoreCase("45024A")){
               System.out.println("ID: "+text+", index: "+row);
               WebElement checkBox = driver.findElement(By.xpath("//table[@id]/tbody/tr["+(i+1)+"]/td[1]"));
               checkBox.click();
           }
       }
   }
}
