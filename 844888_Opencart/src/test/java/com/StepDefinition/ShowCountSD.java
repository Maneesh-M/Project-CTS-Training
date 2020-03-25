package com.StepDefinition;

import com.Pages.ShowCount;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ShowCountSD {
	ShowCount sc=new ShowCount();

	@Given("^the user launched the chromebrowser$")
	public void the_user_launched_the_chromebrowser() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		sc.url();
	}

	@When("^the user opens the Opencart application$")
	public void the_user_opens_the_Opencart_application() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		sc.Homepage();
	}

	@Then("^the user select desktop icon$")
	public void the_user_select_desktop_icon() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		sc.selectdesktop();
	}

	@Then("^the user selects the number$")
	public void the_user_selects_the_number() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		sc.showcount();
		Thread.sleep(3000);
		sc.screenshot("src\\test\\resources\\Screenshot\\shot2.png");
		Thread.sleep(2000);
		sc.closebrowser();
	}
}
