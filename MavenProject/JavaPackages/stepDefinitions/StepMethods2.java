package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.LoginPage;

public class StepMethods2
 {
	
	@Given("^User is on login page$")
	public void user_is_on_login_page() throws Throwable {
	    System.out.println(" In Given annotation");
	    throw new PendingException();
	}

	@When("^User enters the username and password$")
	public void user_enters_the_username_and_password() throws Throwable {
	    System.out.println(" In When annotation");
	    throw new PendingException();
	}

	@When("^User clicks on Login button$")
	public void user_clicks_on_Login_button() throws Throwable {
	    System.out.println(" In And annotation");
	    throw new PendingException();
	}

	@Then("^User is on Dashboard page$")
	public void user_is_on_Dashboard_page() throws Throwable {
	    System.out.println(" In Then annotation");
	    throw new PendingException();
	}
 }