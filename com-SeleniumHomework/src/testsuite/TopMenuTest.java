package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class TopMenuTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";
    @Before
    public void setupTest(){
        openBrowser(baseUrl);
    }

    @Test
    public void topMenu(){
        /*
        1. userShouldNavigateToComputerPageSuccessfully
            * click on the ‘Computers’ Tab
            * Verify the text ‘Computers’
         */
        driver.findElement(By.linkText("Computers")).click();

        String actualText = driver.findElement(By.xpath("//a[contains(text(),'Computers ')]")).getText();
        String expectingText = "Computers";
        Assert.assertEquals("Should print Computers: ", actualText, expectingText);

        /*
        2. userShouldNavigateToElectronicsPageSuccessfully
            * click on the ‘Electronics’ Tab
            * Verify the text ‘Electronics’
         */
        driver.findElement(By.linkText("Electronics")).click();

        String actualText1 = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[2]/a[1]")).getText();
        String expectingText1 = "Electronics";
        Assert.assertEquals("Should print electronics: ", actualText1,expectingText1);
        /*
        3.userShouldNavigateToApparelPageSuccessfull
            * click on the ‘Apparel’ Tab
            * Verify the text ‘Apparel’
         */
        driver.findElement(By.linkText("Apparel")).click();

        String actualText2 = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[3]/a[1]")).getText();
        String expectingText2 = "Apparel";
        Assert.assertEquals("Should print apparel: ", actualText2,expectingText2);
        /*
        4.userShouldNavigateToDigitalDownloadsPageSuccessfull
            * click on the ‘Digital downloads’ Tab
            * Verify the text ‘Digital downloads’
         */
        driver.findElement(By.linkText("Digital downloads")).click();

        String actualText3 = driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).getText();
        String expectingText3 = "Digital downloads";
        Assert.assertEquals("Should print Digital downloads: ", actualText3 ,expectingText3);
        /*
        5. userShouldNavigateToBooksPageSuccessfully
            * click on the ‘Books’ Tab
            * Verify the text ‘Books’
         */
        driver.findElement(By.linkText("Books")).click();

        String actualText4 = driver.findElement(By.xpath("//a[contains(text(),'Books')]")).getText();
        String expectingText4 = "Books";
        Assert.assertEquals("Should print Books: " , actualText4,expectingText4);
        /*
        6. userShouldNavigateToJewelryPageSuccessfully
            * click on the ‘Jewelry’ Tab
            * Verify the text ‘Jewelry’
         */
        driver.findElement(By.linkText("Jewelry")).click();

        String actualText5 = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[6]/a[1]")).getText();
        String expectingText5 = "Jewelry";
        Assert.assertEquals("Should print Jewelary: ",actualText5,expectingText5);
        /*
        7. userShouldNavigateToGiftCardsPageSuccessfull
            * click on the ‘Gift Cards’ Tab
            * Verify the text ‘Gift Cards’
         */
        driver.findElement(By.linkText("Gift Cards")).click();

        String actualText6 = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[7]/a[1]")).getText();
        String expectingText6 = "Gift Cards";
        Assert.assertEquals("Should print Gift Cards: ", actualText6,expectingText6);


    }
    @After
    public void tearDown(){
        // closeBrowser();
    }


}
