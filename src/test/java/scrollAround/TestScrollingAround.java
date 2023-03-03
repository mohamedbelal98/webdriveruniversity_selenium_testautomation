package scrollAround;

import Pages.ScrollingAround;
import base.BaseTest;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

import static org.testng.Assert.assertEquals;

public class TestScrollingAround extends BaseTest {

    @Test
    public void testScrollingAround() {

        ScrollingAround scrollingAround = homePage.clickScrollingAround();

        //Get all the windows you can handle
        Set<String> windows = getSetWindows();
        Iterator<String> iterator = windows.iterator();
        String parentWindow = iterator.next();
        String childWindows = iterator.next();

        //Switch to child windows
        switchWindows(childWindows);

        scrollingAround.setFirstScroll();
        assertEquals(scrollingAround.getFirstScrollText(), "Well done for scrolling to me!",
                "Error in first scroll in the page");

        scrollingAround.scrollLeftEntries();
        assertEquals(scrollingAround.getLeftEntriesText(), "1 Entries",
                "Error in left entries scroll");

        scrollingAround.scrollRightEntries();
        assertEquals(scrollingAround.getRightEntriesText(), "1 Entries",
                "Error in right entries scroll");

        scrollingAround.setFinalScroll();
    }
}
