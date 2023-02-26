package login;

import Pages.LoginPortal;
import base.BaseTest;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class TestLoginPortal extends BaseTest {

    @Test
    public void testLoginPortal() {

        LoginPortal loginPortal = homePage.clickLoginPortalLink();

        //Get all the windows you can handle
        Set<String> windows = getSetWindows();
        Iterator<String> iterator = windows.iterator();
        String parentWindow = iterator.next();
        String childWindows = iterator.next();

        //Switch to child windows
        switchWindows(childWindows);

        loginPortal.setUserNameInput("User Name");
        loginPortal.setPasswordInput("password");
        loginPortal.clickLoginButton();
        loginPortal.acceptAlter();

    }
}
