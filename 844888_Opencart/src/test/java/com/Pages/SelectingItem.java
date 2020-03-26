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
		Thread.sleep(2000);
	}
	
//To load web page
	public void Url(){
		//To go to the site
		driver.get("http://opencart.abstracta.us/");
		System.out.println(driver.getTitle());
	}
	
//Selecting desktop tab
	public void selectdesktop(){
		driver.findElement(desktop).click();
		driver.findElement(all).click();
	}
	
//Clicking on a product 
	public void pdct(){
		driver.findElement(pdt).click();
	}

//Taking Screenshot
	public void screenshot(String path) throws IOException {
		TakesScreenshot ts= (TakesScreenshot)driver;
		File sr=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sr, new File(path));
	}
//Closing the browser
	public void closebrowser() {
		driver.close();
	}
}
