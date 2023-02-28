package accordionAndText;

import Pages.AccordionAndTextPage;
import base.BaseTest;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

import static org.testng.Assert.*;

public class TestClick extends BaseTest {


    @Test
    public void testClick() {

        AccordionAndTextPage accordionAndTextPage = homePage.clickAccordionLink();

        //Get all the windows you can handle
        Set<String> windows = getSetWindows();
        Iterator<String> iterator = windows.iterator();
        String parentWindows = iterator.next();
        String childWindows = iterator.next();

        //Switch to child windows
        switchWindows(childWindows);

        accordionAndTextPage.click();
        assertEquals(accordionAndTextPage.getTextAfterTime(), "This text has appeared after 5 seconds!", "Error in keep clicking");

    }

}
