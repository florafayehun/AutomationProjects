package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class homePage {
	//1. declare my webdriver
			WebDriver driver;	
					
			//set the driver property
			System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
					
			//3. invoke the firefox browser	
			driver = new FirefoxDriver();
			
			driver.manage().timeouts().implicitlyWait(27, TimeUnit.SECONDS);
			   
			//fetch a URL
			driver.get("http://www.google.com");
			
			//to print out the browser title 
			System.out.println(driver.getTitle());
		}


}
