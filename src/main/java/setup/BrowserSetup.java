package setup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.net.MalformedURLException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BrowserSetup {

    static WebDriver driver;

    //Open Browser
    public static WebDriver LaunchBrowser() throws MalformedURLException {


        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "emulator-5554");
        caps.setCapability("platformName", "android");
        caps.setCapability("appPackage", "com.nopstation.nopcommerce.nopstationcart");
        caps.setCapability("appActivity", "com.bs.ecommerce.main.SplashScreenActivity");
        caps.setCapability("app",  System.getProperty("user.dir")+ "/src/test/resources/nopstationCart_4.40 1.apk");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        return driver;

    }

    //Close Browser
    public static void CloseBrowser() {

        driver.close();
        driver.quit();

    }

}

