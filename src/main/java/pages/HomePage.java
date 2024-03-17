package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private WebDriver driver;

    // Constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickElectronicsCategory() {
        WebElement electronicsCategory = driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Category\"]/android.widget.FrameLayout/android.widget.ImageView"));
        electronicsCategory.click();
    }
}
