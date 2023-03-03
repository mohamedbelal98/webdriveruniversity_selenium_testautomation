package autoComplete;

import Pages.AutoCompletePage;
import base.BaseTest;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class TestAutoComplete extends BaseTest {

    @Test
    public void testAjaxLoader() {

        AutoCompletePage autoCompletePage = homePage.clickAutoComplete();


        //Get all the windows you can handle
        Set<String> windows = getSetWindows();
        Iterator<String> iterator = windows.iterator();
        String parentWindows = iterator.next();
        String childWindows = iterator.next();

        //Switch to child windows
        switchWindows(childWindows);

        autoCompletePage.autoComplete("A");
    }
}
