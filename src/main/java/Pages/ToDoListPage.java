package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class ToDoListPage {

    private final WebDriver driver;
    private final By firstItemInList = By.xpath("//div[@id='container']/ul/li[1]");
    private final By deleteFirstItemButton = By.xpath("//*[@id='container']/ul/li[1]/span/i");
    private final By addItemInput = By.xpath("//input[@type='text']");
//    private final By listOfAllItem = By.xpath("//*[@id='container']/ul/child::li");
    private final By listOfAllItem = By.xpath("//*[@id='container']/ul/child::li/span/i");

    public ToDoListPage(WebDriver driver) {
        this.driver = driver;
    }

    public void deleteFirstItem() {

//        driver.findElement(firstItemInList).click();
        WebElement deleteButtonElement = driver.findElement(deleteFirstItemButton);
        WebElement firstItemElement = driver.findElement(firstItemInList);

        Actions actions = new Actions(driver);
        actions.moveToElement(firstItemElement);
        actions.moveToElement(deleteButtonElement).click().perform();
    }

    public void addItemFromTextField(String value) {

        WebElement element = driver.findElement(addItemInput);
        driver.findElement(addItemInput).sendKeys(value);
        element.sendKeys(Keys.ENTER);

    }

//    public void deleteAllItemInTheList() {
//
//        List<WebElement> list = driver.findElements(listOfAllItem);
//        int size = list.size();
//        System.out.println(size);
//
//        Actions actions = new Actions(driver);
//
//        for (int i = 1; i <= size; i++) {
//            WebElement item = driver.findElement(By.xpath("//*[@id='container']/ul/li[" + i + "]/span/i"));
//            WebElement delete = driver.findElement(By.xpath("//*[@id='container']/ul/li[" + i + "]/span/i"));
//
//            actions.moveToElement(item);
//            actions.moveToElement(delete).click().perform();
//            System.out.println("delete item number :" + i);
//        }
//    }

    public void deleteAllItemInTheList() {

        List<WebElement> webElementList = driver.findElements(listOfAllItem);
        int size = webElementList.size();
        System.out.println(size);

        Actions actions = new Actions(driver);

        for (WebElement webElement : webElementList){
            actions.moveToElement(webElement).click().perform();
        }

    }

}
