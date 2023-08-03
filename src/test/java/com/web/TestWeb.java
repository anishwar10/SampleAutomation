package com.web;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestWeb {
	@Test
	public void demo() {
        
        // declaration and instantiation of objects/variables
			
		///comment the above 2 lines and uncomment below 2 lines to use Chrome
		System.setProperty("webdriver.chrome.driver","/usr/bin/google-chrome");
		//WebDriver driver = new ChromeDriver();
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("headless");
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);

        String baseUrl = "http://demo.guru99.com/test/newtours/";
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";

        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);
        driver.quit();
	
	}
}
