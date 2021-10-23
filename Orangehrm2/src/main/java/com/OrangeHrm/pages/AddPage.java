

package com.OrangeHrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import freemarker.log.Logger;

public class AddPage extends BasePage {
	private static final Logger logger = Logger.getLogger(AddPage.class.getName());

	@FindBy(xpath = "//input[@value=\"Add\"]")
	private WebElement add;

	@FindBy(xpath = "//select[@name=\"systemUser[userType]\"]")
	private WebElement userrole;

	@FindBy(xpath = "//input[@id=\"systemUser_employeeName_empName\"]")
	private WebElement Employeename;

	@FindBy(xpath = "//input[@class=\"formInputText\"]")
	private WebElement Username;

	@FindBy(xpath = "//select[@name=\"systemUser[status]\"]")
	private WebElement option;

	@FindBy(xpath = "//input[@id=\"systemUser_confirmPassword\"]")
	private WebElement password;

	@FindBy(xpath = "//input[@id=\"systemUser_confirmPassword\"]")
	private WebElement confirmpassword;

	@FindBy(xpath = "//input[@id=\"btnSave\"]")
	private WebElement save;

	public AddPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
		}
	}

	public void clickonadd() {
		logger.info("Starting of clickonadd method");
		this.add.click();
		logger.info("Ending of clickonadd method");
	}

	public void clickonuserrole() {
		logger.info("Starting of clickonuserrole method");
		this.userrole.click();
		logger.info("Ending of clickonuserrole method");
	}

	public void setonempolyeename(String empolyeename) {
		logger.info("Starting of clickonempolyeename method");
		this.Employeename.sendKeys(empolyeename);
		logger.info("Ending of clickonempolyeename method");
	}

	public void setonusername(String username) {
		logger.info("Starting of clickonusername method");
		this.Username.sendKeys(username);
		logger.info("Ending of clickonusername method");
	}

	public void clickonoption() {
		logger.info("Starting of clickonoption method");
		this.option.click();
		logger.info("Ending of clickonoption method");

	}

	public void setonpassword(String password) {
		logger.info("Starting of clickonpassword method");
		this.password.sendKeys(password);
		logger.info("Ending of clickonpassword method");

	}

	public void setonconfirmpassword(String confirmpassword) {
		logger.info("Starting of clickonconfirmpassword method");
		this.confirmpassword.sendKeys(confirmpassword);
		logger.info("Ending of clickonconfirmpassword method");
	}

	public void clickonsave() {
		logger.info("Starting of clickonsave method");
		this.save.click();
		logger.info("Ending of clickonsave method");
	}

}
