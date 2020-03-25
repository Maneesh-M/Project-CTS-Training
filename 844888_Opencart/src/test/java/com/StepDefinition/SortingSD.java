package com.StepDefinition;

import com.Pages.Sorting;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SortingSD {
	Sorting sg=new Sorting();

	@Given("^the user launched the chrome$")
	public void the_user_launched_the_chrome() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		sg.url();
	}

	@When("^the user opens the Opencart page$")
	public void the_user_opens_the_Opencart_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		sg.Homepage();
	}

	@Then("^the user select desktop iccon$")
	public void the_user_select_desktop_iccon() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		sg.selectdesktop();
	}

	@Then("^the user selects the type of sorting$")
	public void the_user_selects_the_type_of_sorting() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		sg.sortingproduct();
		Thread.sleep(3000);
		sg.screenshot("src\\test\\resources\\Screenshot\\shot3.png");
		Thread.sleep(2000);
		sg.closebrowser();
	}
}
