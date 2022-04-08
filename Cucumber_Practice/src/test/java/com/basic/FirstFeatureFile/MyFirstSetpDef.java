package com.basic.FirstFeatureFile;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

class Student {
	String name;
	
	public String getName() {
		return name;
	}
}

public class MyFirstSetpDef {
	
	Student stu;
			
	@Given("^User need to be on facebook login page$")
	public void User_need_to_be_on_facebook_login_page() {
		stu = new Student();
	}

	@When("^User enters user first name$")
	public void User_enters_user_first_name() {
		stu.name = "Salin";
			
	}
	
	
	@Then("^User checks user first name is present$")
	public void User_checks_user_first_name_is_present() {
		Assert.assertEquals("Salin", stu.getName());
	
	}
}
