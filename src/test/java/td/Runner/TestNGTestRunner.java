package td.Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;

import io.cucumber.testng.CucumberOptions;


@CucumberOptions
(
	features = "C:\\Users\\harih\\eclipse-workspace\\TDCucumberFramework\\src\\test\\java\\td\\Features",
	glue={"td.StepDefinitions"},
	plugin = {"pretty","html:target/cucumber-reports/cucumber-pretty.html"},
	//tags=("@smoketag or @regressiontag"),
    //tags=("@smoketag and @regressiontag"),
			tags="@tag",
	monochrome = true,
	dryRun = false
)



public class TestNGTestRunner extends AbstractTestNGCucumberTests {

}
