package steps;
import org.openqa.selenium.WebDriver;
import util.Config;
import java.util.Properties;

public class BaseTest {
    public WebDriver driver;
      final Properties config = Config.loadProperties("src/test/resources/test.properties");
   }

