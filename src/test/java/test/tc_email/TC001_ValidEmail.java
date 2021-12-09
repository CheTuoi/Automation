package test.tc_email;

import test.BaseTest;
import helper.JsonHelper;
import model.Email;
import org.testng.annotations.Test;
import page.RegisterEmailPage;

public class TC001_ValidEmail extends BaseTest {

    Email email;

    @Test
    public void ValidEmail(){
        RegisterEmailPage register = new RegisterEmailPage();
        register.navigateToLoginPage("http://automationpractice.com/index.php?controller=authentication");
        email = JsonHelper.getEmailById(0);
        register.registerEmail(email);
    }

}
