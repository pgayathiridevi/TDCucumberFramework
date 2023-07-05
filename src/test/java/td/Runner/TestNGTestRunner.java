package td.Runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;

import io.cucumber.testng.CucumberOptions;


@CucumberOptions
(
	//features = "C:\\Users\\harih\\eclipse-workspace\\TDCucumberFramework\\src\\test\\java\\td\\Features\\",
	
	features = "src/test/java/td/Features",
	glue={"td.StepDefinitions"},
	
	//plugin = {"pretty","html:target/cucumber-reports/cucumber-pretty.html"},
			//plugin = {"json:target/cucumber.json"},
			 plugin = {
                     "pretty",
                     "json:target/cucumber-report/cucumber.json",
                     "html:target/cucumber-report/cucumber.html",
                     "rerun:target/failedRerun.txt"},
	//tags=("@smoketag or @regressiontag"),
    //tags=("@smoketag and @regressiontag"),
			//tags="@car",
			
	monochrome = true,
	dryRun = false
)



public class TestNGTestRunner extends AbstractTestNGCucumberTests {
	@DataProvider(parallel=true)
	public Object[][] scenarions(){
		return super.scenarios();
		
	}

}
