package page;

import helper.DriverHelper;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage(){
        PageFactory.initElements(DriverHelper.getInstance().getDriver(), this);

    }

}
