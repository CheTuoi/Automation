package helper;

import org.openqa.selenium.WebDriver;

public class DriverHelper {
    private static DriverHelper instance;
    private ThreadLocal<WebDriver> drivers = new ThreadLocal<>();

    //Singleton Pattern
    public static synchronized DriverHelper getInstance(){
        if (instance == null){
            instance = new DriverHelper();
        }
        return instance;
    }

    public void setDriver(WebDriver webDriver){
        drivers.set(webDriver);
    }

    public WebDriver getDriver(){
        return drivers.get();
    }

//    public synchronized WebDriver driverHelper(){
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(100));
//        driver.manage().window().maximize();
//        setDriver(driver);
//        return driver;
//    }

}
