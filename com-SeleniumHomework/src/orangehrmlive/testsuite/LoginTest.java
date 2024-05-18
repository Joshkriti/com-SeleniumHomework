package orangehrmlive.testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setupTest(){
        openBrowser(baseUrl);
    }

    @Test
    public void login(){
        /*
        1. userSholdLoginSuccessfullyWithValidCredentials
            * Enter “Admin” username
            * Enter “admin123“ password
            * Click on ‘LOGIN’ button
            * Verify the ‘Dashboard’ text is display
         */

        driver.findElement(By.name("username")).sendKeys("Admin");

        driver.findElement(By.name("password")).sendKeys("admin123");

        driver.findElement(By.tagName("button")).click();

        String actualOutcome = driver.findElement(By.xpath("//div[@class='oxd-topbar-header']/div[1]/span[1]/h6[1]")).getText();
        String expectingOutcome = "Dashboard";
        Assert.assertEquals("Display text Dashboard: " , actualOutcome,expectingOutcome);

    }

    @After
    public void tearDown(){
        // closeBrowser();
    }
}
