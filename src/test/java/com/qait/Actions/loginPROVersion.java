package com.qait.Actions;

import org.openqa.selenium.WebDriver;

import utils.GetPage;

public class loginPROVersion extends GetPage {

	public loginPROVersion(WebDriver driver) {
		super(driver, "moviePage");
		// TODO Auto-generated constructor stub
	}

	public void clickOnProVersion() {
		element("imdbPro").click();
	}

	public void getLogInOption() {
		element("loginOption").click();
	}

	public void enterEmail(String email) {
		element("email").sendKeys(email);
	}

	public void enterPassword(String passwrd) {
		element("password").sendKeys(passwrd);
	}

	public void clickOnLoginBtn() {
		element("submit").click();
	}
}
