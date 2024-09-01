import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OnlinePage {
    private WebDriver driver;

    public OnlineTopUpPage(WebDriver driver) {
        this.driver = driver;
    }

    private By blockTitle = By.xpath("//h2[text()='Онлайн пополнение без комиссии']");
    private By paymentLogos = By.cssSelector(".payment-logo");
    private By moreInfoLink = By.linkText("Подробнее о сервисе");
    private By serviceTypeSelect = By.id("serviceType");
    private By phoneNumberInput = By.id("phoneNumber");
    private By continueButton = By.id("continueButton");
    private By errorMessages = By.cssSelector(".error-message");
    private By amountLabel = By.id("amountLabel");
    private By phoneNumberDisplay = By.id("phoneNumberDisplay");
    private By cardNumberInput = By.id("cardNumber");
    private By cardExpiryInput = By.id("cardExpiry");
    private By cardCVVInput = By.id("cardCVV");
    private By paymentIcons = By.cssSelector(".payment-icon");

    public String getBlockTitle() {
        return driver.findElement(blockTitle).getText();
    }

    public boolean arePaymentLogosVisible() {
        return driver.findElements(paymentLogos).size() > 0;
    }

    public void clickMoreInfoLink() {
        driver.findElement(moreInfoLink).click();
    }

    public void selectServiceType(String type) {
        WebElement selectElement = driver.findElement(serviceTypeSelect);
        selectElement.sendKeys(type);
    }

    public void fillPhoneNumber(String phoneNumber) {
        WebElement input = driver.findElement(phoneNumberInput);
        input.clear();
        input.sendKeys(phoneNumber);
    }

    public void clickContinueButton() {
        driver.findElement(continueButton).click();
    }

    public String getErrorMessage(String field) {
        return driver.findElement(By.cssSelector(".error-message[data-field='" + field + "']")).getText();
    }

    public String getAmountLabel() {
        return driver.findElement(amountLabel).getText();
    }

    public String getPhoneNumberDisplay() {
        return driver.findElement(phoneNumberDisplay).getText();
    }

    public boolean arePaymentIconsVisible() {
        return driver.findElements(paymentIcons).size() > 0;
    }

    public String getPlaceholderForField(String fieldId) {
        return driver.findElement(By.id(fieldId)).getAttribute("placeholder");
    }
}
