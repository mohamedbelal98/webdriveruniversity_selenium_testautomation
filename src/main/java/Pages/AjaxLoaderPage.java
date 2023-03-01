package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utli.Utilities;

public class AjaxLoaderPage {

    private final WebDriver driver;
    private final By clickMeButton = By.id("button1");
    private final By alertButton = By.xpath("//div[@class='modal-footer']/child::button");

    public AjaxLoaderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickInClickMeButton() {

        Utilities.waitStrategyVisibility(driver, clickMeButton, 20);
        driver.findElement(clickMeButton).click();
        Utilities.waitStrategyVisibility(driver, alertButton, 20);
        driver.findElement(alertButton).click();
    }

}
