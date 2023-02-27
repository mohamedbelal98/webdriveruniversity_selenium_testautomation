package contactUs;

import Pages.ContactUsPage;
import base.BaseTest;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

import static org.testng.Assert.*;

public class TestResetContactUs extends BaseTest {

    @Test
    public void testResetContactUs() {

        ContactUsPage contactUs = homePage.clickContactUsLink();

        //Get all the windows you can handle
        Set<String> windows = getSetWindows();
        Iterator<String> iterator = windows.iterator();
        String parentWindow = iterator.next();
        String childWindows = iterator.next();

        //Switch to child windows
        switchWindows(childWindows);

        assertEquals(contactUs.getContactUsText(), "CONTACT US", "Error in Contact Us page");

        contactUs.setFirstNameInput("Mohamed");
        contactUs.setLastNameInput("Belal");
        contactUs.setEmailInput("mohamed@gmail.com");
        contactUs.setMessageInput("Message");
        contactUs.clickResetButton();

        assertEquals(contactUs.getFirstNameText(),"","Error in first name (Not empty).");

    }
}
