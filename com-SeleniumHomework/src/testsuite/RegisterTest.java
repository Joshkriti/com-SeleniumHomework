package testsuite;

import browserfactory.BaseTest;
import org.junit.Before;
import org.junit.Test;

public class RegisterTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";
    @Before
    public void setupTest(){
        openBrowser(baseUrl);
    }

    @Test
    public void register(){

    }




    public void tearDown(){
        // closeBrowser();
    }
}
