package test;

import helper.DriverHelper;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BaseTest {
    //private WebDriver driver;

    @BeforeMethod
    public void beforeMethod(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        DriverHelper.getInstance().setDriver(driver);
    }

    @AfterMethod
    public void afterMethod(){
        if (null != getDriver()){
            getDriver().close();
            getDriver().quit();
        }
    }

    public WebDriver getDriver(){
        return DriverHelper.getInstance().getDriver();
    }

}
