package com.OrangeHrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import freemarker.log.Logger;

public class LoginPage extends BasePage {
	private static final Logger logger = Logger.getLogger(LoginPage.class.getName());


	@FindBy(xpath = "//input[@name=\"txtUsername\"]")
	private WebElement username;

	@FindBy(xpath = "//input[@name=\"txtPassword\"]")
	private WebElement password;

	@FindBy(xpath = "//input[@type=\"submit\"]")
	private WebElement loginButton;

	public LoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void setOnUserName(String UserName) {
		logger.info("Starting of clickonusername method");
		this.username.sendKeys(UserName);
		logger.info("Ending of clickonusername method");
	}

	public void setOnPassword(String Password) {
		logger.info("Starting of clickonpassword method");
		this.password.sendKeys(Password);
		logger.info("Ending of clickonpassword method");
	}

	public void clickonlogin() {
		logger.info("Starting of clickonlogin method");
		this.loginButton.click();
		logger.info("Ending of clickonlogin method");
	}
}
