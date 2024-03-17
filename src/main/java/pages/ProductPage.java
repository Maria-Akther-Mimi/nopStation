package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage {
    private WebDriver driver;

    // Constructor
    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getProductTitle() {
        WebElement productTitleElement = driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/tvProductName"));
        return productTitleElement.getText();
    }

    public String getProductPrice() {
        WebElement productPriceElement = driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/tvPrice"));
        return productPriceElement.getText();
    }
    public void increaseQuantity(int quantity) {
        WebElement plusButton = driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/btnPlus"));
        for (int i = 0; i < quantity; i++) {
            plusButton.click();

        }
    public void clickAddToCartButton() {
        WebElement addToCartButton = driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/btnAddToCart"));
        addToCartButton.click();
    }

}
}
