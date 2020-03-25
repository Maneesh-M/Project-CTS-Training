package com.StepDefinition;

import com.Pages.StoretoExcel;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StoretoExcelSD {
	StoretoExcel se=new StoretoExcel();
	@Given("^the user launched the browser$")
	public void the_user_launched_the_browser() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		se.url();
	}

	@When("^the user opens the Opencart webpage$")
	public void the_user_opens_the_Opencart_webpage() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		se.Homepage();
	}

	@Then("^the user select desktop button$")
	public void the_user_select_desktop_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		se.selectdesktop();
	}

	@Then("^the user adds the details of items to excelsheet$")
	public void the_user_adds_the_details_of_items_to_excelsheet() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		se.exceldata();
		Thread.sleep(3000);
		se.closebrowser();
	}
}
