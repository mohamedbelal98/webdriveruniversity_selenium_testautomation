package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.security.PublicKey;

public class HomePage {

    private final WebDriver driver;
    private final By contactUsLink = By.id("contact-us");
    private final By loginPortal = By.id("login-portal");
    private final By buttonClicks = By.id("button-clicks");
    private final By toDoList = By.id("to-do-list");
    private final By accordionLink = By.xpath("/html/body/div[1]/div/div[2]/div[6]/a/div");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public ContactUsPage clickContactUsLink() {

        driver.findElement(contactUsLink).click();
        return new ContactUsPage(driver);
    }

    public LoginPortalPage clickLoginPortalLink() {

        driver.findElement(loginPortal).click();
        return new LoginPortalPage(driver);
    }

    public ButtonClicksPage clickButtonClicksLink() {

        driver.findElement(buttonClicks).click();
        return new ButtonClicksPage(driver);
    }

    public ToDoListPage clickToDoListLink() {

        driver.findElement(toDoList).click();
        return new ToDoListPage(driver);
    }

    public AccordionAndTextPage clickAccordionLink() {

        driver.findElement(accordionLink).click();
        return new AccordionAndTextPage(driver);
    }

}
