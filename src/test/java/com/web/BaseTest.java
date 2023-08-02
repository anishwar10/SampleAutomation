package com.web;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public class BaseTest {
	public WebDriver driver=null;
	@BeforeSuite	
	public void invokeDriver() {
		
		/*
		 * System.setProperty(
		 * "webdriver.chrome.driver","C:\\Users\\Rama Lakhshmi\\chrome\\chromedriver.exe"
		 * ); driver = new ChromeDriver();
		 */
	    	
				/*
				 * }else if(browser.equalsIgnoreCase("edge")) { System.setProperty(
				 * "webdriver.edge.driver","C:\\Users\\Rama Lakhshmi\\Downloads\\msedgedriver.exe"
				 * ); driver=new EdgeDriver(); }
				 */
		}	
}
