package test.tc_email;

import test.BaseTest;
import helper.JsonHelper;
import model.Email;
import org.testng.annotations.Test;
import page.RegisterEmailPage;

public class TC004_RegistedEmail extends BaseTest {

    Email email;

    @Test
    public void RegistedEmail(){
        RegisterEmailPage register = new RegisterEmailPage();
        register.navigateToLoginPage("http://automationpractice.com/index.php?controller=authentication");
        email = JsonHelper.getEmailById(3);
        register.registerEmail(email);
    }
}
