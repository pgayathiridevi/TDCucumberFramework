package td.TestComponents;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import td.PageObjects.HomePage;


public class BaseTest {
	public WebDriver driver;
	HomePage homepage;
	public WebDriver initializeDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}
	
	
	public void launchWebApp() {
		driver = initializeDriver();
		homepage = new HomePage(driver);
	}
	
	public void closeBrowser() {
		driver.close();
	}
	public void testingWait()
	{
		 try {
			   Thread.sleep(5000);
		   }
		   catch(Exception e) {
			   e.printStackTrace();
		   }
	}

}
