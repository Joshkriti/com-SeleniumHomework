package orangehrmlive.testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class ForgotPasswordTest extends BaseTest {

    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setupTest(){
        openBrowser(baseUrl);
    }

    @Test
    public void ForgotPasswordTest() {
    /*
    1. userShouldNavigateToForgotPasswordPageSuccessfully
        * click on the ‘Forgot your password’ link
        * Verify the text ‘Reset Password’
     */

        driver.findElement(By.xpath("//div[contains(@class,'orangehrm-login-forgot')]/p[1]")).click();

        String actualText = driver.findElement(By.xpath("//div[@class='orangehrm-card-container']/form[1]/h6[1]")).getText();
        String expectingText = "Reset Password";
        Assert.assertEquals("Print Reset Password: ",actualText,expectingText);

    }

    @After
    public void tearDown(){
        //  closeBrowser();
    }
}
