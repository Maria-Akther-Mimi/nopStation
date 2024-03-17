package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoppingCartPage {
    private WebDriver driver;

    // Constructor
    public ShoppingCartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickCartButton() {
        WebElement clickCartButton = driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/counterIcon"));
        clickCartButton.click();
    }

    public void checkoutButton() {
        WebElement checkoutButton = driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/tvProductName"));
        checkoutButton.click();
    }
    public void checkoutGuestButton() {
        WebElement checkoutGuestButton = driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/btnGuestCheckout"));
        checkoutGuestButton.click();
    }

}
