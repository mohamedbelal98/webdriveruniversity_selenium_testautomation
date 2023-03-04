package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utli.Utilities;


public class HomePage {

    private final WebDriver driver;
    private final By contactUsLink = By.id("contact-us");
    private final By loginPortal = By.id("login-portal");
    private final By buttonClicks = By.id("button-clicks");
    private final By toDoList = By.id("to-do-list");
    private final By accordionLink = By.xpath("/html/body/div[1]/div/div[2]/div[6]/a/div");
    private final By checkBoxAndDropDownAndRadioButton = By.id("dropdown-checkboxes-radiobuttons");
    private final By ajaxLoaderLink = By.id("ajax-loader");
    private final By actionsLink = By.id("actions");
    private final By scrollingAround = By.id("scrolling-around");
    private final By autoCompleteLink = By.id("autocomplete-textfield");
    private final By uploadFileLink = By.id("file-upload");

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

    public CheckBoxAndDropDownAndRadioButtonPage clickCheckAndDropDownAndRadioButton() {

        WebElement element = driver.findElement(checkBoxAndDropDownAndRadioButton);
        String scriptToScroll = "arguments[0].scrollIntoView();";

        Utilities.javaScriptExecutor(driver, element, scriptToScroll);
        driver.findElement(checkBoxAndDropDownAndRadioButton).click();
        return new CheckBoxAndDropDownAndRadioButtonPage(driver);
    }

    public AjaxLoaderPage clickAjaxLoader() {

        WebElement element = driver.findElement(ajaxLoaderLink);
        String scriptToScroll = "arguments[0].scrollIntoView();";

        Utilities.javaScriptExecutor(driver, element, scriptToScroll);
        driver.findElement(ajaxLoaderLink).click();
        return new AjaxLoaderPage(driver);
    }

    public ActionsPage clickActionsLink() {

        driver.findElement(actionsLink).click();
        return new ActionsPage(driver);

    }

    public ScrollingAround clickScrollingAround() {

        WebElement element = driver.findElement(scrollingAround);
        String scriptToScroll = "arguments[0].scrollIntoView();";

        Utilities.javaScriptExecutor(driver, element, scriptToScroll);
        driver.findElement(scrollingAround).click();
        return new ScrollingAround(driver);
    }

    public AutoCompletePage clickAutoComplete() {

        WebElement element = driver.findElement(autoCompleteLink);
        String scriptToScroll = "arguments[0].scrollIntoView();";

        Utilities.javaScriptExecutor(driver, element, scriptToScroll);
        driver.findElement(autoCompleteLink).click();
        return new AutoCompletePage(driver);
    }

    public UploadFilePage clickUploadFileLink() {

        WebElement element = driver.findElement(uploadFileLink);
        String scriptToScroll = "arguments[0].scrollIntoView();";

        Utilities.javaScriptExecutor(driver, element, scriptToScroll);
        driver.findElement(uploadFileLink).click();
        return new UploadFilePage(driver);

    }

}
