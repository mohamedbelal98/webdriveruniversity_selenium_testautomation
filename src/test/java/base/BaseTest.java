package base;

import Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import utli.Utilities;

import java.io.IOException;
import java.util.Date;
import java.util.Set;

public class BaseTest {

    WebDriver driver;
    protected HomePage homePage;
    Date date = new Date();
    String currentDate = date + "";

    @BeforeClass
    public void setUp() {

        System.getProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://webdriveruniversity.com/");
        goHome();

        homePage = new HomePage(driver);
    }

    @BeforeMethod
    public void goHome() {

        driver.get("https://webdriveruniversity.com/");
    }

    @AfterClass
    public void tearDown() {

        driver.quit();
    }

    @AfterMethod
    public void failed_screenShot(ITestResult iTestResult) throws IOException {

        if (iTestResult.getStatus() == ITestResult.FAILURE) {
            Utilities.takeScreenShot(driver, "screenShot/" + iTestResult.getName() + currentDate + ".png");
        }

    }

    public Set<String> getSetWindows() {

        return driver.getWindowHandles();
    }

    public void switchWindows(String window) {

        driver.switchTo().window(window);
    }

}
