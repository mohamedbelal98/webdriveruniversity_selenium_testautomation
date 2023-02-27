package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactUsPage {

    private final WebDriver driver;
    private final By firstNameInput = By.name("first_name");
    private final By lastNameInput = By.name("last_name");
    private final By emailInput = By.name("email");
    private final By messageInput = By.name("message");
    private final By submitButton = By.xpath("//input[contains(@type,'submit')]");
    private final By resetButton = By.xpath("//input[contains(@type,'reset')]");
    private final By contactUsText = By.className("section_header");


    public ContactUsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setFirstNameInput(String firstName) {

        driver.findElement(firstNameInput).sendKeys(firstName);
    }

    public void setLastNameInput(String lastName) {

        driver.findElement(lastNameInput).sendKeys(lastName);
    }

    public void setEmailInput(String email) {

        driver.findElement(emailInput).sendKeys(email);
    }

    public void setMessageInput(String message) {

        driver.findElement(messageInput).sendKeys(message);
    }

    public ThankMessagePage clickSubmitButton() {

        driver.findElement(submitButton).click();
        return new ThankMessagePage(driver);
    }

    public void clickResetButton() {

        driver.findElement(resetButton).click();
    }

    public String getContactUsText() {

        return driver.findElement(contactUsText).getText();
    }

    public String getFirstNameText() {

        return driver.findElement(firstNameInput).getText();
    }

}
