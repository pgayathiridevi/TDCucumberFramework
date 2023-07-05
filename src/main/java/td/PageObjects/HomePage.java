package td.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import td.AbstractComponents.AbstractComponent;

public class HomePage extends AbstractComponent {
	
	public HomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//input[@name='question']")
	WebElement searchBox;
	
	@FindBy(id="ensCall")
	WebElement adChoices;
	
	@FindBy(xpath="//button[contains(text(),'Ask Us')]")
	WebElement searchButton;
	
	
	public void enterSearchText(String text) {
		searchBox.sendKeys(text);
	}
	public void clickSearchButton() {
		clickbtn(searchButton);
	}
	public void closeAdChoices() {
		clickbtn(adChoices);
	}
	public void GoTo() {
		routeToUrl("https://www.tdinsurance.com/");
	}
	public void closetheBrowser() {
		closeBrowser();
	}
}
