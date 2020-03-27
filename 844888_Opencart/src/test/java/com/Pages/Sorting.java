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

public class Sorting extends Wrapper {

//Defining web elements
	By desktop=By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[1]/a");
	By all=By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[1]/div/a");
	By sort=By.xpath("//*[@id=\"input-sort\"]");

//Launching the application
	public void launchApplication() throws IOException, InterruptedException { 
		//Launch chrome browser
		launchBrowser("chrome");
		Thread.sleep(2000);
	}

//Load web page
	public void url() {
		//To go to the site
		driver.get("http://opencart.abstracta.us/");
		//To get the title of the page
		System.out.println(driver.getTitle());
	}

//To select desktop tab
	public void selectdesktop(){
		//Click desktop
		driver.findElement(desktop).click();
		//Click show all desktop 
		driver.findElement(all).click();
	}

//Sorting the products
	public void sortingproduct(){
		//Identifying web element
		WebElement we=driver.findElement(sort);
		//Clicking web element
		we.click();
		//Actions class for keyboard and mouse actions
		Actions act=new Actions(driver);
		//Clicking down arrow key
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		//Clicking down arrow key
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		//Clicking down arrow key
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		//Clicking on current element
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

//Close browser
	public void closebrowser() {
		//to close the browser
		driver.close();
	}

}
