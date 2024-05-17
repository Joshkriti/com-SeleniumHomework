package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class RegisterTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";
    @Before
    public void setupTest(){
        openBrowser(baseUrl);
    }
    @Test
    public void register(){
        /*
        1. UserShouldNavigateToRegisterPageSuccessfully
            * click on the ‘Register’ link
            * Verify the text ‘Register’
         */
        driver.findElement(By.linkText("Register")).click();

        String actualRegister = driver.findElement(By.xpath("//div[@class='header-links-wrapper']/div[1]/ul[1]/li[1]/a[1]")).getText();
        String expectingRegister = "Register";
        Assert.assertEquals("Print Register: ", actualRegister,expectingRegister);
        /*
        2. userSholdRegisterAccountSuccessfully * click on the ‘Register’ link
            * Select gender radio button
            * Enter First name
            * Enter Last name
            * Enter Email address
            * Enter Password
            * Enter Confirm password
            * Click on REGISTER button
            * Verify the text 'Your registration completed’
         */
        driver.findElement(By.className("female")).click();

        driver.findElement(By.id("FirstName")).sendKeys("Komal");

        driver.findElement(By.name("LastName")).sendKeys("Kanji");

        driver.findElement(By.id("Email")).sendKeys("Komalkanji.05@gmail.com");

        driver.findElement(By.id("Password")).sendKeys("Kom123456");

        driver.findElement(By.name("ConfirmPassword")).sendKeys("Kom123456");

        driver.findElement(By.id("register-button")).click();

        String actualRegisterSuccessful = driver.findElement(By.xpath("//div[@class='page-body']/div[1]")).getText();
        String expectingRegisterSuccessful = "Your registration completed";
        Assert.assertEquals("Register completed ",actualRegisterSuccessful,expectingRegisterSuccessful);



    }




    public void tearDown(){
        // closeBrowser();
    }
}
