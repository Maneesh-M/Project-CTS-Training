package com.TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\main\\resources\\Featurefolder\\project.feature",
		plugin = {"pretty", "html:reports/cucumber-html-reports"},
		tags = {"@TC01_Selectingitem"},
		glue = {"com.StepDefinition"},
		monochrome = true
		)
public class SelectingItemTR {  

}