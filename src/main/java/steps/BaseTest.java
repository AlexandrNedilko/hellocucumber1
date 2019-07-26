package steps;


/*import org.testng.annotations.*;*/
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import util.Config;
import util.EnumDriverFactory;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    public WebDriver driver;
      final Properties config = Config.loadProperties("src/test/resources/test.properties");

   /* @Given("^open browser$")    *//* @BeforeTest*//*
    public void setup(){

        System.setProperty("webdriver.chrome.driver", config.getProperty("chromedriver"));

        driver = EnumDriverFactory.CHROME.create();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(config.getProperty("baseurl"));
    }

    @And("^close the browser$")*//*@AfterTest*//*
    public void cleanup() {
        driver.manage().deleteAllCookies();
        //TestHelper.sleep5Seconds();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.close();
    }*/
}

