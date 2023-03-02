package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsPage {

    private final WebDriver driver;
    private final By dragLocator = By.id("draggable");
    private final By dropLocator = By.id("droppable");
    private final By droppedText = By.xpath("//div[@id='droppable']/p/child::b");
    private final By doubleClickButton = By.id("double-click");
    private final By firstHoverButton = By.xpath("//div[@class='dropdown hover']/button");
    private final By firstLinkButton = By.xpath("//div[@id='div-hover']/div[1]/div/a");
    private final By secondHoverButton = By.xpath("//*[@id='div-hover']/div[2]/button");
    private final By secondLinkButton = By.xpath("//*[@id='div-hover']/div[2]/div/a");
    private final By clickAndHoldButton = By.id("click-box");

    public ActionsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void dragAndDrop() {

        WebElement dragElement = driver.findElement(dragLocator);
        WebElement dropElement = driver.findElement(dropLocator);

        Actions actions = new Actions(driver);
        actions.dragAndDrop(dragElement, dropElement).perform();
    }

    public String getDroppedText() {

        return driver.findElement(droppedText).getText();
    }

    public void doubleClick() {

        WebElement doubleClickElement = driver.findElement(doubleClickButton);

        Actions actions = new Actions(driver);
        actions.doubleClick(doubleClickElement).perform();
    }

    public String getClassName() {

        return driver.findElement(doubleClickButton).getAttribute("class");
    }

    public void hoverFirst() {

        WebElement firstHoverElement = driver.findElement(firstHoverButton);
        WebElement firstLinkElement = driver.findElement(firstLinkButton);

        Actions actions = new Actions(driver);

        actions.moveToElement(firstHoverElement).perform();
        actions.moveToElement(firstLinkElement).click().perform();

        driver.switchTo().alert().accept();
    }

    public void hoverSecond() {

        WebElement secondHoverElement = driver.findElement(secondHoverButton);
        WebElement secondLinkElement = driver.findElement(secondLinkButton);

        Actions actions = new Actions(driver);

        actions.moveToElement(secondHoverElement).perform();
        actions.moveToElement(secondLinkElement).click().perform();

        driver.switchTo().alert().accept();
    }

    public void clickAndHold(){

        WebElement element = driver.findElement(clickAndHoldButton);

        Actions actions = new Actions(driver);

        actions.clickAndHold(element).perform();
    }

    public String getText(){

        return driver.findElement(clickAndHoldButton).getText();
    }

}
