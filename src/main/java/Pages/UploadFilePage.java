package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UploadFilePage {

    private final WebDriver driver;
    private final By uploadFileButton = By.id("myFile");
    private final By submitButton = By.id("submit-button");

    public UploadFilePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickSubmitButton() {

        driver.findElement(submitButton).click();
    }

    public void clickUploadFile(String pathName) {

        driver.findElement(uploadFileButton).sendKeys(pathName);
        clickSubmitButton();
        driver.switchTo().alert().accept();
    }

}
