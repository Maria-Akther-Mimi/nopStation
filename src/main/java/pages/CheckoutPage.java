package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckoutPage {
    private WebDriver driver;
    private WebDriverWait wait;

    // Constructor
    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);

    }

    public void inputBillingDetails(String firstName, String lastName, String email, String company, String state, String address, String city, String country, String zip, String phone) {
        WebElement firstNameInput = driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/etFirstName"));
        firstNameInput.sendKeys(firstName);

        WebElement lastNameInput = driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/etLastName"));
        lastNameInput.sendKeys(lastName);

        WebElement emailInput = driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/etEmail"));
        emailInput.sendKeys(email);

        WebElement companyInput = driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/etCompanyName"));
        companyInput.sendKeys(company);

        WebElement addressInput = driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/etStreetAddress"));
        addressInput.sendKeys(address);

        WebElement cityInput = driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/etCity"));
        cityInput.sendKeys(city);

        WebElement stateInput = driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/etState"));
        stateInput.sendKeys(city);

        WebElement countryInput = driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/countrySpinnerLayout"));
        countryInput.sendKeys(country);

        WebElement zipInput = driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/etZipCode"));
        zipInput.sendKeys(zip);

        WebElement phoneInput = driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/etPhone"));
        phoneInput.sendKeys(phone);

    }

    public void selectShippingMethod(String shippingMethod) {
        WebElement shippingMethodRadioButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.nopstation.nopcommerce.nopstationcart:id/tvShippingMethodName" + shippingMethod + "']")));
        shippingMethodRadioButton.click();
    }

    public void selectPaymentMethod(String paymentMethod) {
        WebElement paymentMethodRadioButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.nopstation.nopcommerce.nopstationcart:id/tvPaymentMethodName" + paymentMethod + "']")));
        paymentMethodRadioButton.click();
    }

    public void clickContinueButton() {
        WebElement continueButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.nopstation.nopcommerce.nopstationcart:id/btnContinue")));
        continueButton.click();
    }

}