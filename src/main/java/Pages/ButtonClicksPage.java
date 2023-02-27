package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utli.Utilities;

public class ButtonClicksPage {

    private final WebDriver driver;
    private final By webElementButton = By.id("button1");
    private final By javaScriptButton = By.cssSelector("span#button2");
    private final By actionAndClickButton = By.id("button3");
    private final By closeAlertButton = By.xpath("//div[@class='modal-footer']/child::button");
    private final By closeAlertButtonForJava = By.xpath("//*[@id='myModalJSClick']/div/div/div[3]/button");
    private final By closeAlertButtonForAction = By.xpath("//*[@id='myModalMoveClick']/div/div/div[3]/button");

    public ButtonClicksPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickWebElementButtonAndCloseAlert() {

        driver.findElement(webElementButton).click();

        Utilities.waitStrategyVisibility(driver, closeAlertButton, 20);
        driver.findElement(closeAlertButton).click();
    }

    public void clickJavaScriptButtonAndCloseAlert() {

        WebElement element = driver.findElement(javaScriptButton);

//        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
//        javascriptExecutor.executeScript("arguments[0].click();", element);

        Utilities.javaScriptExecutor(driver, element, "arguments[0].click();");

        Utilities.waitStrategyVisibility(driver, closeAlertButtonForJava, 20);
        driver.findElement(closeAlertButtonForJava).click();
    }

    public void clickActionAndMoveButtonAndCloseAlert() {

        WebElement element = driver.findElement(actionAndClickButton);
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().perform();

        Utilities.waitStrategyVisibility(driver, closeAlertButtonForAction, 20);
        driver.findElement(closeAlertButtonForAction).click();
    }

}
