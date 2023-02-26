package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPortal {

    private final WebDriver driver;
    private final By userNameInput = By.xpath("//input[@type='text']");
    private final By passwordInput = By.id("password");
    private final By loginButton = By.id("login-button");

    public LoginPortal(WebDriver driver) {
        this.driver = driver;
    }

    public void setUserNameInput(String userName) {

        driver.findElement(userNameInput).sendKeys(userName);
    }

    public void setPasswordInput(String password) {

        driver.findElement(passwordInput).sendKeys(password);
    }

    public void clickLoginButton(){

        driver.findElement(loginButton).click();
    }

    public void acceptAlter(){

        driver.switchTo().alert().accept();
    }

}
