package com.qait.test;

import java.net.MalformedURLException;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.TestSessionInitiator;

public class LoginStepDef extends TestSessionInitiator {

	public LoginStepDef() throws MalformedURLException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Given("^user navigate to website and click on signin button$")
	public void user_navigate_to_website_and_click_on_signin_button() {
		LoginPages.clickOnSigninButton();
	}

	@When("^select option for signin with IMDB$")
	public void select_option_for_signin_with_imdb() throws InterruptedException {
		Thread.sleep(5000);
		LoginPages.selectOptionOfSignin();
	}

	@And("^Enter valid credentials (.*) and (.*)$")
	public void enter_valid_credentials_bhadhoriya_gmail_com_and_suraj(String username, String password) {
		LoginPages.enterValidCredential(username, password);
	}

	@Then("^login must be successful$")
	public void login_must_be_successful() {

		String name;
		name = LoginPages.loginSuccessful();
		Assert.assertEquals("Suraj", name);
	}

}
