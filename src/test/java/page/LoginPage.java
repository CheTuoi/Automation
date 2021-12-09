package page;

import helper.DriverHelper;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import model.User;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class LoginPage extends BasePage {

    @FindBy(how = How.ID, using = "email")
    private WebElement username;
    @FindBy(how = How.ID, using = "passwd")
    private WebElement password;
    @FindBy(how = How.ID, using = "SubmitLogin")
    private WebElement btnLogin;

    public void navigateToLoginPage(String url){
        DriverHelper.getInstance().getDriver().navigate().to(url);
    }

    public void login(User user){
        username.sendKeys(user.getEmail());
        password.sendKeys(user.getPassword());
        btnLogin.click();
    }

}
