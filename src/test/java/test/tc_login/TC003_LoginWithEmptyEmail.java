package test.tc_login;

import test.BaseTest;
import helper.JsonHelper;
import model.User;
import org.testng.annotations.Test;
import page.LoginPage;

public class TC003_LoginWithEmptyEmail extends BaseTest {

    User user;

    @Test
    public void LoginWithEmptyEmail(){
        LoginPage loginPage = new LoginPage();
        loginPage.navigateToLoginPage("http://automationpractice.com/index.php?controller=authentication");
        user = JsonHelper.getUserById(2);
        loginPage.login(user);
    }
}
