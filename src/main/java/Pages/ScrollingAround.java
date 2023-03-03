package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class ScrollingAround {

    private final WebDriver driver;
    private final By firstScroll = By.id("zone1");
    private final By leftEntries = By.id("zone2-entries");
    private final By rightEntries = By.id("zone3-entries");
    private final By finalScroll = By.id("zone4");

    public ScrollingAround(WebDriver driver) {
        this.driver = driver;
    }

    public void setFirstScroll() {

        WebElement element = driver.findElement(firstScroll);
        Actions actions = new Actions(driver);

        actions.moveToElement(element).perform();
    }

    public String getFirstScrollText() {

        return driver.findElement(firstScroll).getText();
    }

    public void scrollLeftEntries() {

        WebElement element = driver.findElement(leftEntries);
        Actions actions = new Actions(driver);

        actions.moveToElement(element).perform();
    }

    public String getLeftEntriesText() {

        return driver.findElement(leftEntries).getText();
    }

    public void scrollRightEntries() {

        WebElement element = driver.findElement(rightEntries);
        Actions actions = new Actions(driver);

        actions.moveToElement(element).perform();
    }

    public String getRightEntriesText() {

        return driver.findElement(rightEntries).getText();
    }

    public void setFinalScroll() {

        WebElement element = driver.findElement(finalScroll);
        Actions actions = new Actions(driver);

        actions.moveToElement(element).perform();
    }

}
