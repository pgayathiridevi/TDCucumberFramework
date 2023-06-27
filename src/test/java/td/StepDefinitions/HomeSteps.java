package td.StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HomeSteps {
	public WebDriver driver;
	
	@Given("^User is on Home Page$")
	public void user_on_homepage() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.tdinsurance.com/");
		driver.manage().window().maximize();
	}
	
	@When("^User enters text in Search box$")
	public void user_enters_text_in_search_box() {
		driver.findElement(By.xpath("//input[@name='question']")).sendKeys("auto insurance policy");
		
	}
	
	@When("^User enters the text (.+) in Search$")
	public void user_enters_text_in_search(String searchtxt) {
		driver.findElement(By.xpath("//input[@name='question']")).sendKeys(searchtxt);
		
	}
	
	@Then("^User closes the adchoices$")
	public void user_closes_the_adchoices() {
		driver.findElement(By.id("ensCall")).click();
	}
	@And("^User clicks on search button$")
	public void user_clicks_on_search_button() {
	  driver.findElement(By.xpath("//button[contains(text(),'Ask Us')]")).click();
	      
	}
	
	@And("^User waits for some time$")
	public void user_waits_for_some_time() {
		
	   try {
		   Thread.sleep(5000);
	   }
	   catch(Exception e) {
		   e.printStackTrace();
	   }
		
	}
	
	@Then("^User closes the browser$")
	public void user_closes_the_browser() {
	   driver.quit();
	}
	
	

}
