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

	By desktop=By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[1]/a");
	By all=By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[1]/div/a");
	By count=By.xpath("//*[@id=\"input-limit\"]");
	
	public void url() throws IOException, InterruptedException{ 
	launchBrowser("chrome");
	Thread.sleep(2000);
	}
	
	public void Homepage(){
		driver.get("https://demo.opencart.com/");
		System.out.println(driver.getTitle());
	}
	
	public void selectdesktop(){
		driver.findElement(desktop).click();
		driver.findElement(all).click();
	}
	
	public void showcount(){
		WebElement we=driver.findElement(count);
		we.click();
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		act.sendKeys(Keys.ENTER).build().perform();
	}
	
	public void screenshot(String path) throws IOException {
		TakesScreenshot ts= (TakesScreenshot)driver;
		File sr=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sr, new File(path));
	}
	
	public void closebrowser() {
		driver.close();
	}

}
