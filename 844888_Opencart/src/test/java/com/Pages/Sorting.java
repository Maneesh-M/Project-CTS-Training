package com.Pages;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sorting {

	WebDriver driver;
	By desktop=By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[1]/a");
	By all=By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[1]/div/a");
	By sort=By.xpath("//*[@id=\"input-sort\"]");

	public void url() { 
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\Driver\\chromedriver_v80.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public void Homepage() {
		driver.get("https://demo.opencart.com/");
		System.out.println(driver.getTitle());
	}

	public void selectdesktop(){
		driver.findElement(desktop).click();
		driver.findElement(all).click();
	}

	public void sortingproduct(){
		WebElement we=driver.findElement(sort);
		we.click();
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
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
