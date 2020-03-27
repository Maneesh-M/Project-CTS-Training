package com.StepDefinition;

import com.Pages.Sorting;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Sorting_StepDef {
	//Creating object for the page class
	Sorting sg=new Sorting();

	@Given("^the user launched the chrome$")
	public void the_user_launched_the_chrome() throws Throwable {
		// Launching the application
		sg.launchApplication();
	}

	@When("^the user opens the Opencart page$")
	public void the_user_opens_the_Opencart_page() throws Throwable {
		//Loading home page
		sg.url();
	}

	@Then("^the user select desktop iccon$")
	public void the_user_select_desktop_iccon() throws Throwable {
		// Selecting desktop tab
		sg.selectdesktop();
	}

	@Then("^the user selects the type of sorting$")
	public void the_user_selects_the_type_of_sorting() throws Throwable {
		// Sorting the product and taking screenshot
		sg.sortingproduct();
		Thread.sleep(3000);
		//To take screenshot
		sg.screenshot("src\\test\\resources\\Screenshot\\shot3.png");
		Thread.sleep(2000);
		//To close the browser
		sg.closebrowser();
	}
}
