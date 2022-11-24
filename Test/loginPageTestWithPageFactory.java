package com.syntax.Test;

import com.syntax.Pages.loginPage;
import com.syntax.Pages.loginPageWithPageFactory;
import com.syntax.utils.CommonMethods;

import static com.syntax.utils.CommonMethods.teardown;

public class loginPageTestWithPageFactory {
    public static void main(String[] args) {
        CommonMethods.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        loginPageWithPageFactory loginPage = new loginPageWithPageFactory();
        loginPage.usernameField.sendKeys("Admin");
        loginPage.passwordField.sendKeys("Hum@nhrm123");
        loginPage.loginBtn.click();

        teardown();

    }
}
