package com.Pages;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import baseClass.Wrapper;
import excelutility.WritingToExcel;

public class StoretoExcel extends Wrapper{

	By desktop=By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[1]/a");
	By all=By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[1]/div/a");
	By pdt=By.xpath("//*[@id=\"content\"]/div[4]/div[6]/div/div[1]/a/img");
	
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
	
	public void exceldata(){
		driver.findElement(pdt).click();
		String a=driver.findElement(By.xpath("//*[@id=\"tab-description\"]/div/div/p[2]")).getText();
		WritingToExcel e=new WritingToExcel();
		e.wr_excel(0, 0, a);
	}
	
	public void screenshot(String path) throws IOException{
		TakesScreenshot ts= (TakesScreenshot)driver;
		File sr=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sr, new File(path));
	}
	
	public void closebrowser(){
		driver.close();
	}
}
