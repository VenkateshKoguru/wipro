package com.OrangeHrm.Test;
//package com.OrangeHrm.pages;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.OrangeHrm.pages.AddPage;
import com.OrangeHrm.pages.AdminPage;
import com.OrangeHrm.pages.BuzzPage;
import com.OrangeHrm.pages.LoginPage;
import com.OrangeHrm.pages.RecruitmentPage;

import freemarker.log.Logger;

public class LoginTest<testDataProp> extends BaseTest {
	private static final Logger logger = Logger.getLogger(LoginTest.class.getName());

	private WebDriver driver = null;
	private LoginPage loginpage = null;
	private AdminPage adminname = null;
	private AddPage addpagename = null;
	private RecruitmentPage addfulldetails = null;
	private BuzzPage addbuzzdetails = null;
	protected static Properties expectedassertionsprop = null;
	protected static Properties testDataProp = null;

	@BeforeSuite
	public void initTESTDATE() {
		if (testDataProp == null) {
			FileReader testDataReader = null;
			FileReader assertionsReader = null;
			try {
				testDataReader = new FileReader("src/main/resources/testdata.properties");
				assertionsReader = new FileReader("src/main/resources/expectedassertions.properties");

				testDataProp = new Properties();
				testDataProp.load(testDataReader);

				expectedassertionsprop = new Properties();
				expectedassertionsprop.load(assertionsReader);

			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					testDataReader.close();
					assertionsReader.close();
				} catch (IOException e) {
					e.printStackTrace(); 
				}
			}

		}

	}

	@BeforeClass
	public void initClass() {
		this.driver = this.getDriver();
		this.goToSite();
		this.loginpage = new LoginPage(driver);
		this.adminname = new AdminPage(driver);
		this.addpagename = new AddPage(driver);
		this.addfulldetails = new RecruitmentPage(driver);
		this.addbuzzdetails = new BuzzPage(driver);

	}

	@Test(priority = 1)
	public void LoginToOrangeHRM() {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		this.loginpage.setOnUserName(testDataProp.getProperty("UserName"));
		this.loginpage.setOnPassword(testDataProp.getProperty("Password"));
		this.loginpage.clickonlogin();
	}

	@Test(priority = 2)
	public void addNewUser() {
		logger.info("Starting of addNewUser method");

		
		
		this.adminname.clickonadmin1();
		this.adminname.clickonusername(testDataProp.getProperty("username"));
		this.adminname.clickonadmin();
		this.adminname.clickonemployeename(testDataProp.getProperty("employeename"));
		this.adminname.clickonstatus();
		this.adminname.clickonsearch();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		logger.info("Ending of addNewUser method");

	}

	@Test(priority = 3)
	public void addusername() {
		logger.info("Starting of addusername method");
		this.addpagename.clickonadd();
		this.addpagename.clickonuserrole();
		this.addpagename.setonempolyeename(testDataProp.getProperty("empolyeename"));
		this.addpagename.setonusername(testDataProp.getProperty("username"));
		this.addpagename.clickonoption();
		this.addpagename.setonpassword(testDataProp.getProperty("password"));
		this.addpagename.setonconfirmpassword(testDataProp.getProperty("confirmpassword"));
		this.addpagename.clickonsave();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		logger.info("Ending of addusername method");
	}

	@Test(priority = 4)
	public void addrecruiment() {
		logger.info("Starting of addrecruiment method");
		this.addfulldetails.clickOnrecruiment();
		this.addfulldetails.clickoncandidates();
		this.addfulldetails.clickonjobtitle();
		this.addfulldetails.clickonvacancy();
		this.addfulldetails.clickonhr();
		this.addfulldetails.clickonstatus();
		this.addfulldetails.clickoncandidatename(testDataProp.getProperty("candidatename"));
		this.addfulldetails.clickonkeywords(testDataProp.getProperty("keywords"));
		this.addfulldetails.clickondateofapplication();
		this.addfulldetails.clickondateofjoin();
		this.addfulldetails.clickonmethodofapplication();
		this.addfulldetails.clickonstatus();
		this.addfulldetails.clickonadd();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		logger.info("Ending of addrecruiment method");

	}

	@Test(priority = 5)
	public void addbuzzdetails() {
		logger.info("Starting of addbuzzdetails method");

		this.addbuzzdetails.clickonbuzz();
		this.addbuzzdetails.clickonupdatestatus();
		this.addbuzzdetails.clickontextarea(testDataProp.getProperty("textarea"));
		this.addbuzzdetails.clickonuploadimage();
		this.addbuzzdetails.clickontextarea2(testDataProp.getProperty("textarea2"));
		this.addbuzzdetails.clickonuploadimage2();
		this.addbuzzdetails.clickonpost();
		this.addbuzzdetails.clickonvideo();
		this.addbuzzdetails.clickontextvideo();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		logger.info("Endting of addbuzzdetails method");

	}

	 //@AfterClass
	public void quitDriver() {

		try {

			if (driver != null) {

				driver.quit();

				logger.debug("Driver quit successfully");

			}
		} catch (Exception ex) {

			logger.error(ex.getMessage());

		}
	}

}
