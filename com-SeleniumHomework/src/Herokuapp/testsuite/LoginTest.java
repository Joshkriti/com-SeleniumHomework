package Herokuapp.testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest{

        String baseUrl = "http://the-internet.herokuapp.com/login";

        @Before
        public void setupTest(){
            openBrowser(baseUrl);
        }
        @Test
        public void LoginTest() {
        /*
        1. UserSholdLoginSuccessfullyWithValidCredentials
            * Enter “tomsmith” username
            * Enter “SuperSecretPassword!” password
            * Click on ‘LOGIN’ button
            * Verify the text “Secure Area”
         */

            driver.findElement(By.name("username")).sendKeys("tomsmith");

            driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");

            driver.findElement(By.className("radius")).click();

            String actualText = driver.findElement(By.xpath("//div[@class='example']/h2[1]")).getText();
            String expectingText = "Secure Area";
            Assert.assertEquals("Secure Area: ", actualText, expectingText);
        }


        @Test
        public void usernameError() {
        /*
        2. verifyTheUsernameErrorMessage
            * Enter “tomsmith1” username
            * Enter “SuperSecretPassword!” password
            * Click on ‘LOGIN’ button
            * Verify the error message “Your username is invalid!”
         */

            driver.findElement(By.name("username")).sendKeys("tomsmith1");

            driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");

            driver.findElement(By.className("radius")).click();

            String actualText1 = driver.findElement(By.xpath("//div[contains(@id,'flash-messages')]/div[1]")).getText();
            System.out.println(actualText1);
            String expectingText1 = "Your username is invalid!\n" +
                    "×";
            Assert.assertEquals("It should give a error: ", actualText1, expectingText1);
        }

        @Test
        public void passwordError() {
        /*
        3. verifyThePasswordErrorMessage
            * Enter “tomsmith” username
            * Enter “SuperSecretPassword” password
            * Click on ‘LOGIN’ button
            * Verify the error message “Your password is invalid!”
         */
            driver.findElement(By.name("username")).sendKeys("tomsmith");

            driver.findElement(By.id("password")).sendKeys("SuperSecretPassword");

            driver.findElement(By.className("radius")).click();

            String actualText2 = driver.findElement(By.xpath("//div[contains(@class,'row')]/div[1]/div[1]")).getText();
            System.out.println(actualText2);
            String expectingText2 = "Your password is invalid!\n" +
                    "×";
            Assert.assertEquals("It should give a error: ", actualText2 , expectingText2);


        }

        @After
        public void tearDown(){
            // closeBrowser();
        }

}
