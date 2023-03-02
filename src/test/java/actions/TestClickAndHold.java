package actions;

import Pages.ActionsPage;
import base.BaseTest;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

import static org.testng.Assert.assertEquals;

public class TestClickAndHold extends BaseTest {

    @Test
    public void testClickAndHold() {

        ActionsPage actionsPage = homePage.clickActionsLink();

        //Get all the windows you can handle
        Set<String> windows = getSetWindows();
        Iterator<String> iterator = windows.iterator();
        String parentWindow = iterator.next();
        String childWindows = iterator.next();

        //Switch to child windows
        switchWindows(childWindows);

        actionsPage.clickAndHold();
        assertEquals(actionsPage.getText(),"Well done! keep holding that click now.....","Error on click and hold");
    }

}
