package com.qait.Actions;

import org.openqa.selenium.WebDriver;

import utils.GetPage;

public class logInPage extends GetPage {

	public logInPage(WebDriver driver) {
		super(driver, "moviePage");
	}

	public void clickOnSigninButton() {
		element("signin_btn").click();
	}

	public void selectOptionOfSignin() {
		element("signin_option").click();
	}

	public void enterValidCredential(String username, String password) {
		element("email").sendKeys(username);
		element("password").sendKeys(password);

	}

	public String loginSuccessful() {
		element("submit").click();
		String name = element("name_verify").getText();
		return name;
	}

}
