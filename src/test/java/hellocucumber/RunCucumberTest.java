package hellocucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features = "src/test/resources/hellocucumber/features",
        monochrome = true,
        tags = "@TestScenarioV1",
        glue={"steps"})
public class RunCucumberTest extends AbstractTestNGCucumberTests{
}
