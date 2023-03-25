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

public class StepMethods
 {
	
	WebDriver driver;
	LoginPage lp;
	 @Given("User Launch Crome Browser")
	 public void u_rl_is_given_for_the_login()
	 {
	     System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers/chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     lp=new LoginPage(driver);
	     
	     //throw new io.cucumber.java.PendingException();
	 }

	  @When("User open the given URL {string}")
	 public void user_open_the_given_url(String url)
	 {
	     
		 driver.get(url);
	   //  throw new PendingException();
	 }

	@When("User enter the username as {string} and password as {string}")
	 public void user_enter_the_username_as_and_password_as(String email, String password) 
	 {
	   
		 lp.setUsername(email);
		 lp.setPassword(password);
	     //throw new io.cucumber.java.PendingException();
	 }

	 @When("Click on Log In button")
	 public void click_on_log_in_button() 
	 {
	     
		 lp.clickLogin();
	    // throw new io.cucumber.java.PendingException();
	 }

	 @Then("User moves to the home page and page title should be {string}")
	 public void user_moves_to_the_home_page_and_page_title_should_be(String abc) 
	 {
	     
		 if(driver.getPageSource().contains("Login was unsuccessful"))	 
		 {
			 driver.close();
		 	 Assert.assertTrue(false);
		 }
	 
		 else
		 {
			Assert.assertEquals(abc,driver.getTitle()); //Title=Dashboard / nopCommerce administration
		 }
	    //throw new io.cucumber.java.PendingException();
 }

	 @When("user click on Logout button")
	 public void user_click_on_logout_button() 
	 {
	   
		 lp.clickLogout();
	     //throw new io.cucumber.java.PendingException();
	 }

	 @Then("Page Title should be {string}")
	 public void page_title_should_be(String logouttitle) 
	 {
	    
		 if(driver.getPageSource().contains("Your store. Login"))
		 {
		 driver.close();
		 Assert.assertTrue(false);
		 }
		
		 else
		 {
			Assert.assertEquals(logouttitle,driver.getTitle()); 
		 }
	     //throw new io.cucumber.java.PendingException();
	 }

	 @And("Close the browser")
	 public void close_the_browser()
	 {
	     driver.quit();
	     //throw new io.cucumber.java.PendingException();
	 }
 }