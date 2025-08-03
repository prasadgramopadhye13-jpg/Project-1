package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Hooks {

	public static WebDriver driver;
	
	@Before
	public void LaunchBrowser() {
		System.out.println("In Before hook...");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		
	}
	
	@After
	public void CloseBrowser() {
		driver.quit();
		System.out.println("Browser closed");
	}
	
	@BeforeStep
	public void BeforeStep() {
		System.out.println("In before step");
	}
	
	@AfterStep
	public void AfterStep() {
		System.out.println("In after step");
	}
}
