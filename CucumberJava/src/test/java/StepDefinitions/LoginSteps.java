package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	@Given("User is on line page")
	public void user_is_on_line_page() {
	    // Write code here that turns the phrase above into concrete actions
		  System.out.println("User is on line page");
		 
	}  

	@When("user enter username and password")
	public void user_enter_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("user enter username and password");
		   
	}

	@When("Click on login button")
	public void click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("Click on login button");
	  
	}

	@Then("use is navigated to the home page")
	public void use_is_navigated_to_the_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("use is navigated to the home page");
	  
	}
//
//	
//		// TODO Auto-generated method stub
//		
//		
//		@Given("User is on line page")
//		public void user_is_on_line_page() {
//		
//		   
//		}
//
//		@When("user enter username and password")
//		public void user_enter_username_and_password() {
//			
//		}
//
//		@When("Click on login button")
//		public void click_on_login_button() {
//			
//		}
//
//		@Then("use is navigated to the home page")
//		public void use_is_navigated_to_the_home_page() {
//			 System.out.println("use is navigated to the home page");
//		}

	}



