package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class CheckBoxAndDropDownAndRadioButtonPage {

    private final WebDriver driver;
    private final By dropDownMenu1 = By.id("dropdowm-menu-1");
    private final By dropDownMenu2 = By.id("dropdowm-menu-2");
    private final By dropDownMenu3 = By.id("dropdowm-menu-3");
    private final By yellowRadioButton = By.xpath("//input[@value='yellow']");
    private final By blueRadioButton = By.xpath("//input[@value='blue']");
    private final By purpleRadioButton = By.xpath("//input[@value='purple']");
    private final By test = By.xpath("//*[@id=\"checkboxes\"]/label/input");

    public CheckBoxAndDropDownAndRadioButtonPage(WebDriver driver) {
        this.driver = driver;
    }

    public Select findDropDownFirstElement() {

        return new Select(driver.findElement(dropDownMenu1));
    }

    public Select findDropDownSecondElement() {

        return new Select(driver.findElement(dropDownMenu2));
    }

    public Select findDropDownThirdElement() {

        return new Select(driver.findElement(dropDownMenu3));
    }

    //Get all selections from first drop down menu
    public List<String> getFirstSelectionOptions() {

        List<WebElement> selectElements = findDropDownFirstElement().getOptions();
        return selectElements.stream().map(WebElement::getText).toList();
    }

    //Get all selections from second drop down menu
    public List<String> getSecondSelectionOptions() {

        List<WebElement> selectElements = findDropDownSecondElement().getOptions();
        return selectElements.stream().map(WebElement::getText).toList();
    }

    //Get all selections from third drop down menu
    public List<String> getThirdSelectionOptions() {

        List<WebElement> selectElements = findDropDownThirdElement().getOptions();
        return selectElements.stream().map(WebElement::getText).toList();
    }

    public void selectFromFirstDropDown(String option) {

        findDropDownFirstElement().selectByVisibleText(option);
    }

    public void selectFromSecondDropDown(String option) {

        findDropDownSecondElement().selectByVisibleText(option);
    }

    public void selectFromThirdDropDown(String option) {

        findDropDownThirdElement().selectByVisibleText(option);
    }

//    public void AllCheckBoxSelected() {
//
//        List<WebElement> list = driver.findElements(By.xpath("//div[@id='checkboxes']/label"));
//        int size = list.size();
//        System.out.println(size);
//
//        for (int i = 1; i <= size; i++) {
//
//            WebElement checkBoxElement = driver.findElement(By.xpath("//input[@value='option-" + i + "']"));
//            boolean isSelected = checkBoxElement.isSelected();
//            System.out.println(isSelected);
//
//            if (!isSelected) {
//                checkBoxElement.click();
//            }
//        }
//    }

    public void AllCheckBoxSelected (){

        List<WebElement> webElementList = driver.findElements(test);
        Actions actions = new Actions(driver);

        for (WebElement webElement : webElementList) {
            boolean isSelected = webElement.isSelected();
            System.out.println(isSelected);

            if (!isSelected) {
                actions.moveToElement(webElement).click().perform();
            }
        }
    }

    public void selectRadioButton() {

        driver.findElement(yellowRadioButton).click();
        driver.findElement(blueRadioButton).click();
        driver.findElement(purpleRadioButton).click();
    }

}
