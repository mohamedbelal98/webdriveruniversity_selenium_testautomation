package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private final WebDriver driver;
    private final By contactUsLink = By.id("contact-us");
    private final By loginPortal = By.id("login-portal");
    private final By buttonClicks = By.id("button-clicks");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public ContactUs clickContactUsLink() {

        driver.findElement(contactUsLink).click();
        return new ContactUs(driver);
    }

    public LoginPortal clickLoginPortalLink() {

        driver.findElement(loginPortal).click();
        return new LoginPortal(driver);
    }

    public ButtonClicks clickButtonClicksLink() {

        driver.findElement(buttonClicks).click();
        return new ButtonClicks(driver);
    }

}
