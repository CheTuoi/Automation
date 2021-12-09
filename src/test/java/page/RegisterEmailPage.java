package page;

import helper.DriverHelper;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import model.Email;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class RegisterEmailPage extends BasePage {

    @FindBy(how = How.ID, using = "email_create")
    private WebElement txtEmail;
    @FindBy(how = How.ID, using = "SubmitCreate")
    private WebElement btnCreate;
    @FindBy(how = How.ID, using = "create_account_error")
    private WebElement message;

    public void navigateToLoginPage(String url){
        DriverHelper.getInstance().getDriver().navigate().to(url);
    }

    public void registerEmail(Email email){
        txtEmail.sendKeys(email.getEmail());
        btnCreate.click();
    }

    public String txtRegister(){
        return message.getText();
    }

}
