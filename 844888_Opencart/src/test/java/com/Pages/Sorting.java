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
		System.out.println(driver.getTitle());
	}

//To select desktop tab
	public void selectdesktop(){
		driver.findElement(desktop).click();
		driver.findElement(all).click();
	}

//Sorting the products
	public void sortingproduct(){
		WebElement we=driver.findElement(sort);
		we.click();
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		act.sendKeys(Keys.ENTER).build().perform();
	}

//Taking screenshot
	public void screenshot(String path) throws IOException {
		TakesScreenshot ts= (TakesScreenshot)driver;
		File sr=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sr, new File(path));
	}

//Close browser
	public void closebrowser() {
		driver.close();
	}

}
