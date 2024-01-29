package CucumberScenarioDemo2;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CucumberStepDef1 
{
	// Given User able to open the Browser
	@Given("^User able to open the Browser$")
	public void User_able_to_open_the_Browser() throws Throwable 
	{
	   System.out.println("User able to open the browser");
	}
	//And User able to enter the url
	@And("^User able to enter the url$")
	public void User_able_to_enter_the_url() throws Throwable
	{
		 System.out.println("User able to enter the url");
	}
	//When User able enter the username
	@When("^User able enter the userName$")
	public void User_able_enter_the_userName() throws Throwable 
	{
		 System.out.println("User able enter the username");
	}
	//And user able to enter the Password
	@When("^user able to enter the password$")
	public void user_able_to_enter_the_password() throws Throwable 
	{
		 System.out.println("user able to enter the Password");
	}
	//And user able to click on the submit button

	@When("^user able to click on the Submit button$")
	public void user_able_to_click_on_the_Submit_button() throws Throwable 
	{
		 System.out.println("user able to click on the submit button");
	}
	
	@Then("^verify the login sucessfull$")
	public void verify_the_login_sucessfull() throws Throwable 
	{
		 System.out.println("verify the login sucessfull");
	}
	//Then verify the login sucessfull
	
	@And("^verify the home screen$")
	public void verify_the_home_screen() throws Throwable 
	{
		 System.out.println("verify the home screen");
	}

}