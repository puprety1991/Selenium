package com.syntax.SyntaxProject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;


public class Project {
    public static void main(String[] args) throws InterruptedException {

        //SETUP ENVIRONMENT

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        String userName = "7084207476";//instagram/facebook
        String passWord = "Syntax2022";//instagram and facebook
        Thread.sleep(2000);
        String Title = driver.getTitle();
        System.out.println(Title);
        String url = driver.getCurrentUrl();
        System.out.println(url);

        // HOME PAGE

        WebElement dropDown = driver.findElement(By.id("select-demo"));
        dropDown.click();
        Select select = new Select(dropDown);
        select.selectByIndex(4);
        for(int i=1;i<=7;i++){
            select.selectByIndex(i);
        }
        WebElement drpDwn = driver.findElement(By.name("States"));
        Select select1 =new Select(drpDwn);
        for(int i=0; i<=7;i++){
            select1.selectByIndex(i);
            driver.findElement(By.xpath("(//button)[1]")).click();
            driver.findElement(By.xpath("(//button)[2]")).click();
        }
                                    //ALERTS & MODALS

        WebElement webAlertsModel=driver.findElement(By.xpath("//a[text()='Alerts & Modals']"));
        webAlertsModel.click();
        Thread.sleep(1000);
       driver.findElement(By.xpath("//a[text()='Bootstrap Alerts']")).click();
        Thread.sleep(1000);
        String[]id={"autoclosable-btn-success","normal-btn-success","autoclosable-btn-warning",
        "normal-btn-warning","autoclosable-btn-danger","normal-btn-danger",
        "autoclosable-btn-info","normal-btn-info"};
        for (String s : id) {
            driver.findElement(By.id(s)).click();
            Thread.sleep(500);
        }

      WebElement clickAlerts=driver.findElement(By.linkText("Alerts & Modals"));
        clickAlerts.click();
        driver.findElement(By.xpath("//a[text()='Bootstrap Modals']")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Launch modal")).click();
        Thread.sleep(1000);
        driver.findElement(By.linkText("Save changes")).click();
        driver.findElement(By.linkText("Launch modal")).click();
        Thread.sleep(1000);
        driver.findElement(By.linkText("Close")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@href='#myModal']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@href='#myModal2']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//a[text()='Close'])[3]")).click();
        Thread .sleep(1000);
        driver.findElement(By.xpath("//a[@href='#myModal2']")).click();
        Thread .sleep(1000);
        driver.findElement(By.xpath("(//a[text()='Save changes'])[3]")).click();
        Thread.sleep(1000);

        driver.findElement(By.linkText("Alerts & Modals")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[text()='File Download']")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("textbox")).sendKeys("“Life is like riding a bicycle. To keep your balance, you must keep moving.”\n" +
                "― Albert Einstein");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[text()='Generate File']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[text()='Download']")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//a[text() = 'Alerts & Modals']")).click();
        driver.findElement(By.xpath("//a[text() = 'Javascript Alerts']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//button[@onclick])[1]")).click();
        Thread.sleep(1000);
       Alert popUpAlert =driver.switchTo().alert();
        Thread.sleep(1000);
       popUpAlert.accept();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//button[@onclick])[2]")).click();
        Thread.sleep(1000);
        popUpAlert.accept();
        driver.findElement(By.xpath("(//button[@onclick])[2]")).click();
        Thread.sleep(1000);
        popUpAlert.dismiss();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']")).click();
        Thread.sleep(1000);
        Alert promptAlert=driver.switchTo().alert();
        promptAlert.sendKeys("Hello World");
        Thread.sleep(1000);
        promptAlert.accept();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']")).click();
        Thread.sleep(2000);
        promptAlert.dismiss();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//a[text() = 'Alerts & Modals']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Progress Bar Modal']")).click();
        Thread.sleep(1000);
        String[]xpath={"(//button[text()='Show dialog'])[1]","(//button[text()='Show dialog'])[2]","(//button[text()='Show dialog'])[3]"};
        for(String locator:xpath){
            driver.findElement(By.xpath(locator)).click();
            Thread.sleep(3100);
        }
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text() = 'Alerts & Modals']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Upload Image']")).click();
        Thread.sleep(2000);
        String imagePath = "/Users/puskaruprety/Desktop/image.JPG";
        String imagePath1 = "/Users/puskaruprety/Desktop/image1.jpeg";;
        WebElement chooseImage=driver.findElement(By.id("upload-dialog"));
        WebElement chooseFile = driver.findElement(By.id("image-file"));
        Thread.sleep(2000);
        chooseImage.sendKeys(imagePath);
        chooseFile.sendKeys(imagePath);

        Thread.sleep(2000);
        promptAlert.accept();
        chooseFile.sendKeys(imagePath1);
        Thread.sleep(2000);
        driver.findElement(By.name("cancel-file")).click();
        Thread.sleep(1000);
        chooseFile.sendKeys(imagePath1);
        driver.findElement(By.id("upload-button")).click();
        Thread.sleep(1000);
        promptAlert.accept();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//a[text() = 'Alerts & Modals']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[text()='Window Popup Modal']")).click();
        Thread.sleep(1000);

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

        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@title='Follow @syntaxtech on Facebook']")).click();
        Thread.sleep(2000);
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Log In")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("email")).sendKeys(userName);
        driver.findElement(By.id("pass")).sendKeys(passWord);
        Thread.sleep(2000);
        driver.findElement(By.name("login")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@placeholder='Search Facebook']")).sendKeys("syntax technologies bootcamp");
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//i[@class='x1b0d499 x1d69dk1'])[1]")).click();
        Thread.sleep(5000);
        WebElement syntax = driver.findElement(By.xpath("(//span[text()='Syntax Technologies'])[1]"));
        syntax.click();
        Thread.sleep(5000);

        driver.close();

        driver.switchTo().window(winHandleBefore);

        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Follow Instagram & Facebook']")).click();
        System.out.println("its printing");
        Thread.sleep(3000);
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
            Thread.sleep(2000);
        }

        driver.close();

        driver.switchTo().window(winHandleBefore);

        Thread.sleep(2000);

                                  // DATE PICKERS

        driver.findElement(By.xpath("//a[text()='Date Pickers']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Bootstrap Date Picker']")).click();
        Thread.sleep(2000);
        WebElement clickButton=driver.findElement(By.xpath("//i[@class='glyphicon glyphicon-th']"));
        clickButton.click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//th[text()='Today']")).click();
        clickButton.click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//th[text()='Clear'])[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Start date']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//td[@class='day'][text()='3']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='End date']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//td[@class='day'][text()='7']")).click();
        Thread.sleep(3000);
        driver.navigate().refresh();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//a[text()='Date Pickers']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='JQuery Date Picker']")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("from")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='3']")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("to")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='7']")).click();
        Thread.sleep(2000);


                                    //  INPUT FORM

        driver.findElement(By.xpath("//a[text()='Input Forms']")).click();
        Thread.sleep(900);
        driver.findElement(By.xpath("//a[text()='Ajax Form Submit']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='title']")).sendKeys("Syntax Technologies");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//textarea[@id='description']")).sendKeys("Any fool can write code that a computer can understand. Good programmers write code " +
                "that humans can understand.");
        Thread.sleep(2000);
        driver.findElement(By.id("btn-submit")).click();
        Thread.sleep(5000);

        driver.findElement(By.xpath("//a[text()='Input Forms']")).click();
        Thread.sleep(900);
        driver.findElement(By.xpath("//a[text()='Checkbox Demo']")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("isAgeSelected")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("check1")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("check1")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("myCheck")).click();
        Thread.sleep(8000);

        driver.findElement(By.xpath("//a[text()='Input Forms']")).click();
        Thread.sleep(900);
        driver.findElement(By.xpath("//a[text()='Input Form Submit']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Oscar");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("Lee");
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("oscarlee@gmail.com");
        driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("5714323456");
        driver.findElement(By.xpath("//input[@name='address']")).sendKeys("6640 John Marshal hwy");
        driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Markham");
        WebElement selectState =driver.findElement(By.name("state"));
        Select select2 = new Select(selectState);
        select2.selectByVisibleText("Virginia");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@name='zip']")).sendKeys("20156");
        driver.findElement(By.xpath("//input[@name='website']")).sendKeys("https://syntaxprojects.com/ajax-form-submit-demo.php");
        driver.findElement(By.xpath("//input[@value='yes']")).click();
        driver.findElement(By.xpath("//textarea[@name='comment']")).sendKeys("Code is like humor. When you have to explain it, it’s bad.");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Input Forms']")).click();
        Thread.sleep(900);
        driver.findElement(By.xpath("//a[text()='JQuery Select Dropdown']")).click();
        Thread.sleep(1000);
        WebElement drp=driver.findElement(By.id("country"));
        Select newSelect =new Select(drp);
        newSelect.selectByVisibleText("United States of America");
        Thread.sleep(1000);
        WebElement multipleSelect=driver.findElement(By.xpath("//select[@class='js-example-basic-multiple select2-hidden-accessible']"));
        Select mulSel = new Select(multipleSelect);
        mulSel.selectByVisibleText("Virginia");
        mulSel.selectByVisibleText("Arizona");
        Thread.sleep(2000);
        WebElement selectDemo=driver.findElement(By.xpath("//select[@class='js-example-disabled-results select2-hidden-accessible']"));
        Select newSelect1 = new Select(selectDemo);
        newSelect1.selectByValue("PR");
        Thread.sleep(2000);
        WebElement selectDemo1 = driver.findElement(By.id("files"));
        Select newSelect2 = new Select(selectDemo1);
        newSelect2.selectByVisibleText("Java");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//a[text()='Input Forms']")).click();
        driver.findElement(By.xpath("//a[text()='Login Form']")).click();
        Thread.sleep(600);
        driver.findElement(By.name("Username")).sendKeys("Tester");
        driver.findElement(By.name("Password")).sendKeys("test");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(2000);
        Alert clickOk=driver.switchTo().alert();
        clickOk.accept();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//a[text()='Input Forms']")).click();
        driver.findElement(By.xpath("//a[text()='Radio Buttons Demo']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//input[@value='Male'])[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("buttoncheck")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//input[@value='Female'])[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@value='5 - 15']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@onclick='getValues();']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//a[text()='Input Forms']")).click();
        driver.findElement(By.xpath("//a[text()='Select Dropdown List']")).click();
        Thread.sleep(1000);
        WebElement selectDrp=driver.findElement(By.id("select-demo"));
        Select day = new Select(selectDrp);
        day.selectByVisibleText("Friday");
        Thread.sleep(1000);
        WebElement multSelect = driver.findElement(By.id("multi-select"));
        Select city = new Select(multSelect);
        for(int i=0;i<8;i++){
            city.selectByIndex(i);
            driver.findElement(By.id("printMe")).click();
            Thread.sleep(900);
            driver.findElement(By.id("printAll")).click();
            Thread.sleep(900);
        }

        driver.findElement(By.xpath("//a[text()='Input Forms']")).click();
        driver.findElement(By.xpath("//a[text()='Simple Form Demo']")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("user-message")).sendKeys("Syntax Technologies");
        Thread.sleep(800);
        driver.findElement(By.xpath("//button[text()='Show Message']")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("sum1")).sendKeys("10");
        driver.findElement(By.id("sum2")).sendKeys("15");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[text()='Get Total']")).click();
        Thread.sleep(4000);


                                    // LIST BOX

        driver.findElement(By.xpath("//a[text()='List Box']")).click();
        Thread.sleep(800);
        driver.findElement(By.xpath("//a[text()='Bootstrap List Box']")).click();
        Thread.sleep(800);
        driver.findElement(By.xpath("(//input[@name='SearchDualList'])")).sendKeys("Morbi leo risus");
        driver.findElement(By.xpath("(//li[text()='Morbi leo risus'])[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@class='btn btn-default btn-sm move-right']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//input[@name='SearchDualList'])[2]")).sendKeys("Porta ac consectetur ac");
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//li[text()='Porta ac consectetur ac'])[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@class='btn btn-default btn-sm move-left']")).click();
        Thread.sleep(3000);


                                 //PROGRESS BARS & SLIDERS

        driver.findElement(By.xpath("//a[text()='Progress Bars & Sliders']")).click();
        driver.findElement(By.xpath("//a[text()='Bootstrap Progress Bar']")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("cricle-btn")).click();
        Thread.sleep(22000);

        driver.findElement(By.xpath("//a[text()='Progress Bars & Sliders']")).click();
        driver.findElement(By.xpath("//a[text()='Drag & Drop Sliders']")).click();
        Thread.sleep(1000);
        WebElement slider0 =driver.findElement(By.xpath("//input[@name='range'][@onchange='range.value=value']"));
        Actions action = new Actions(driver);
        action.dragAndDropBy(slider0,30,0).perform();
        Thread.sleep(2000);
        WebElement slider1 =driver.findElement(By.xpath("//input[@name='range'][@onchange='rangeWarning.value=value']"));
        action.dragAndDropBy(slider1,90,0).perform();
        Thread.sleep(2000);
        WebElement slider2 =driver.findElement(By.xpath("//input[@name='range'][@onchange='rangeInfo.value=value']"));
        action.dragAndDropBy(slider2,120,0).perform();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//a[text()='Progress Bars & Sliders']")).click();
        driver.findElement(By.xpath("//a[text()='JQuery Download Progress bars']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()='Start Download']")).click();
        Thread.sleep(9000);
        driver.findElement(By.xpath("//button[text()='Close']")).click();
        Thread.sleep(3000);


                //TABLE

        //driver.findElement(By.xpath("//a[text()='Table']")).click();
//        driver.findElement(By.xpath("//a[text()='Table Data Download']")).click(); Need to Work on it

        driver.findElement(By.xpath("//a[text()='Table']")).click();
        driver.findElement(By.xpath("//a[text()='Table Data Search']")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("task-table-filter")).sendKeys("John Smith");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='btn btn-default btn-xs btn-filter']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@class='form-control'][@placeholder='#']")).sendKeys("3");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//a[text()='Table']")).click();
        driver.findElement(By.xpath("//a[text()='Table Filter ']")).click();
        Thread.sleep(1000);
        String[] arrayXpath = {"//button[text()='Green']","//button[text()='Orange']","//button[text()='Red']"
                                ,"//button[text()='All']"};
        for(int i=0;i<arrayXpath.length;i++){
            driver.findElement(By.xpath(arrayXpath[i])).click();
            Thread.sleep(1000);
        }

        driver.findElement(By.xpath("//a[text()='Table']")).click();
        driver.findElement(By.xpath("//a[text()='Table Pagination']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[text()='2']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[text()='3']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[text()='«']")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//a[text()='Table']")).click();
        driver.findElement(By.xpath("//a[text()='Table Sort & Search']")).click();
        Thread.sleep(1000);
        WebElement clickSort=driver.findElement(By.xpath("//select[@name='example_length']"));
        Select sortSelect = new Select(clickSort);
        sortSelect.selectByVisibleText("25");
        driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Personnel Lead");
        Thread.sleep(2000);

                //OTHERS

        driver.findElement(By.xpath("//a[text()='Others']")).click();
        driver.findElement(By.xpath("//a[text()='Drag and Drop']")).click();
        Thread.sleep(3000);

        String [] dragArray={"//span[text()='Draggable 1']","//span[text()='Draggable 2']","//span[text()='Draggable 3']"
                            ,"//span[text()='Draggable 4']"};
        Actions actions = new Actions(driver);
        WebElement drop = driver.findElement(By.xpath("//div[@id='mydropzone']"));
        for(int i=0;i<dragArray.length;i++){
            WebElement drag = driver.findElement(By.xpath(dragArray[i]));
            actions.dragAndDrop(drag,drop).perform();
            Thread.sleep(3000);
        }

        driver.findElement(By.xpath("//a[text()='Others']")).click();
        driver.findElement(By.xpath("//a[text()='Dynamic Data Loading']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[text()='Get New User']")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//a[text()='Others']")).click();
        driver.findElement(By.xpath("//a[text()='Dynamic Elements loading']")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("startButton")).click();
        Thread.sleep(8000);

        driver.findElement(By.xpath("//a[text()='Others']")).click();
        driver.findElement(By.xpath("//a[text()='Iframe']")).click();
        Thread.sleep(6000);

        WebElement firstFrame = driver.findElement(By.name("FrameOne"));
        driver.switchTo().frame(firstFrame);
        Thread.sleep(2000);
        driver.findElement(By.id("makaha-ButtonElement--XMO5BoJfiAVGcnXXwIIj")).click();
        Thread.sleep(6000);

        driver.switchTo().defaultContent();

        WebElement secondFrame = driver.findElement(By.name("FrameTwo"));
        driver.switchTo().frame(secondFrame);
        Thread.sleep(5000);
        driver.findElement(By.id("makaha-ButtonElement--XMO5BoJfiAVGcnXXwIIj")).click();
        Thread.sleep(6000);

        driver.switchTo().defaultContent();

        Thread.sleep(2000);

        driver.quit();
    }
}
