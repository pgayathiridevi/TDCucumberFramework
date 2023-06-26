package td.Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions
(
	features = "C:\\Users\\harih\\eclipse-workspace\\TDCucumberFramework\\src\\main\\java\\td\\Features\\tdhome.feature",
	glue={"td.StepDefinitions"},
	plugin = {"pretty","html:target/HTMLReports.html"},
	monochrome = true
)



public class TestNGTestRunner extends AbstractTestNGCucumberTests {

}
