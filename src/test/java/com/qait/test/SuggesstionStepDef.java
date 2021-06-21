package com.qait.test;

import java.net.MalformedURLException;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.TestSessionInitiator;

public class SuggesstionStepDef extends TestSessionInitiator {

	public SuggesstionStepDef() throws MalformedURLException {
		super();
		// TODO Auto-generated constructor stubs
	}

	@Given("^enter movie name (.*) on search bar$")
	public void enter_movie_name_on_search_bar(String movieName) {

		SearchPages.clickOnButton();
		SearchPages.selectTitle();
		SearchPages.enterMovieName(movieName);

	}

	@When("^hit on enter button$")
	public void hit_on_enter_button() {

		SearchPages.hitOnEnter();
	}

	@And("^click on appropirate option in suggestion$")
	public void click_on_appropirate_option_in_suggestion() {
		SearchPages.clickOnSuggestion();
	}

	@Then("^verify click on correct option$")
	public void verify_click_on_correct_option() {
		String name = DetailsPages.verifySuggesstion();
		Assert.assertEquals("Inception", name);

	}

}
