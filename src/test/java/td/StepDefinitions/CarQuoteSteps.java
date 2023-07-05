package td.StepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.*;

public class CarQuoteSteps {
	
	@Given("open a web browser")
	public void open_a_web_browser() {
		Assert.assertEquals("TDClose", "TDBankClosed");
	    System.out.println("opened");
	}

	@And("get the title")
	public void get_the_title() {
		Assert.assertEquals("TD", "TDBank");
		System.out.println("get the title");
	}

	@Then("close the browser")
	public void close_the_browser() {
		Assert.assertEquals("TDClose", "TDBankClosed");
		System.out.println("close_the_browser");
	}


}
