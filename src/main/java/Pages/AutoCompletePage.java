package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AutoCompletePage {


    private final WebDriver driver;
    private final By inputField = By.xpath("//input[@name='food-item']");
    private final By menu = By.xpath("//*[@id='myInputautocomplete-list']/div");
    private final By submitButton = By.id("submit-button");

    public AutoCompletePage(WebDriver driver) {
        this.driver = driver;
    }

    public void autoComplete(String input) {

        driver.findElement(inputField).sendKeys(input);

        List<WebElement> webElementList = driver.findElements(menu);

        int size = webElementList.size();
        System.out.println(size);

//        for (int i = 1; i <= size; i++) {
//            System.out.println(driver.findElement(By.xpath("" +
//                    "//*[@id='myInputautocomplete-list']/div[" + i + "]")).getText());
//        }

        for (WebElement webElement : webElementList) {
            String element = webElement.getText();
            System.out.println(element);

            if (element.equalsIgnoreCase("Apple")) {
                webElement.click();
            }
        }

        driver.findElement(submitButton).click();
    }

}
