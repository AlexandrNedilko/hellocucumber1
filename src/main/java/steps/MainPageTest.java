package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.testng.Assert;
import pages.MainPage;
import util.EnumDriverFactory;

import java.util.concurrent.TimeUnit;

public class MainPageTest extends BaseTest {
    private MainPage mainPage;

    @Given("^open browser$")    /* @BeforeTest*/
    public void setup(){

        System.setProperty("webdriver.chrome.driver", config.getProperty("chromedriver"));

        driver = EnumDriverFactory.CHROME.create();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(config.getProperty("baseurl"));
    }

    @And("^close the browser$")
    public void cleanup() {
        driver.manage().deleteAllCookies();
          try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.close();
    }

    @Given("^open main page$")
    public void setupMainPage(){
        mainPage = new MainPage(driver);
    }

    @And("^go to myFirstPattern$")
    public void myFirstPattern(String good) {
        mainPage.enterSomeBody_andClick(good);
        Assert.assertEquals("1", "1");
        mainPage.addCartClick(); //Add to cart
        mainPage.proceedtoCheckoutClick(); //Proceed to checkout
        mainPage.plusClick(); //click Plus
    }

    @And("^go to myTestDataProvider with name: \"([^\"]*)\"$")
    public void myTestDataProvider(String good) {
        mainPage.enterSomeBody(good);
        mainPage.clear();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @And("^go to _4Test$")
    public void _4Test(){
        System.out.println("_4Test");
        Assert.assertEquals(7,7);
    }
    @And("^go to _5Test$")
    public void _5Test(){
        System.out.println("_5Test");
        Assert.assertEquals(5,5);
    }
}
