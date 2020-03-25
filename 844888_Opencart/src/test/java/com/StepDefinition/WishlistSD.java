package com.StepDefinition;

import com.Pages.Wishlist;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WishlistSD {
	Wishlist wl=new Wishlist();

	@Given("^the user launched the chrome webbrowser$")
	public void the_user_launched_the_chrome_webbrowser() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		wl.url();
	}

	@When("^the user opens the OpenCart page$")
	public void the_user_opens_the_OpenCart_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		wl.Homepage();
	}

	@Then("^the user select desktop buttonclick$")
	public void the_user_select_desktop_buttonclick() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		wl.selectdesktop();
	}

	@Then("^the item to wishlist$")
	public void the_item_to_wishlist() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		wl.wishlist();
		Thread.sleep(3000);
		wl.screenshot("src\\test\\resources\\Screenshot\\shot5.png");
		Thread.sleep(3000);
		wl.closebrowser();
	}
}
