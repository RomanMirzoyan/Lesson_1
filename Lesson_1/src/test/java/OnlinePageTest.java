import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OnlinePageTest {
    private WebDriver driver;
    private OnlinePageTest Page;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://mts.by");
        Page = new OnlinePageTest(driver);
    }

    @Test
    public void testBlockTitle() {
        Assert.assertEquals("Онлайн пополнение без комиссии", Page.getBlockTitle());
    }

    @Test
    public void testPaymentLogos() {
        Assert.assertTrue(Page.arePaymentLogosVisible());
    }

    @Test
    public void testMoreInfoLink() {
        Page.clickMoreInfoLink();
        MoreInfoPage moreInfoPage = new MoreInfoPage(driver);
    }

    @Test
    public void testFillFormAndContinue() {
        Page.selectServiceType("Услуги связи");
        Page.fillPhoneNumber("297777777");
        Page.clickContinueButton();


        Assert.assertEquals("297777777", Page.getPhoneNumberDisplay());
        Assert.assertTrue(Page.arePaymentIconsVisible());


        Assert.assertEquals("Номер карты", Page.getPlaceholderForField("cardNumber"));
        Assert.assertEquals("Срок действия", Page.getPlaceholderForField("cardExpiry"));
        Assert.assertEquals("CVV", Page.getPlaceholderForField("cardCVV"));
    }

    @Test
    public void testErrorMessages() {

        String[] serviceTypes = {"Услуги связи", "Домашний интернет", "Рассрочка", "Задолженность"};
        for (String type : serviceTypes) {
            Page.selectServiceType(type);
            Page.fillPhoneNumber("");
            Page.clickContinueButton();
            Assert.assertTrue(Page.getErrorMessage("phoneNumber").contains("Введите номер телефона"));
        }
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}

