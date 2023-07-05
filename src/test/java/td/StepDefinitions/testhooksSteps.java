package td.StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class testhooksSteps {
	@Before("@smoke")
	public void setup() {
		System.out.println("CUCUMBER SETUP........");
	}
	@After
	public void tearDown() {
		System.out.println("CUCUMBER CLOSED........!!!!!!");
	}
	
	/*
	@Before(order=0)
	public void setup_A() {
		System.out.println("CUCUMBER SETUP........setup_AAAAAA");
	}
	
	@Before(order=1)
	public void setup_B() {
		System.out.println("CUCUMBER SETUP........setup_BBBBB");
	}
	@Before(order=1)
	public void setup_C() {
		System.out.println("CUCUMBER SETUP........setup_CCCCC");
	}
	
	@After(order=0)
	public void tearDown_A() {
		System.out.println("CUCUMBER CLOSED........AAAAAA !!!!!!");
	}
	@After(order=1)
	public void tearDown_B() {
		System.out.println("CUCUMBER CLOSED........BBBBB !!!!!!");
	}
	@After(order=2)
	public void tearDown_C() {
		System.out.println("CUCUMBER CLOSED........CCCCC !!!!!!");
	}
	
	
	@BeforeStep
	public void beforesteps() {
		System.out.println("...............Before Steps Started...............");
	}
	
	@AfterStep
	public void aftersteps() {
		System.out.println("...............After Steps Started...............");	
	}
	*/
	
	@Given("open the browser")
	public void open_the_browser() {
	    System.out.println("@Given open the browser");
	}

	@When("enter the url")
	public void enter_the_url() {
		System.out.println("@Given enter the url");
	}
	
	@Then("close the url")
	public void close_the_url() {
		System.out.println("@Given close the browser");
	}
	
}
