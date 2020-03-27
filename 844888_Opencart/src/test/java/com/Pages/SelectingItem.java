package com.Pages;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import baseClass.Wrapper;

public class SelectingItem extends Wrapper {
//Defining web elements
	By desktop=By.xpath("(//a[@class='dropdown-toggle'])[2]");
	By all=By.xpath("//a[@class='see-all']");
	By pdt=By.xpath("//*[@id=\"content\"]/div[4]/div[1]/div/div[1]/a/img");
	
//To launch the application
	public void launchApplication() throws IOException, InterruptedException{ 
		//To launch chrome browser
		launchBrowser("chrome");
		//To provide delay
		Thread.sleep(2000);
	}
	
//To load web page
	public void Url(){
		//To go to the site
		driver.get("http://opencart.abstracta.us/");
		//To get the title of the page
		System.out.println(driver.getTitle());
	}
	
//Selecting desktop tab
	public void selectdesktop(){
		//Clicking desktop
		driver.findElement(desktop).click();
		//Clicking show all desktops
		driver.findElement(all).click();
	}
	
//Clicking on a product 
	public void pdct(){
		//Clicking on a product
		driver.findElement(pdt).click();
	}

//Taking Screenshot
	public void screenshot(String path) throws IOException {
		//Creating a object for screenshot class
		TakesScreenshot ts= (TakesScreenshot)driver;
		//Declaring file name and output file type
		File sr=ts.getScreenshotAs(OutputType.FILE);
		//Copying the file to a new file
		FileUtils.copyFile(sr, new File(path));
	}
//Closing the browser
	public void closebrowser() {
		//to close the browser
		driver.close();
	}
}
