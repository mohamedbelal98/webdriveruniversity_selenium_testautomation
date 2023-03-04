package uploadFile;

import Pages.UploadFilePage;
import base.BaseTest;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class TestUploadFile extends BaseTest {

    @Test
    public void testUploadFile(){

        UploadFilePage uploadFilePage = homePage.clickUploadFileLink();

        //Get all the windows you can handle
        Set<String> windows = getSetWindows();
        Iterator<String> iterator = windows.iterator();
        String parentWindows = iterator.next();
        String childWindows = iterator.next();

        //Switch to child windows
        switchWindows(childWindows);

        uploadFilePage.clickUploadFile(
                "C:\\Users\\HELAL\\IdeaProjects\\webdriveruniversity_selenium_testautomation\\src\\main\\java\\utli\\uploadFilePath\\testImage.jfif");
    }
}
