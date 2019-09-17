package com.steps;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.common.Base;
import com.pages.Pages;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef extends Base {
	Pages PF;
	
	
	@Given("^usar is going to home page$")
	public void usar_is_going_to_home_page() {
		getdriver();
		PF=PageFactory.initElements(Driver, Pages.class);
	  
	   
	}

	@When("^click on signing button$")
	public void click_on_signing_button() {
		PF.getsignin().click();
	  
	   
	}

	@When("^enter user name$")
	public void enter_user_name() {
		PF.getEmail().sendKeys("iftikhermz4@gmail.com");
	  
	   
	}

	@When("^enter password$")
	public void enter_password() {
	 PF.getpassword().sendKeys("i1089ahmed"); 
	   
	}

	@When("^click on submit button$")
	public void click_on_submit_button() {
	 PF.getsubmit().click(); 
	   
	}

	@Then("^login should be succseful$")
	public void login_should_be_succseful() {
	 Assert.assertEquals(Driver.getTitle(),"Walmart.com | Save Money. Live Better." ); 
	   
	}


}
