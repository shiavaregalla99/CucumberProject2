package com.xyz.hrms.Steps;

import java.util.List;
import java.util.Map;

import org.testng.Assert;

import com.xyz.hrms.Base.BaseClass;
import com.xyz.hrms.utils.CommonMethods;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends CommonMethods{
	
	
	@Given("User navigates to the login page")
	public void user_navigates_to_the_login_page() {
		
		
	}

	@When("User enters the valid username and valid password")
	public void user_enters_the_valid_username_and_valid_password() {
		CommonMethods.sendText(loginpage.username,"admin");
		CommonMethods.sendText(loginpage.password,"admin123");
		
		
	}

	@When("User click on the login button")
	public void user_click_on_the_login_button() {
		loginpage.loginbutton.click();
		
	}

	@Then("User Successfully login into the application")
	public void user_Successfully_login_into_the_application() {
		String actualTitle=BaseClass.driver.getTitle();
		String expectedTitle="OrangeHRM";
		Assert.assertEquals(actualTitle, expectedTitle,"title did not matched");
	
	}

	

	@When("User enters the invalid username and valid password")
	public void user_enters_the_invalid_username_and_valid_password() {
	    
	}



	@Then("User unable login into the application")
	public void user_unable_login_into_the_application() {
	   
	}
	
	@When("User enters {string} and {string}")
	public void user_enters_and(String username, String password) {
		loginpage.username.sendKeys(username);
		loginpage.password.sendKeys(password);
	}

	@Then("User See the {string}")
	public void user_See_the(String errormessage) {
		String actualErrorMessage=loginpage.errorMessage.getText();
		Assert.assertEquals(actualErrorMessage, errormessage,"error message did not matched");
	}

	@When("User enters invalid Usernmae and invalid password and see error message")
	public void user_enters_invalid_Usernmae_and_invalid_password_and_see_error_message(DataTable testData) {
	 List<Map<String,String>> list=     testData.asMaps();
	for(Map<String,String> map:list) {
		loginpage.username.sendKeys(map.get("Username"));
		loginpage.password.sendKeys(map.get("Password"));
		loginpage.loginbutton.click();
		String actualErrorMessage=loginpage.errorMessage.getText();
		Assert.assertEquals(actualErrorMessage, map.get("ErrorMessage"),"error message did not matched");
	}
	
	}




}
