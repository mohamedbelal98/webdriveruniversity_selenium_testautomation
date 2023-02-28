package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utli.Utilities;

public class AccordionAndTextPage {

    private final WebDriver driver;
    private final By manualTestClick = By.id("manual-testing-accordion");
    private final By cucumberBDDClick = By.id("cucumber-accordion");
    private final By automationTestingClick = By.id("automation-accordion");
    private final By keepClicking = By.id("click-accordion");
    private final By loadTextToClick = By.id("hidden-text");
    private final By textAfterTime = By.id("timeout");

    public AccordionAndTextPage(WebDriver driver) {
        this.driver = driver;
    }

    public void click() {

        driver.findElement(manualTestClick).click();
        driver.findElement(cucumberBDDClick).click();
        driver.findElement(automationTestingClick).click();

        WebElement element = driver.findElement(loadTextToClick);
        String completeText = "LOADING COMPLETE.";

        Utilities.waitStrategyTextPresent(driver,element,completeText,20);

        driver.findElement(keepClicking).click();
    }

    public String getTextAfterTime() {

        return driver.findElement(textAfterTime).getText();
    }

}