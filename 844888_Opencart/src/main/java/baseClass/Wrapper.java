package baseClass;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Wrapper {
//Defining web driver
	public WebDriver driver;
//Method to launch browser
	public void launchBrowser(String browser) throws IOException{
		//For chrome browser
		if(browser.equalsIgnoreCase("chrome")){
			
			System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\Driver\\chromedriver_v80.exe");
			driver= new ChromeDriver();
		}
		//For firefox browser
		else if(browser.equals("firefox")){
			System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\Driver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		//Maximizing the browser 
		driver.manage().window().maximize();
		//Waiting for page to get loaded
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
	}
}
