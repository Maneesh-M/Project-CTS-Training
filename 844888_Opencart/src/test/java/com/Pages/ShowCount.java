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
	Thread.sleep(2000);
	}
	
//To load web page
	public void url(){
		//To go to the site 
		driver.get("http://opencart.abstracta.us/");
		System.out.println(driver.getTitle());
	}
	
//Select desktop tab
	public void selectdesktop(){
		driver.findElement(desktop).click();
		driver.findElement(all).click();
	}
	
//To select the Quantity
	public void showcount(){
		WebElement we=driver.findElement(count);
		we.click();
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		act.sendKeys(Keys.ENTER).build().perform();
	}
	
//Taking screenshot
	public void screenshot(String path) throws IOException {
		TakesScreenshot ts= (TakesScreenshot)driver;
		File sr=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sr, new File(path));
	}
	
//Close the browser
	public void closebrowser() {
		driver.close();
	}

}
