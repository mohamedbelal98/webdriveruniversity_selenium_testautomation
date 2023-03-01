package CheckBoxAndDropDownAndRadioButton;

import Pages.CheckBoxAndDropDownAndRadioButtonPage;
import base.BaseTest;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class TestRadioButton extends BaseTest  {

    @Test
    public void testRadioButton(){

        CheckBoxAndDropDownAndRadioButtonPage checkBoxAndDropDownAndRadioButtonPage = homePage.clickCheckAndDropDownAndRadioButton();

        //Get all the windows you can handle
        Set<String> windows = getSetWindows();
        Iterator<String> iterator = windows.iterator();
        String parentWindows = iterator.next();
        String childWindows = iterator.next();

        //Switch to child windows
        switchWindows(childWindows);

        checkBoxAndDropDownAndRadioButtonPage.selectRadioButton();
    }
}
