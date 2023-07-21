package testrunners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\sumitsisodia\\Desktop\\WorkSpace-R\\cucumber_assignment1\\src\\main\\java\\feature\\TestCase.feature", // path of the testcase3.feature file
glue="stepdefinition",
//monochrome=true,
dryRun = false,
plugin = {"pretty","json:target/cucumber-reports/Cucumber.json","html:target/cucumber-reports/Cucumber.html","junit:target/cucumber-reports/Cucumber.xml"})



public class Runner {

	
}
