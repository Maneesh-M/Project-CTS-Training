package com.StepDefinition;

import com.Pages.StoreDetails;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StoreDetails_StepDef {
	//Creating object for the page class
	StoreDetails sd=new StoreDetails();
	
	@Given("^the user launched the browser$")
	public void the_user_launched_the_browser() throws Throwable {
		// Launch the application
		sd.launchApplication();
	}

	@When("^the user opens the Opencart webpage$")
	public void the_user_opens_the_Opencart_webpage() throws Throwable {
		// To load web page
		sd.url();
	}

	@Then("^the user select desktop button$")
	public void the_user_select_desktop_button() throws Throwable {
		// Selecting desktop tab
		sd.selectdesktop();
		//To give a delay of 2s
		Thread.sleep(2000);
		//To take screenshot
		sd.screenshot("src\\test\\resources\\Screenshot\\shot4.png");
	}

	@Then("^the user adds the details of items to excelsheet$")
	public void the_user_adds_the_details_of_items_to_excelsheet() throws Throwable {
		// Writing the data into Excel 
		sd.exceldata();
		//To give a delay of 3s
		Thread.sleep(3000);
		//To close the browser
		sd.closebrowser();
	}
}
