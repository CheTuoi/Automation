package test.tc_email;

import org.testng.Assert;
import test.BaseTest;
import helper.JsonHelper;
import model.Email;
import org.testng.annotations.Test;
import page.RegisterEmailPage;

public class TC002_InvalidEmail extends BaseTest {

    Email email;

    @Test
    public void InvalidEmail(){
        RegisterEmailPage register = new RegisterEmailPage();
        register.navigateToLoginPage("http://automationpractice.com/index.php?controller=authentication");
        email = JsonHelper.getEmailById(1);
        register.registerEmail(email);
        System.out.println(register.txtRegister());
        Assert.assertEquals(register.txtRegister(), "1. Invalid email address.");
    }
}
