package td.StepDefinitions;

import io.cucumber.java.en.*;

public class CarQuoteSteps {
	
	@Given("open a web browser")
	public void open_a_web_browser() {
	    System.out.println("opened");
	}

	@And("get the title")
	public void get_the_title() {
		System.out.println("get the title");
	}

	@Then("close the browser")
	public void close_the_browser() {
		System.out.println("close_the_browser");
	}


}
