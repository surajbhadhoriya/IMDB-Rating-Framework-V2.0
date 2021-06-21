package com.qait.test;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

import utils.TestSessionInitiator;

public class basicTest extends TestSessionInitiator {

	public basicTest() throws MalformedURLException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test(priority = 1)
	public void selectTitleOption() {
		waitForsync(8000);
		SearchPages.clickOnButton();
		SearchPages.selectTitle();
	}

	@Test(priority = 2)
	public void searchMovieByName() {
		SearchPages.enterMovieName("Radhe");
		waitForsync(8000);
		SearchPages.clickOnSuggestion();
	}

	@Test(priority = 3)
	public void getCastOfMovie() {
		DetailsPages.getCastAndCrew();

	}

	@Test(priority = 4)
	public void getMoviePlot() {
		DetailsPages.getPlotSummary();
	}

}
