package com.StepDefinition;

import com.Pages.SelectingItem;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SelectingItemSD {

	SelectingItem s= new SelectingItem();

	@Given("^the user launched the chrome browser$")
	public void the_user_launched_the_chrome_browser() throws Throwable {
		//To launch the browser
		s.url();

	}

	@When("^the user opens the Opencart homepage and login$")
	public void the_user_opens_the_Opencart_homepage_and_login() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		s.Homepage();
	}

	@Then("^the user select desktop$")
	public void the_user_select_desktop() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		s.selectdesktop();
	}

	@Then("^the user select on the item$")
	public void the_user_select_on_the_item() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		s.pdct();
		Thread.sleep(3000);
		s.screenshot("src\\test\\resources\\Screenshot\\shot1.png");
		Thread.sleep(3000);
		s.closebrowser();
	}
}