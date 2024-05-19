package computer;

import browserfactory.BaseTest;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestSuite extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setupTest() {
        openBrowser(baseUrl);
    }

    @Test
   /* 1.Test name verifyProductArrangeInAlphaBaticalOrder()
            1.1 Click on Computer Menu.
            1.2 Click on Desktop
            1.3 Select Sort By position "Name: Z to A"
            1.4 Verify the Product will arrange in Descending order.*/
    public void verifyProductArrangeInAlphaBaticalOrder(){

        WebElement clickOnComputer = driver.findElement(By.xpath("//a[text()='Computers ']"));
        clickOnComputer.click();

        WebElement clickOnDesktop = driver.findElement(By.xpath("//div[@class='sub-category-item']/h2/a"));
        clickOnDesktop.click();

        WebElement sortBy = driver.findElement()





    }
}
