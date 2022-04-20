package com.basic.backgroundSD;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import com.Student;

public class background {
	
	Student stu;
			
	@Given("^User need to be on facebook login page$")
	public void User_need_to_be_on_facebook_login_page() {
		stu = new Student();
	}

	@When("^User enters user \"([^\"]*)\" first name$")
	public void User_enters_user_first_name(String userName ) {
		stu.setName(userName);
			
	}
	
	
	@Then("^User checks user \"([^\"]*)\" first name is present$")
	public void User_checks_user_first_name_is_present(String lastName) {
		Assert.assertEquals(lastName, stu.getName());
	
	}
	
	@And("^User enters user \"([^\"]*)\" surname$")
	public void User_enters_user_surname(String lastName)
	{
		stu.setlastName(lastName);
	}
	
	@Then("^User checks user \"([^\"]*)\" last name is present$")
	public void User_checks_user_last_name_is_present(String lastName)
	{
		Assert.assertEquals(lastName, stu.getlastName());
	}
	
}
