package test.tc_login;

import test.BaseTest;
import helper.JsonHelper;
import model.User;
import org.testng.annotations.Test;
import page.LoginPage;

public class TC002_LoginInvalid extends BaseTest {

    User user;

    @Test
    public void LoginInvalid(){
        LoginPage loginPage = new LoginPage();
        loginPage.navigateToLoginPage("http://automationpractice.com/index.php?controller=authentication");
        user = JsonHelper.getUserById(1);
        loginPage.login(user);
    }
}
