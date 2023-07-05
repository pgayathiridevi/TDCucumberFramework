package td.AbstractComponents;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractComponent {
	public WebDriver driver;

	public AbstractComponent(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickbtn(WebElement element) {
		waitForElement(element);
		clickAction(element);

	}

	public void waitForElement(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void clickAction(WebElement element) {
		element.click();
	}

	public void routeToUrl(String url) {
		driver.get(url);
	}

	public void closeBrowser() {
		driver.close();
	}

}
