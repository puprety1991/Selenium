package com.syntax.SyntaxProject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ProjectModified {
    public static void main(String[] args) throws InterruptedException {

                         //SETUP ENVIRONMENT

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, 20);

        String userName = "7084207476";//instagram/facebook
        String passWord = "Syntax2022";//instagram and facebook
        String Title = driver.getTitle();
        System.out.println(Title);
        String url = driver.getCurrentUrl();
        System.out.println(url);

                             // HOME PAGE

        WebElement dropDown = driver.findElement(By.id("select-demo"));
        Select select = new Select(dropDown);
        for(int i=1;i<=7;i++){
            select.selectByIndex(i);
        }
        WebElement drpDwn = driver.findElement(By.name("States"));
        drpDwn.click();
        Select select1 =new Select(drpDwn);
        for(int i=0; i<=7;i++){
            select1.selectByIndex(i);
            driver.findElement(By.xpath("(//button)[1]")).click();
            driver.findElement(By.xpath("(//button)[2]")).click();
        }
                                 //ALERTS & MODALS

        WebElement webAlertsModel=driver.findElement(By.xpath("//a[text()='Alerts & Modals']"));
        webAlertsModel.click();
        driver.findElement(By.xpath("//a[text()='Bootstrap Alerts']")).click();
        String[]id={"autoclosable-btn-success","normal-btn-success","autoclosable-btn-warning",
                "normal-btn-warning","autoclosable-btn-danger","normal-btn-danger",
                "autoclosable-btn-info","normal-btn-info"};
        for (String s : id) {
            driver.findElement(By.id(s)).click();
        }

        WebElement clickAlerts=driver.findElement(By.linkText("Alerts & Modals"));
        clickAlerts.click();
        driver.findElement(By.xpath("//a[text()='Bootstrap Modals']")).click();
        driver.findElement(By.linkText("Launch modal")).click();
        driver.findElement(By.linkText("Save changes")).click();
        driver.findElement(By.linkText("Launch modal")).click();
        driver.findElement(By.linkText("Close")).click();
        driver.findElement(By.xpath("//a[@href='#myModal']")).click();
        driver.findElement(By.xpath("//a[@href='#myModal2']")).click();
        driver.findElement(By.xpath("(//a[text()='Close'])[3]")).click();
        driver.findElement(By.xpath("//a[@href='#myModal2']")).click();
        driver.findElement(By.xpath("(//a[text()='Save changes'])[3]")).click();

        driver.findElement(By.linkText("Alerts & Modals")).click();
        driver.findElement(By.xpath("//a[text()='File Download']")).click();
        driver.findElement(By.id("textbox")).sendKeys("“Life is like riding a bicycle. To keep your balance, you must keep moving.”\n" +
                "― Albert Einstein");
        driver.findElement(By.xpath("//button[text()='Generate File']")).click();
        driver.findElement(By.xpath("//a[text()='Download']")).click();

        driver.findElement(By.xpath("//a[text() = 'Alerts & Modals']")).click();
        driver.findElement(By.xpath("//a[text() = 'Javascript Alerts']")).click();
        driver.findElement(By.xpath("(//button[@onclick])[1]")).click();
        Alert popUpAlert =driver.switchTo().alert();
        popUpAlert.accept();
        driver.findElement(By.xpath("(//button[@onclick])[2]")).click();
        popUpAlert.accept();
        driver.findElement(By.xpath("(//button[@onclick])[2]")).click();
        popUpAlert.dismiss();
        driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']")).click();

        Alert promptAlert=driver.switchTo().alert();
        promptAlert.sendKeys("Hello World");
        promptAlert.accept();
        driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']")).click();
        promptAlert.dismiss();

        driver.findElement(By.xpath("//a[text() = 'Alerts & Modals']")).click();
        driver.findElement(By.xpath("//a[text()='Progress Bar Modal']")).click();
        String[]xpath={"(//button[text()='Show dialog'])[1]","(//button[text()='Show dialog'])[2]","(//button[text()='Show dialog'])[3]"};
        for(String locator:xpath){
            driver.findElement(By.xpath(locator)).click();

            Thread.sleep(3100);
        }
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text() = 'Alerts & Modals']")).click();
        driver.findElement(By.xpath("//a[text()='Upload Image']")).click();
        String imagePath = "/Users/puskaruprety/Desktop/image.JPG";
        String imagePath1 = "/Users/puskaruprety/Desktop/image1.jpeg";;
        WebElement chooseImage=driver.findElement(By.id("upload-dialog"));
        WebElement chooseFile = driver.findElement(By.id("image-file"));

        Thread.sleep(2000);

        chooseImage.sendKeys(imagePath);
        chooseFile.sendKeys(imagePath);

        promptAlert.accept();
        chooseFile.sendKeys(imagePath1);
        driver.findElement(By.name("cancel-file")).click();
        chooseFile.sendKeys(imagePath1);
        driver.findElement(By.id("upload-button")).click();
        promptAlert.accept();

        driver.findElement(By.xpath("//a[text() = 'Alerts & Modals']")).click();
        driver.findElement(By.xpath("//a[text()='Window Popup Modal']")).click();

        String winHandleBefore = driver.getWindowHandle();

        /*
        driver.findElement(By.xpath("//a[@title='Follow @syntaxtech on Instagram']")).click();
        Thread.sleep(2000);

        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }

        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[text()='Follow']")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("username")).sendKeys(userName);
        driver.findElement(By.name("password")).sendKeys(passWord);
        driver.findElement(By.xpath("(//div[@class ='_ab8w  _ab94 _ab99 _ab9f _ab9m _ab9p  _abak _abb8 _abbq _abb- _abcm'])[1]")).click();
        Thread.sleep(8000);
        driver.findElement(By.xpath("//button[text()='Not Now']")).click();
        Thread.sleep(4000);
        driver.close();
        Thread.sleep(1000);
        driver.switchTo().window(winHandleBefore);

        */

      /*  driver.findElement(By.xpath("//a[@title='Follow @syntaxtech on Facebook']")).click();
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Log In")).click();
        driver.findElement(By.id("email")).sendKeys(userName);
        driver.findElement(By.id("pass")).sendKeys(passWord);
        driver.findElement(By.name("login")).click();

        Thread.sleep(3000);

        driver.findElement(By.xpath("//input[@placeholder='Search Facebook']")).sendKeys("syntax technologies bootcamp");
        driver.findElement(By.xpath("(//i[@class='x1b0d499 x1d69dk1'])[1]")).click();

        Thread.sleep(5000);

        WebElement syntax = driver.findElement(By.xpath("(//span[text()='Syntax Technologies'])[1]"));
        syntax.click();

        Thread.sleep(5000);

        driver.close();

        driver.switchTo().window(winHandleBefore);

        driver.findElement(By.xpath("//a[text()='Follow Instagram & Facebook']")).click();
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
            String title = driver.getTitle();
            if (title.contains("Instagram")) {
                List<WebElement> links = driver.findElements(By.tagName("a"));
                System.out.println(links.size());
                for (WebElement allLinks : links) {
                    String linkList = allLinks.getAttribute("href");
                    String linkText = allLinks.getText();
                    if (!linkText.isEmpty()) {
                        System.out.println(linkText + " -------> " + linkList);
                    }
                }
            }else{
                String url1 = driver.getCurrentUrl();
                System.out.println(url1);
            }
        }

        driver.close();

        driver.switchTo().window(winHandleBefore);
*/

                                   // DATE PICKERS

        driver.findElement(By.xpath("//a[text()='Date Pickers']")).click();
        driver.findElement(By.xpath("//a[text()='Bootstrap Date Picker']")).click();
        WebElement clickButton=driver.findElement(By.xpath("//i[@class='glyphicon glyphicon-th']"));
        clickButton.click();
        driver.findElement(By.xpath("//th[text()='Today']")).click();
        clickButton.click();
        driver.findElement(By.xpath("(//th[text()='Clear'])[1]")).click();
        driver.findElement(By.xpath("//input[@placeholder='Start date']")).click();
        driver.findElement(By.xpath("//td[@class='day'][text()='3']")).click();
        driver.findElement(By.xpath("//input[@placeholder='End date']")).click();
        driver.findElement(By.xpath("//td[@class='day'][text()='7']")).click();
        driver.navigate().refresh();

        driver.findElement(By.xpath("//a[text()='Date Pickers']")).click();
        driver.findElement(By.xpath("//a[text()='JQuery Date Picker']")).click();
        driver.findElement(By.id("from")).click();
        driver.findElement(By.xpath("//a[text()='3']")).click();
        driver.findElement(By.id("to")).click();
        driver.findElement(By.xpath("//a[text()='7']")).click();


                                    //  INPUT FORM

        driver.findElement(By.xpath("//a[text()='Input Forms']")).click();
        driver.findElement(By.xpath("//a[text()='Ajax Form Submit']")).click();
        driver.findElement(By.xpath("//input[@id='title']")).sendKeys("Syntax Technologies");
        driver.findElement(By.xpath("//textarea[@id='description']")).sendKeys("Any fool can write code that a computer can understand. Good programmers write code " +
                "that humans can understand.");
        driver.findElement(By.id("btn-submit")).click();

        driver.findElement(By.xpath("//a[text()='Input Forms']")).click();
        driver.findElement(By.xpath("//a[text()='Checkbox Demo']")).click();
        driver.findElement(By.id("isAgeSelected")).click();;
        driver.findElement(By.id("check1")).click();
        driver.findElement(By.id("check1")).click();
        driver.findElement(By.id("myCheck")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='GFG_DOWN']")));

        //Thread.sleep(8000);

        driver.findElement(By.xpath("//a[text()='Input Forms']")).click();
        driver.findElement(By.xpath("//a[text()='Input Form Submit']")).click();
        driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Oscar");
        driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("Lee");
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("oscarlee@gmail.com");
        driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("5714323456");
        driver.findElement(By.xpath("//input[@name='address']")).sendKeys("6640 John Marshal hwy");
        driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Markham");
        WebElement selectState =driver.findElement(By.name("state"));
        Select select2 = new Select(selectState);
        select2.selectByVisibleText("Virginia");
        driver.findElement(By.xpath("//input[@name='zip']")).sendKeys("20156");
        driver.findElement(By.xpath("//input[@name='website']")).sendKeys("https://syntaxprojects.com/ajax-form-submit-demo.php");
        driver.findElement(By.xpath("//input[@value='yes']")).click();
        driver.findElement(By.xpath("//textarea[@name='comment']")).sendKeys("Code is like humor. When you have to explain it, it’s bad.");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.xpath("//a[text()='Input Forms']")).click();
        driver.findElement(By.xpath("//a[text()='JQuery Select Dropdown']")).click();
        WebElement drp=driver.findElement(By.id("country"));
        Select newSelect =new Select(drp);
        newSelect.selectByVisibleText("United States of America");
        WebElement multipleSelect=driver.findElement(By.xpath("//select[@class='js-example-basic-multiple select2-hidden-accessible']"));
        Select mulSel = new Select(multipleSelect);
        mulSel.selectByVisibleText("Virginia");
        mulSel.selectByVisibleText("Arizona");
        WebElement selectDemo=driver.findElement(By.xpath("//select[@class='js-example-disabled-results select2-hidden-accessible']"));
        Select newSelect1 = new Select(selectDemo);
        newSelect1.selectByValue("PR");
        WebElement selectDemo1 = driver.findElement(By.id("files"));
        Select newSelect2 = new Select(selectDemo1);
        newSelect2.selectByVisibleText("Java");

        driver.findElement(By.xpath("//a[text()='Input Forms']")).click();
        driver.findElement(By.xpath("//a[text()='Login Form']")).click();
        driver.findElement(By.name("Username")).sendKeys("Tester");
        driver.findElement(By.name("Password")).sendKeys("test");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Alert clickOk=driver.switchTo().alert();
        clickOk.accept();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//a[text()='Input Forms']")).click();
        driver.findElement(By.xpath("//a[text()='Radio Buttons Demo']")).click();
        driver.findElement(By.xpath("(//input[@value='Male'])[1]")).click();
        driver.findElement(By.id("buttoncheck")).click();
        driver.findElement(By.xpath("(//input[@value='Female'])[2]")).click();
        driver.findElement(By.xpath("//input[@value='5 - 15']")).click();
        driver.findElement(By.xpath("//button[@onclick='getValues();']")).click();

        driver.findElement(By.xpath("//a[text()='Input Forms']")).click();
        driver.findElement(By.xpath("//a[text()='Select Dropdown List']")).click();
        WebElement selectDrp=driver.findElement(By.id("select-demo"));
        Select day = new Select(selectDrp);
        day.selectByVisibleText("Friday");
        WebElement multSelect = driver.findElement(By.id("multi-select"));
        Select city = new Select(multSelect);
        for(int i=0;i<8;i++){
            city.selectByIndex(i);
            driver.findElement(By.id("printMe")).click();
            driver.findElement(By.id("printAll")).click();
        }

        driver.findElement(By.xpath("//a[text()='Input Forms']")).click();
        driver.findElement(By.xpath("//a[text()='Simple Form Demo']")).click();
        driver.findElement(By.id("user-message")).sendKeys("Syntax Technologies");
        driver.findElement(By.xpath("//button[text()='Show Message']")).click();
        driver.findElement(By.id("sum1")).sendKeys("10");
        driver.findElement(By.id("sum2")).sendKeys("15");
        driver.findElement(By.xpath("//button[text()='Get Total']")).click();


                                      // LIST BOX

        driver.findElement(By.xpath("//a[text()='List Box']")).click();
        driver.findElement(By.xpath("//a[text()='Bootstrap List Box']")).click();
        driver.findElement(By.xpath("(//input[@name='SearchDualList'])")).sendKeys("Morbi leo risus");
        driver.findElement(By.xpath("(//li[text()='Morbi leo risus'])[1]")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-default btn-sm move-right']")).click();
        driver.findElement(By.xpath("(//input[@name='SearchDualList'])[2]")).sendKeys("Porta ac consectetur ac");
        driver.findElement(By.xpath("(//li[text()='Porta ac consectetur ac'])[2]")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-default btn-sm move-left']")).click();


                                     //PROGRESS BARS & SLIDERS

        driver.findElement(By.xpath("//a[text()='Progress Bars & Sliders']")).click();
        driver.findElement(By.xpath("//a[text()='Bootstrap Progress Bar']")).click();
        driver.findElement(By.id("cricle-btn")).click();

        Thread.sleep(22000);

        driver.findElement(By.xpath("//a[text()='Progress Bars & Sliders']")).click();
        driver.findElement(By.xpath("//a[text()='Drag & Drop Sliders']")).click();
        WebElement slider0 =driver.findElement(By.xpath("//input[@name='range'][@onchange='range.value=value']"));
        Actions action = new Actions(driver);
        action.dragAndDropBy(slider0,30,0).perform();
        WebElement slider1 =driver.findElement(By.xpath("//input[@name='range'][@onchange='rangeWarning.value=value']"));
        action.dragAndDropBy(slider1,90,0).perform();
        WebElement slider2 =driver.findElement(By.xpath("//input[@name='range'][@onchange='rangeInfo.value=value']"));
        action.dragAndDropBy(slider2,120,0).perform();

        driver.findElement(By.xpath("//a[text()='Progress Bars & Sliders']")).click();
        driver.findElement(By.xpath("//a[text()='JQuery Download Progress bars']")).click();
        driver.findElement(By.xpath("//button[text()='Start Download']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Close']")));

        WebElement isCloseButton=driver.findElement(By.xpath("//button[text()='Close']"));
        if(isCloseButton.isEnabled()){
            System.out.println("Close button is enabled.");
            Thread.sleep(1000);
            isCloseButton.click();
        }


        //TABLE

        //driver.findElement(By.xpath("//a[text()='Table']")).click();
//        driver.findElement(By.xpath("//a[text()='Table Data Download']")).click(); Need to Work on it

        driver.findElement(By.xpath("//a[text()='Table']")).click();
        driver.findElement(By.xpath("//a[text()='Table Data Search']")).click();
        driver.findElement(By.id("task-table-filter")).sendKeys("John Smith");
        driver.findElement(By.xpath("//button[@class='btn btn-default btn-xs btn-filter']")).click();
        driver.findElement(By.xpath("//input[@class='form-control'][@placeholder='#']")).sendKeys("3");

        driver.findElement(By.xpath("//a[text()='Table']")).click();
        driver.findElement(By.xpath("//a[text()='Table Filter ']")).click();
        String[] arrayXpath = {"//button[text()='Green']","//button[text()='Orange']","//button[text()='Red']"
                ,"//button[text()='All']"};
        for(int i=0;i<arrayXpath.length;i++){
            driver.findElement(By.xpath(arrayXpath[i])).click();
        }

        driver.findElement(By.xpath("//a[text()='Table']")).click();
        driver.findElement(By.xpath("//a[text()='Table Pagination']")).click();
        driver.findElement(By.xpath("//a[text()='2']")).click();
        driver.findElement(By.xpath("//a[text()='3']")).click();
        driver.findElement(By.xpath("//a[text()='«']")).click();

        driver.findElement(By.xpath("//a[text()='Table']")).click();
        driver.findElement(By.xpath("//a[text()='Table Sort & Search']")).click();
        WebElement clickSort=driver.findElement(By.xpath("//select[@name='example_length']"));
        Select sortSelect = new Select(clickSort);
        sortSelect.selectByVisibleText("25");
        driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Personnel Lead");

        //OTHERS

        driver.findElement(By.xpath("//a[text()='Others']")).click();
        driver.findElement(By.xpath("//a[text()='Drag and Drop']")).click();

        Thread.sleep(3000);

        String [] dragArray={"//span[text()='Draggable 1']","//span[text()='Draggable 2']","//span[text()='Draggable 3']"
                ,"//span[text()='Draggable 4']"};
        Actions actions = new Actions(driver);
        WebElement drop = driver.findElement(By.xpath("//div[@id='mydropzone']"));
        for (String s : dragArray) {
            WebElement drag = driver.findElement(By.xpath(s));
            actions.dragAndDrop(drag, drop).perform();

            Thread.sleep(3000);
        }

        driver.findElement(By.xpath("//a[text()='Others']")).click();
        driver.findElement(By.xpath("//a[text()='Dynamic Data Loading']")).click();
        WebElement getUserButton =driver.findElement(By.xpath("//button[text()='Get New User']"));
        for(int i=0;i<3;i++) {
            getUserButton.click();
            Thread.sleep(1000);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'First Name :')]")));

            WebElement firstName = driver.findElement(By.xpath("//p[contains(text(),'First Name :')]"));
            String firstNameText = firstName.getText();
            System.out.println(firstNameText);
        }
        driver.findElement(By.xpath("//a[text()='Others']")).click();
        driver.findElement(By.xpath("//a[text()='Dynamic Elements loading']")).click();
        driver.findElement(By.id("startButton")).click();


        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[contains(text(),'Welcome')]")));

        WebElement displayInfo = driver.findElement(By.xpath("//h4[contains(text(),'Welcome')]"));
        String displayText = displayInfo.getText();
        System.out.println(displayText);


        driver.findElement(By.xpath("//a[text()='Others']")).click();
        driver.findElement(By.xpath("//a[text()='Iframe']")).click();

        WebElement firstFrame = driver.findElement(By.name("FrameOne"));
        driver.switchTo().frame(firstFrame);
        driver.findElement(By.id("makaha-ButtonElement--XMO5BoJfiAVGcnXXwIIj")).click();

        Thread.sleep(2000);

        driver.switchTo().defaultContent();

        WebElement secondFrame = driver.findElement(By.name("FrameTwo"));
        driver.switchTo().frame(secondFrame);


        driver.findElement(By.id("makaha-ButtonElement--XMO5BoJfiAVGcnXXwIIj")).click();
        Thread.sleep(2000);

        driver.switchTo().defaultContent();


        driver.quit();
    }
}


