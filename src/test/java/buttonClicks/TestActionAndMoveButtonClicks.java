package buttonClicks;

import Pages.ButtonClicksPage;
import base.BaseTest;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class TestActionAndMoveButtonClicks extends BaseTest {

    @Test
    public void testActionAndMoveButtonClicks() {

        ButtonClicksPage buttonClicks = homePage.clickButtonClicksLink();

        //Get all the windows you can handle
        Set<String> windows = getSetWindows();
        Iterator<String> iterator = windows.iterator();
        String parentWindows = iterator.next();
        String childWindows = iterator.next();

        //Switch to child windows
        switchWindows(childWindows);

        buttonClicks.clickActionAndMoveButtonAndCloseAlert();

    }
}
