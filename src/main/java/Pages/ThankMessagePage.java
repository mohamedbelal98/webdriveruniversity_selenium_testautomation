package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ThankMessagePage {

    private final WebDriver driver;
    private final By thankYouText = By.xpath("//div[@id='contact_reply']");

    public ThankMessagePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getThankYouText() {

        return driver.findElement(thankYouText).getText();
    }

}
