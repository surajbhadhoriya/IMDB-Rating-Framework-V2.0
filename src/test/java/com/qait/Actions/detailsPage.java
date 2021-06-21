package com.qait.Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import utils.GetPage;

public class detailsPage extends GetPage {
	public detailsPage(WebDriver driver) {
		super(driver, "moviePage");
	}

	public void getCastAndCrew() {
		element("cast").click();
	}

	public void getPlotSummary() {
		element("showMore").click();

		element("plotSummary").click();
	}

	public void clickOnTriva() {
		element("triva").click();
	}

	public void getParticularCastDeatils(String name) {
		System.out.println(name);
		element("actor").click();
	}

	public String verifySuggesstion() {
		String name;
		name = element("suggestion_verify").getText();
		return name;
	}

	public String verifyCast() {
		String castHeading;
		castHeading = element("cast_verify").getText();
		return castHeading;
	}

	public String verifyPlot() {
		String plot;
		plot = element("plot").getText();
		return plot;
	}

	public String verifySuggesstionOption() {
		String option;
		option = element("suggestion1").getText();
		return option;

	}

	public void clickOnCastAndCrew() {
		element("link").click();
	}

}
