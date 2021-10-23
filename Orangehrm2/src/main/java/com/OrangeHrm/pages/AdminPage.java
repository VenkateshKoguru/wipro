package com.OrangeHrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import freemarker.log.Logger;

public class AdminPage extends BasePage {
	private static final Logger logger = Logger.getLogger(AdminPage.class.getName());
	@FindBy(xpath = "//b[contains(text(),'Admin')]")
	private WebElement Admin;

	@FindBy(xpath = "//a[@class=\"toggle tiptip\"]")
	private WebElement systemuser;

	@FindBy(xpath = "//input[@id=\"searchSystemUser_userName\"]")
	private WebElement Username;

	@FindBy(xpath = "//select[@name=\"searchSystemUser[userType]\"]")
	private WebElement userrole;

	@FindBy(xpath = "//option[@value=\"2\"]")
	private WebElement admin;
	                //  "id=\"searchSystemUser_employeeName_empId\""
                    // 'name="searchSystemUser[employeeName][empId]"'
	@FindBy(xpath = "//input[@name=\"searchSystemUser[employeeName][empName]\"]")
	private WebElement Employee;

	@FindBy(xpath = "//select[@name=\"searchSystemUser[status]\"]")
	private WebElement status;
	

	@FindBy(xpath = "//option[@selected=\"selected\"]")
	private WebElement enabled;

	@FindBy(xpath = "//input[@id=\"searchBtn\"]")
	private WebElement search;

	@FindBy(xpath = "//input[@class=\"reset hover\"]")
	private WebElement reset;

	public AdminPage(WebDriver driver) {
		super(driver);

		// TODO Auto-generated constructor stub
	}

	{

		PageFactory.initElements(driver, this);
	}

	public void clickonadmin1() {
		logger.info("Starting of clickonadmin1 method");
		this.Admin.click();
		logger.info("Ending of clickonadmin1 method");
	}

	public void clickonusername(String username) {
		logger.info("Starting of clickonusername method");
		this.Username.sendKeys(username);
		logger.info("Ending of clickonusername method");
	}

	public void clickonadmin() {
		logger.info("Starting of clickonuadmin method");
		this.admin.click();
		logger.info("Ending of clickonuadmin method");
	}

	public void clickonemployeename(String employeename) {
		logger.info("Starting of clickonemployeename method");
		this.Employee.sendKeys(employeename);
		logger.info("Ending of clickonemployeename method");
		
	}

	public void clickonstatus() {
		logger.info("Starting of clickonstatus method");
		this.status.sendKeys("enabled");
		logger.info("Ending of clickonstatus method");
	}

	public void clickonsearch() {
		logger.info("Starting of clickonsearch method");
		this.search.click();
		logger.info("Ending of clickonsearch method");
	}

}
