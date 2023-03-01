package CheckBoxAndDropDownAndRadioButton;

import Pages.CheckBoxAndDropDownAndRadioButtonPage;
import base.BaseTest;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class TestDropDownMenu extends BaseTest {

    @Test
    public void testDropDownMenu() {

        CheckBoxAndDropDownAndRadioButtonPage checkBoxAndDropDownAndRadioButtonPage = homePage.clickCheckAndDropDownAndRadioButton();

        //Get all the windows you can handle
        Set<String> windows = getSetWindows();
        Iterator<String> iterator = windows.iterator();
        String parentWindows = iterator.next();
        String childWindows = iterator.next();

        //Switch to child windows
        switchWindows(childWindows);

        var selectedFirstOptions = checkBoxAndDropDownAndRadioButtonPage.getFirstSelectionOptions();
        System.out.println(selectedFirstOptions);

        String option = selectedFirstOptions.get(1);
        System.out.println(option);

        checkBoxAndDropDownAndRadioButtonPage.selectFromFirstDropDown(option);

        var selectedSecondOptions = checkBoxAndDropDownAndRadioButtonPage.getSecondSelectionOptions();
        System.out.println(selectedSecondOptions);

        String option2 = selectedSecondOptions.get(2);
        System.out.println(option2);

        checkBoxAndDropDownAndRadioButtonPage.selectFromSecondDropDown(option2);

        var selectedThirdOptions = checkBoxAndDropDownAndRadioButtonPage.getThirdSelectionOptions();
        System.out.println(selectedThirdOptions);

        String option3 = selectedThirdOptions.get(3);
        System.out.println(option3);

        checkBoxAndDropDownAndRadioButtonPage.selectFromThirdDropDown(option3);

    }
}
