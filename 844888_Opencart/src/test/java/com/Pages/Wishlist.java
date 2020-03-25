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
	By uname=By.xpath("//input[@name='email']");
	By passwd=By.xpath("//input[@name='password']");
	By button=By.xpath("//input[@value='Login']");
	
	
	By desktop=By.xpath("(//a[@class='dropdown-toggle'])[2]");
	By all=By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[1]/div/a");
	By pdt=By.xpath("//*[@id=\"content\"]/div[4]/div[6]/div/div[1]/a/img");
	By wlist=By.xpath("//*[@id=\"content\"]/div/div[2]/div[1]/button[1]/i");
	By wishl=By.xpath("(//span[@class='hidden-xs hidden-sm hidden-md'])[4]");

//To Launch the application
	public void url() throws IOException, InterruptedException { 
		//Launching chrome browser
		launchBrowser("chrome");
		Thread.sleep(2000);
	}
	
//To load the site
	public void Homepage() {
		driver.get("https://demo.opencart.com/");
		System.out.println(driver.getTitle());
	}
	
//Logging in
	public void loginuser() throws InterruptedException {
		driver.findElement(account).click();
		Thread.sleep(1000);
		driver.findElement(login).click();
		Thread.sleep(2000);
		driver.findElement(uname).sendKeys("mansh@gmail.com");
		Thread.sleep(1000);
		driver.findElement(passwd).sendKeys("maneesh123");
		Thread.sleep(1000);
		driver.findElement(button).click();
		Thread.sleep(3000);
	}
	
//selecting desktop tab
	public void selectdesktop(){
		driver.findElement(desktop).click();
		driver.findElement(all).click();
	}

	//Moving the product to Wish list
	public void wishlist() throws InterruptedException	{
		driver.findElement(pdt).click();
		driver.findElement(wlist).click();
		Thread.sleep(1000);
		driver.findElement(wishl).click();
		Thread.sleep(3000);
	}

//Taking screenshot
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
