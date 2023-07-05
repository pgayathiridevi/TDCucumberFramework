package td.Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
	
	plugin = {
         "pretty",
         "rerun:target/failedRerun.txt" 
         },
	glue={"td.StepDefinitions"},
	features = "@target/failedRerun.txt",
	tags="@car",
	monochrome = true,
	dryRun = false
)
public class FailedRun extends AbstractTestNGCucumberTests{
	
}
