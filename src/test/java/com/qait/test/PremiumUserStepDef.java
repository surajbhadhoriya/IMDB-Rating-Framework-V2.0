package com.qait.test;

import java.net.MalformedURLException;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.TestSessionInitiator;

public class PremiumUserStepDef extends TestSessionInitiator {

	public PremiumUserStepDef() throws MalformedURLException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Given("^click on ImdbPro version$")
	public void click_on_imdb_pro_version() {
		// Write code here that turns the phrase above into concrete actions
		LoginPRO.clickOnProVersion();
	}

	@And("^select appropirate option for login$")
	public void select_appropirate_option_for_login() {
		// Write code here that turns the phrase above into concrete actions
		LoginPRO.getLogInOption();
	}

	@When("^enter username (.*) and password (.*) and hit on login button$")
	public void enter_username_user_name_and_password_suraj_and_hit_on_login_button(String username, String password) {
		// Write code here that turns the phrase above into concrete actions
		LoginPRO.enterEmail(username);
		LoginPRO.enterPassword(password);
		LoginPRO.clickOnLoginBtn();
	}

	@And("^get in movie (.*) name which user want to search$")
	public void enter_movie_name_which_user_want_to_search(String movieName) {
		SearchPages.clickOnButton();
		SearchPages.selectTitle();
		SearchPages.enterMovieName(movieName);

	}

	@When("^select particular option from suggestions$")
	public void select_particular_option_from_suggestions() {
		// Write code here that turns the phrase above into concrete actions
		SearchPages.clickOnSuggestion();
	}

	@And("^click on cast and crew link of movie$")
	public void click_on_cast_and_crew_of_movie() {
		DetailsPages.getCastAndCrew();
	}

	@Then("^click on plot summary of movie$")
	public void click_on_plot_summary_of_movie() {
		// Write code here that turns the phrase above into concrete actions
		DetailsPages.getPlotSummary();

	}

}
