import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MTS {

    public void setUp() {
        // Настройка WebDriver
        System.setProperty("webdriver.chrome.driver", "//Users/anastasiia.onishchuk/Documents/chrome-mac-arm64");
        driver = new ChromeDriver();
        driver.get("https://mts.by");
    }
    }