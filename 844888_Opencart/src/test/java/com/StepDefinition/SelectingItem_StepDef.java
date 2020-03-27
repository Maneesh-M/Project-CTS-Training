package com.StepDefinition;

import com.Pages.SelectingItem;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SelectingItem_StepDef {
	//Creating object for the page class
	SelectingItem s= new SelectingItem();

	@Given("^the user launched the chrome browser$")
	public void the_user_launched_the_chrome_browser() throws Throwable {
		//To launch the browser
		s.launchApplication();

	}

	@When("^the user opens the Opencart homepage and login$")
	public void the_user_opens_the_Opencart_homepage_and_login() throws Throwable {
		// Loading the homepage
		s.Url();
	}

	@Then("^the user select desktop$")
	public void the_user_select_desktop() throws Throwable {
		//Selecting desktop
		s.selectdesktop();
	}

	@Then("^the user select on the item$")
	public void the_user_select_on_the_item() throws Throwable {
		// Selecting the product
		s.pdct();
		//To give a delay of 3s
		Thread.sleep(3000);
		//To take screenshot
		s.screenshot("src\\test\\resources\\Screenshot\\shot1.png");
		//To give a delay of 3s
		Thread.sleep(3000);
		//To close the browser
		s.closebrowser();
	}
}
