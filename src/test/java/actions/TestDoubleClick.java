package actions;

import Pages.ActionsPage;
import base.BaseTest;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

import static org.testng.Assert.assertEquals;

public class TestDoubleClick extends BaseTest {

    @Test
    public void testDragAndDrop() {

        ActionsPage actionsPage = homePage.clickActionsLink();

        //Get all the windows you can handle
        Set<String> windows = getSetWindows();
        Iterator<String> iterator = windows.iterator();
        String parentWindow = iterator.next();
        String childWindows = iterator.next();

        //Switch to child windows
        switchWindows(childWindows);

        actionsPage.doubleClick();

        assertEquals(actionsPage.getClassName(), "div-double-click double", "Error in double click button");

    }

}
