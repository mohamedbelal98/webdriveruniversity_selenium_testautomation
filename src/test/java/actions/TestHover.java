package actions;

import Pages.ActionsPage;
import base.BaseTest;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;


public class TestHover extends BaseTest {

    @Test
    public void testHover() {

        ActionsPage actionsPage = homePage.clickActionsLink();

        //Get all the windows you can handle
        Set<String> windows = getSetWindows();
        Iterator<String> iterator = windows.iterator();
        String parentWindow = iterator.next();
        String childWindows = iterator.next();

        //Switch to child windows
        switchWindows(childWindows);

        actionsPage.hoverFirst();
        actionsPage.hoverSecond();

    }

}
