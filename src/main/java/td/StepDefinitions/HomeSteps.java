package td.StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HomeSteps {
	WebDriver driver;
	
	@Given("^User is on Home Page$")
	public void user_on_homepage() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.tdinsurance.com/");
		driver.manage().window().maximize();
	}
	
	@Then("^User enters text in Search box$")
	public void user_enters_text_in_search_box() {
		driver.findElement(By.xpath("//input[@name='question']")).sendKeys("auto insurance policy");
		
	}
	@And("^User clicks on search button$")
	public void user_clicks_on_search_button() {
	  driver.findElement(By.xpath("//button[contains(text(),'Ask Us')]")).click();
	      
	}
	

}
