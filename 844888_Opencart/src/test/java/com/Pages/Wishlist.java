package com.Pages;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import baseClass.Wrapper;

public class Wishlist extends Wrapper {
//Defining web elements
	By account=By.xpath("(//a[@class='dropdown-toggle'])[1]");
	By login=By.xpath("//a[contains(text(),'Login')]");
	By advanced=By.xpath("//*[@id=\"details-button\"]");
	By proceed=By.xpath("//*[@id=\"proceed-link\"]");
	By uname=By.xpath("//input[@name='email']");
	By passwd=By.xpath("//input[@name='password']");
	By button=By.xpath("//input[@value='Login']");
	
	
	By desktop=By.xpath("(//a[@class='dropdown-toggle'])[2]");
	By all=By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[1]/div/a");
	By pdt=By.xpath("//*[@id=\"content\"]/div[4]/div[8]/div/div[1]/a/img");
	By wlist=By.xpath("//*[@id=\"content\"]/div/div[2]/div[1]/button[1]/i");
	By wishl=By.xpath("(//span[@class='hidden-xs hidden-sm hidden-md'])[4]");

//To Launch the application
	public void launchApplication() throws IOException, InterruptedException { 
		//Launching chrome browser
		launchBrowser("chrome");
		Thread.sleep(2000);
	}
	
//To load the site
	public void url() {
		//To go to the site
		driver.get("http://opencart.abstracta.us/");
		//To read the title of the page
		System.out.println(driver.getTitle());
	}
	
//Logging in to the account
	public void loginuser() throws InterruptedException {
		//Clicking on account
		driver.findElement(account).click();
		Thread.sleep(1000);
		//Clicking on login
		driver.findElement(login).click();
		Thread.sleep(2000);
		//Clicking on advanced
		driver.findElement(advanced).click();
		Thread.sleep(2000);
		//Clicking on proceed to opencart.abstracta(unsafe)
		driver.findElement(proceed).click();
		Thread.sleep(3000);
		//Entering user name
		driver.findElement(uname).sendKeys("mp2@gmail.com");
		Thread.sleep(1000);
		//Entering password
		driver.findElement(passwd).sendKeys("passwopd");
		Thread.sleep(1000);
		//Clicking on Log in button
		driver.findElement(button).click();
		Thread.sleep(3000);
	}
	
//selecting desktop tab
	public void selectdesktop(){
		//Clicking on desktop
		driver.findElement(desktop).click();
		//Clicking on see all desktop
		driver.findElement(all).click();
	}

	//Moving the product to Wish list
	public void wishlist() throws InterruptedException	{
		//Selecting a product
		driver.findElement(pdt).click();
		//Moving the product to the wish list 
		driver.findElement(wlist).click();
		Thread.sleep(1000);
		//Clicking on the wishlist button on the top 
		driver.findElement(wishl).click();
		Thread.sleep(3000);
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

//Closing the browser
	public void closebrowser() {
		//To close the browser
		driver.close();
	}

}
