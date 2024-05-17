package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setupTest() {
        openBrowser(baseUrl);
    }

    @Test
    public void login() {
        /*
        1. userShouldNavigateToLoginPageSuccessfully
            * click on the ‘Login’ link
            * Verify the text ‘Welcome, Please Sign In!’
         */
          driver.findElement(By.className("ico-login")).click();

          String actualWelcomeText = driver.findElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]")).getText();
          String expectingWelcomeText = "Welcome, Please Sign In!";
          Assert.assertEquals("Validating welcome text", expectingWelcomeText, actualWelcomeText);

        /*
         2. userShouldLoginSuccessfullyWithValidCredentials
              * click on the ‘Login’ link
              * Enter valid username
              * Enter valid password
              * Click on ‘LOGIN’ button
              * Verify the ‘Log out’ text is display
          */
         driver.findElement(By.linkText("Log in")).click();

         driver.findElement(By.id("Email")).sendKeys("Komalkanji.13@gmail.com");

          driver.findElement(By.name("Password")).sendKeys("Kom123456");

          driver.findElement(By.xpath("//button[contains(@class,'button-1 login-button')]")).click();

          String actualText = driver.findElement(By.xpath("//a[@class='ico-logout']")).getText();
          String expectingText = "Log out";
          Assert.assertEquals(actualText, expectingText);
        /*
        3. verifyTheErrorMessage
            * click on the ‘Login’ link
            * Enter invalid username
            * Enter invalid password
            * Click on Login button
            * Verify the error message ‘Login was unsuccessful.
            Please correct the errors and try again. No customer account found’
         */

        driver.findElement(By.linkText("Log in")).click();

        driver.findElement(By.className("email")).sendKeys("Komalkanji.13@gmail.com");

        driver.findElement(By.id("Password")).sendKeys("1245");

        driver.findElement(By.xpath("//button[contains(@class,'button-1 login-button')]")).click();

        String actualErrorMessage = driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']")).getText();
        System.out.println(actualErrorMessage);
        String expectingErrorMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "The credentials provided are incorrect";
        Assert.assertEquals(actualErrorMessage, expectingErrorMessage);

    }

    @After
    public void tearDown() {
        // closeBrowser();
    }
}

