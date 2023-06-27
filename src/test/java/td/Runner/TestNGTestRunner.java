package td.Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;

import io.cucumber.testng.CucumberOptions;


@CucumberOptions
(
	features = "C:\\Users\\harih\\eclipse-workspace\\TDCucumberFramework\\src\\test\\java\\td\\Features\\tdhome.feature",
	glue={"td.StepDefinitions"},
	plugin = {"pretty","html:target/cucumber-reports.html"},
	//tags=("@smoketag or @regressiontag"),
    tags=("@smoketag and @regressiontag"),
	monochrome = true,
	dryRun = false
)



public class TestNGTestRunner extends AbstractTestNGCucumberTests {

}
