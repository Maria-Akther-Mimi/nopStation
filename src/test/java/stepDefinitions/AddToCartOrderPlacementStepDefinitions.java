package stepDefinitions;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.HomePage;
import pages.ProductPage;
import pages.ShoppingCartPage;
import pages.CheckoutPage;
import setup.BrowserSetup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;


public class AddToCartOrderPlacementStepDefinitions {
    public WebDriver driver;
    public HomePage homePage;
    public ProductPage productPage;
    public ShoppingCartPage shoppingCartPage;
    public CheckoutPage checkoutPage;


    @Given("user on home page after opening nopCart mobile app")
    public void user_on_home_page_after_opening_nopCart_mobile_app() {
        System.setProperty("web-driver.chrome.driver", "./Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://127.0.0.1:4723/wd/hub");
    }

    @When("user click {string} from {string} list from home page")
    public void user_click_category_from_list_from_home_page(String category, String categoryList) {
        WebElement categoryElement = driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Category\"]/android.widget.FrameLayout/android.widget.ImageView"));
        categoryElement.click();
    }

    @When("user click to {string} product details page")
    public void user_click_to_product_details_page(String product) {
        WebElement productElement = driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/tvProductName"));
        productElement.click();
    }

    @When("user click plus button to increase Qty by {string}")
    public void user_click_plus_button_to_increase_qty_by(String quantity) {
        WebElement plusButton = driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/btnPlus"));
        for (int i = 0; i < Integer.parseInt(quantity); i++) {
            plusButton.click();
        }
    }

    @Then("user click add to cart button to add the product in his cart")
    public void user_click_add_to_cart_button_to_add_the_product_in_his_cart() {
        WebElement addToCartButton = driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/btnAddToCart"));
        addToCartButton.click();
    }

    @When("user go to shopping cart by clicking top cart icon")
    public void user_go_to_shopping_cart_by_clicking_top_cart_icon() {
        WebElement topCartIcon = driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/counterIcon"));
        topCartIcon.click();
    }

    @When("user click checkout button from shopping cart page")
    public void user_click_checkout_button_from_shopping_cart_page() {
        WebElement checkoutButton = driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/tvProductName"));
        checkoutButton.click();
    }

    @When("user select checkout as guest from shopping cart page")
    public void user_select_checkout_as_guest_from_shopping_cart_page() {
        WebElement guestCheckoutButton = driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/btnGuestCheckout"));
        guestCheckoutButton.click();
    }

    @Then("user input all the details in checkout billing details page and click continue")
    public void user_input_all_the_details_in_checkout_billing_details_page_and_click_continue() {
        // Input billing details
        WebElement firstNameInput = driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/etFirstName"));
        firstNameInput.sendKeys("Maria");

        WebElement lastNameInput = driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/etLastName"));
        lastNameInput.sendKeys("Mimi");

        WebElement emailInput = driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/etEmail"));
        emailInput.sendKeys("mariamimi2247@gmail.com");

        WebElement addressInput = driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/etStreetAddress"));
        addressInput.sendKeys("123 Street");

        WebElement cityInput = driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/etCity"));
        cityInput.sendKeys("Patuakhali");

        WebElement countryInput = driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/countrySpinnerLayout"));
        countryInput.sendKeys("Bangladesh");

        WebElement zipInput = driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/etZipCode"));
        zipInput.sendKeys("680");

        // Click continue button
        WebElement continueButton = driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/btnContinue"));
        continueButton.click();
    }
    @When("user select {string} as shipping method and click continue")
    public void user_select_shipping_method_and_click_continue(String shippingMethod) {
        WebElement shippingMethodRadioButton = driver.findElement(By.id("//input[@value='" + shippingMethod + "']"));

        shippingMethodRadioButton.click();

        // Click on the continue button
        WebElement continueButton = driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/btnContinue"));
        continueButton.click();
    }
    @When("user select {string} as payment method and click continue")
    public void user_select_payment_method_and_click_continue(String paymentMethod) {

        WebElement paymentMethodRadioButton = driver.findElement(By.id("/com.nopstation.nopcommerce.nopstationcart:id/tvPaymentMethodName" + paymentMethod + "']"));

        paymentMethodRadioButton.click();

        // Click on the continue button
        WebElement continueButton = driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/btnContinue"));
        continueButton.click();
    }

    @When("user click next button on payment information page")
    public void user_click_next_button_on_payment_information_page() {
        WebElement nextButton = driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/btnnextButton"));
        nextButton.click();
    }

    @Then("user click confirm button to place the order")
    public void user_click_confirm_button_to_place_the_order() {
        WebElement confirmButton = driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/btnconfirmButton"));
        confirmButton.click();
    }

    @Then("user Verify order place successfully with popup message {string}")
    public void user_verify_order_place_successfully_with_popup_message(String expectedMessage) {
        // Wait for the popup message to appear
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement popupMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("    com.nopstation.nopcommerce.nopstationcart:id/md_text_message\n")));

        // Get the text of the popup message
        String actualMessage = popupMessage.getText();

        // Assert that the actual message matches the expected message
        Assert.assertEquals("Assert.assertEquals(Your order has been successfully processed!", "Your order has been successfully processed!");
    }
}
