package com.Pages;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import baseClass.Wrapper;

public class ShowCount extends Wrapper {
//Defining web elements
	By desktop=By.xpath("(//a[@class='dropdown-toggle'])[2]");
	By all=By.xpath("//a[@class='see-all']");
	By count=By.xpath("//*[@id=\"input-limit\"]");

//To launch the application
	public void launchApplication() throws IOException, InterruptedException{ 
	//To launch chrome browser
	launchBrowser("chrome");
	//To make delay
	Thread.sleep(2000);
	}
	
//To load web page
	public void url(){
		//To go to the site 
		driver.get("http://opencart.abstracta.us/");
		//To get the title of the page
		System.out.println(driver.getTitle());
	}
	
//Select desktop tab
	public void selectdesktop(){
		//Clicking desktop
		driver.findElement(desktop).click();
		//Clicking see all desktop
		driver.findElement(all).click();
	}
	
//To select the Quantity
	public void showcount(){
		WebElement we=driver.findElement(count);
		we.click();
		//Actions class for keyboard and mouse actions
		Actions act=new Actions(driver);
		//To move the selection
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		//For selecting a current element
		act.sendKeys(Keys.ENTER).build().perform();
	}
	
//Taking screenshot
	public void screenshot(String path) throws IOException {
		//Creating object for screenshot class
		TakesScreenshot ts= (TakesScreenshot)driver;
		//Declaring file name and output file type
		File sr=ts.getScreenshotAs(OutputType.FILE);
		//Copying the file to a new file
		FileUtils.copyFile(sr, new File(path));
	}
	
//Close the browser
	public void closebrowser() {
		driver.close();
	}

}
