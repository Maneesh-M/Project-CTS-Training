package com.TestRunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\main\\resources\\Featurefolder\\project.feature",
		plugin = {"pretty", "html:reports/cucumber-html-reports","json:reports/cucumber-html-report/jsonreport","com.cucumber.listener.ExtentCucumberFormatter:reports/Extentreports/Extentreport.html"},
		tags = {"@TC01_Selectingitem,@TC02_Shownumber,@TC03_Sorting,@TC04_Storetoexcelsheet,@TC05_Storetowishlist"},
		glue = {"com.StepDefinition"},
		monochrome = true
		)
public class Opencart_Runner {  

	@AfterClass
	  public static void extendReport() 
	{
	      Reporter.loadXMLConfig("C:\\Users\\maneesh\\git\\Project-CTS-Training\\844888_Opencart\\src\\test\\resources\\extent-config.xml");
	      Reporter.setSystemInfo("user", System.getProperty("user.name"));
	      Reporter.setSystemInfo("os", "Windows");
	      Reporter.setTestRunnerOutput("Sample test runner output message");
	}
}
