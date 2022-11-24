package com.syntax.Pages;

import com.syntax.utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPageWithPageFactory extends CommonMethods {
    @FindBy(id ="txtUsername")
    public WebElement usernameField;

    @FindBy(id="txtPassword")
    public WebElement passwordField;

    @FindBy(id="btnLogin")
    public WebElement loginBtn;


    // call the constructor initialize all the elements
    public loginPageWithPageFactory(){
        PageFactory.initElements(driver,this);

    }
}
