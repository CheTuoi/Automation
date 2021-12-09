package page;

import helper.DriverHelper;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class WebPage extends BasePage {

    public WebPage(){
        super();
    }

    @FindBy(how = How.XPATH, using = "//a[@title='Women']")
    private WebElement btnWomen;

    @FindBy(how = How.XPATH, using = "(//*[@href='http://automationpractice.com/index.php?id_category=4&controller=category'])[2]")
    private WebElement btnTop;

    @FindBy(how = How.XPATH, using = "(//*[@href='http://automationpractice.com/index.php?id_category=5&controller=category'])[3]")
    private WebElement btnTShirts;

    public void navigateToWebPage(String url){
        DriverHelper.getInstance().getDriver().navigate().to(url);
    }

    public void clickWomenBtn(){
        JavascriptExecutor executor = (JavascriptExecutor)DriverHelper.getInstance().getDriver();
        executor.executeScript("arguments[0].click();", btnWomen);
    }

//    public void verifySubcategories(){
//        JavascriptExecutor executor = (JavascriptExecutor) driver;
//        String topCategories = (String) js.executeScript("return tops.title");
//    }

    public void clickTopBtn(){
        btnTop.click();
    }

    public void backPage(){
        DriverHelper.getInstance().getDriver().navigate().back();
    }

    public void forwardPage(){
        DriverHelper.getInstance().getDriver().navigate().forward();
    }

    public void clickTShirtsBtn(){
        btnTShirts.click();
    }

    public void getCookie(){
        DriverHelper.getInstance().getDriver().manage().getCookies();
    }
}
