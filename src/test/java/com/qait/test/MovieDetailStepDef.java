package com.qait.test;

import java.net.MalformedURLException;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.TestSessionInitiator;

public class MovieDetailStepDef extends TestSessionInitiator {

	public MovieDetailStepDef() throws MalformedURLException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Given("^enter movie name (.*)  by user$")
	public void enter_movie_name_by_user(String moviename) {

		SearchPages.clickOnButton();
		SearchPages.selectTitle();
		SearchPages.enterMovieName(moviename);

	}

	@When("^pick one option from suggestions$")
	public void pick_one_option_from_suggestions() {
		SearchPages.hitOnEnter();
		SearchPages.clickOnSuggestion();

	}

	@And("^hit on casting link$")
	public void hit_on_casting_link() {
		DetailsPages.clickOnCastAndCrew();
		String castHeading = DetailsPages.verifyCast();
		Assert.assertEquals("Full Cast & Crew", castHeading);

	}

	@Then("^hit on plot summary link$")
	public void hit_on_plot_summary_link() {
		DetailsPages.getPlotSummary();
		String plotHeading;
		plotHeading = DetailsPages.verifyPlot();
		Assert.assertEquals("Plot", plotHeading);

	}

}
