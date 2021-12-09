package test;

import org.testng.annotations.Test;
import page.WebPage;

public class TC_Web extends BaseTest {

    @Test
    public void TestWeb(){
        WebPage webPage = new WebPage();
        webPage.navigateToWebPage("http://automationpractice.com/index.php");
        webPage.clickWomenBtn();
        webPage.clickTopBtn();
        webPage.backPage();
        webPage.forwardPage();
        webPage.clickTShirtsBtn();
        webPage.getCookie();
    }

}
