package contactUs;

import Pages.ContactUsPage;
import Pages.ThankMessagePage;
import base.BaseTest;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

import static org.testng.Assert.*;

public class TestSubmitContactUs extends BaseTest {

    @Test
    public void testSubmitContactUs() {

        ContactUsPage contactUs = homePage.clickContactUsLink();

        //Get all the windows you can handle
        Set<String> windows = getSetWindows();
        Iterator<String> iterator = windows.iterator();
        String parentWindow = iterator.next();
        String childWindows = iterator.next();

        //Switch to child windows
        switchWindows(childWindows);

        assertEquals(contactUs.getContactUsText(),"CONTACT US","Error in Contact Us page");

        contactUs.setFirstNameInput("Mohamed");
        contactUs.setLastNameInput("Belal");
        contactUs.setEmailInput("mohamed@gmail.com");
        contactUs.setMessageInput("Message");
        ThankMessagePage thankMessagePage = contactUs.clickSubmitButton();

        assertEquals(thankMessagePage.getThankYouText(),"Thank You for your Message!","Error in thank you page");

    }
}
