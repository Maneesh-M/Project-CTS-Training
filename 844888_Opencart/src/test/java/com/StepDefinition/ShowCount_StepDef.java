package com.StepDefinition;

import com.Pages.ShowCount;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ShowCount_StepDef {
	//Creating object for the page class
	ShowCount sc=new ShowCount();

	@Given("^the user launched the chromebrowser$")
	public void the_user_launched_the_chromebrowser() throws Throwable {
		// Launching the application
		sc.launchApplication();
	}

	@When("^the user opens the Opencart application$")
	public void the_user_opens_the_Opencart_application() throws Throwable {
		// Loading home page
		sc.url();
	}

	@Then("^the user select desktop icon$")
	public void the_user_select_desktop_icon() throws Throwable {
		// Selecting desktop tab
		sc.selectdesktop();
	}

	@Then("^the user selects the number$")
	public void the_user_selects_the_number() throws Throwable {
		// To select Quantity and take screenshot
		sc.showcount();
		//To give a delay of 3s
		Thread.sleep(3000);
		//To take screenshot
		sc.screenshot("src\\test\\resources\\Screenshot\\shot2.png");
		//To give a delay of 2s
		Thread.sleep(2000);
		//To close the browser
		sc.closebrowser();
	}
}
