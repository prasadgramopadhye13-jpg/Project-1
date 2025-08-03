package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class StepDefinition2 {

	WebDriver driver=Hooks.driver;
	@Given("user is to be on login page")
	public void user_is_to_be_on_login_page() {
		driver.findElement(By.className("ico-login")).click();
	    	}

	@Then("user enters valid username as {string} and valid password as {string}")
	public void user_enters_valid_username_as_and_valid_password_as(String un, String pass) {
	    driver.findElement(By.id("Email")).sendKeys(un);
	    driver.findElement(By.id("Password")).sendKeys(pass);
	}

	@Then("clicks on loginn button")
	public void clicks_on_loginn_button() throws Exception {
	    driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
	    Thread.sleep(2000);
	}

	@Then("navigating to home page")
	public void navigating_to_home_page() {
	    boolean user=driver.findElement(By.className("account")).isDisplayed();
	    if(user) {
	    	System.out.println("In home page");
	    }else {
	    	System.out.println("Invalid credentials");
	    }
	}

	@Then("clicking on logout button")
	public void clicking_on_logout_button() {
	   driver.findElement(By.linkText("Log out")).click();
	   System.out.println("Logged out successfully");
	}



}
