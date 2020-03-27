package com.StepDefinition;

import com.Pages.Wishlist;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Wishlist_StepDef {
	//Creating object for the page class
	Wishlist wl=new Wishlist();

	@Given("^the user launched the chrome webbrowser$")
	public void the_user_launched_the_chrome_webbrowser() throws Throwable {
		// Launching the application
		wl.launchApplication();
	}

	@When("^the user opens the OpenCart page$")
	public void the_user_opens_the_OpenCart_page() throws Throwable {
		// Loading home page
		wl.url();
	}

	@Then("^the user select desktop buttonclick$")
	public void the_user_select_desktop_buttonclick() throws Throwable {
		//Login user
		wl.loginuser();
		Thread.sleep(2000);
		//Clicking desktop tab
		wl.selectdesktop();
	}

	@Then("^the item to wishlist$")
	public void the_item_to_wishlist() throws Throwable {
		// Adding to Wishlist
		wl.wishlist();
		Thread.sleep(3000);
		//Taking screenshot
		wl.screenshot("src\\test\\resources\\Screenshot\\shot5.png");
		Thread.sleep(3000);
		//Closing the browser
		wl.closebrowser();
	}
}
