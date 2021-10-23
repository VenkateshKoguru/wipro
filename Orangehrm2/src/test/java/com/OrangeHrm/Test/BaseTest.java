package com.OrangeHrm.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

	protected WebDriver driver = null;

	public WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe"); 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}

	public void goToSite() {
		driver.get("https://opensource-demo.orangehrmlive.com/"); 

	}
}
