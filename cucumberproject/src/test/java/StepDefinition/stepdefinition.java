package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepdefinition {

	WebDriver driver;
	@Given("user is on login page")
	public void user_is_on_login_page() {
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demowebshop.tricentis.com/login");
	    System.out.println("Browser launched");
	    
	}

	@When("user enters valid username and valid password")
	public void user_enters_valid_username_and_valid_password() throws Exception {
		driver.findElement(By.id("Email")).sendKeys("reqs12@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("abcdef");
		Thread.sleep(2000);
	    
	   
	}

	@Then("click on login button")
	public void click_on_login_button() {
		driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
		
	    
	   
	}

	@Then("navigates to home page")
	public void navigates_to_home_page() {
		WebElement user=driver.findElement(By.className("account"));
		if(user.isDisplayed()) {
			System.out.println("You are navigated to homepage");
		}else {
			System.out.println("Check ypor credentials");
		}
	   
	    
	}
	@Then("clicks on logout button")
	public void clicks_on_logout_button() {
	   driver.findElement(By.linkText("Log out")).click();
	}





}
