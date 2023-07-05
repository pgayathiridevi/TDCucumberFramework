package td.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import td.PageObjects.HomePage;
import td.TestComponents.BaseTest;

public class HomePageStepsDefinition extends BaseTest {
	public HomePage homepage;

	@Given("^User is on Home Page$")
	public void user_on_homepage() {
		launchWebApp();
		homepage = new HomePage(driver);
		homepage.GoTo();
	}

	@When("^User enters text in Search box$")
	public void user_enters_text_in_search_box() {
		homepage.enterSearchText("Car Insurance");

	}

	@When("^User enters the text (.+) in Search$")
	public void user_enters_text_in_search(String searchtxt) {
		homepage.enterSearchText(searchtxt);
	}

	@Then("^User closes the adchoices$")
	public void user_closes_the_adchoices() {
		homepage.closeAdChoices();
	}

	@And("^User clicks on search button$")
	public void user_clicks_on_search_button() {
		homepage.clickSearchButton();

	}

	@And("^User waits for some time$")
	public void user_waits_for_some_time() {
		testingWait();

	}

	@Then("^User closes the browser$")
	public void user_closes_the_browser() {
	   homepage.closetheBrowser();
	}

}
