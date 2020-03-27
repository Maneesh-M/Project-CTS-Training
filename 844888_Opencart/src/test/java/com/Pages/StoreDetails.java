package com.Pages;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import baseClass.Wrapper;
import excelutility.WritingToExcel;

public class StoreDetails extends Wrapper{
//Defining web elements
	By desktop=By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[1]/a");
	By all=By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[1]/div/a");
	By pdt=By.xpath("//*[@id=\"content\"]/div[4]/div[6]/div/div[1]/a/img");
	By pname=By.xpath("//div[@class='col-sm-4']//child::h1");
	By pdetails=By.xpath("//div[@class='cpt_product_description ']//p[2]");
	
//To launch the application
	public void launchApplication() throws IOException, InterruptedException{
		//To launch the chrome application which is selected
		launchBrowser("chrome");
		Thread.sleep(2000);
	}
	
//To load web page
	public void url(){
		//To go to the site
		driver.get("http://opencart.abstracta.us/");
		//To get the title of the site
		System.out.println(driver.getTitle());
	}

//Selecting desktop tab
	public void selectdesktop() throws InterruptedException{
		//Clicking desktop
		driver.findElement(desktop).click();
		//Clicking show all desktops
		driver.findElement(all).click();
		Thread.sleep(2000);
		//Clicking on a product
		driver.findElement(pdt).click();
	}
	
//Writing to Excel
	public void exceldata() throws InterruptedException{
		//Reading the text of the web element to a string
		String a=driver.findElement(pname).getText();
		//Creating object for excel Class
		WritingToExcel e=new WritingToExcel();
		//Calling the method using the object
		e.wr_excel(0, 0, a);
		Thread.sleep(2000);
		//Reading the text of the web element to a string
		String b=driver.findElement(pdetails).getText();
		//Calling the method using the object
		e.wr_excel(1, 0, b);
	}
	
//Taking screenshot
	public void screenshot(String path) throws IOException{
		//Creating object for screenshot class
		TakesScreenshot ts= (TakesScreenshot)driver;
		//Declaring file name and output file type
		File sr=ts.getScreenshotAs(OutputType.FILE);
		//Copying the file to a new file
		FileUtils.copyFile(sr, new File(path));
	}
	
//Closing the browser
	public void closebrowser(){
		//To close the browser
		driver.close();
	}
}
