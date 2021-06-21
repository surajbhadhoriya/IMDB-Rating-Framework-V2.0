package com.qait.test;

import java.net.MalformedURLException;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.TestSessionInitiator;

public class MovieSearchStepDef extends TestSessionInitiator {

	public MovieSearchStepDef() throws MalformedURLException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Given("^enter movie (.*) name which user want to search$")
	public void enter_movie_name_which_user_want_to_search(String movieName) {
		// Write code here that turns the phrase above into concrete actions

		SearchPages.clickOnButton();
		SearchPages.selectTitle();
		SearchPages.enterMovieName(movieName);

	}

	@When("^click on Enter button$")
	public void click_on_enter_button() {
		// Write code here that turns the phrase above into concrete actions
		SearchPages.hitOnEnter();
	}

	@Then("^verify movie option available in suggesstion$")
	public void verify_movie_option_available_in_suggesstion() {
		// Write code here that turns the phrase above into concrete actions
		String movieName = DetailsPages.verifySuggesstionOption();
		Assert.assertEquals("Ludo", movieName);

	}

}
