package toDoList;

import Pages.ToDoListPage;
import base.BaseTest;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class TestDeleteFromList extends BaseTest {

    @Test
    public void testDeleteItem() {

        ToDoListPage toDoListPage = homePage.clickToDoListLink();

        //Get all the windows you can handle
        Set<String> windows = getSetWindows();
        Iterator<String> iterator = windows.iterator();
        String parentWindows = iterator.next();
        String childWindows = iterator.next();

        //Switch to child windows
        switchWindows(childWindows);

        toDoListPage.deleteFirstItem();
    }
}
