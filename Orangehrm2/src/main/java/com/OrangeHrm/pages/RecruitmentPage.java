package com.OrangeHrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import freemarker.log.Logger;

public class RecruitmentPage extends BasePage {
	private static final Logger logger = Logger.getLogger(RecruitmentPage.class.getName());

	@FindBy(xpath = "//b[contains(text(),'Recruitment')]")
	private WebElement recruiment;

	@FindBy(xpath = "//a[@id=\"menu_recruitment_viewCandidates\"]")
	private WebElement candidates;

	@FindBy(xpath = "//select[@id=\"candidateSearch_jobTitle\"]")
	private WebElement jobtitle;

	@FindBy(xpath = "//select[@id=\"candidateSearch_jobVacancy\"]")
	private WebElement vacancy;

	@FindBy(xpath = "//select[@id=\"candidateSearch_hiringManager\"]")
	private WebElement hr;

	@FindBy(xpath = "//select[@id=\"candidateSearch_status\"]")
	private WebElement status;

	@FindBy(xpath = "//input[@id=\"candidateSearch_candidateName\"]")
	private WebElement candidatename;

	@FindBy(xpath = "//input[@id=\"candidateSearch_keywords\"]")
	private WebElement keywords;

	@FindBy(xpath = "//input[@id=\"candidateSearch_fromDate\"]")
	private WebElement dateofapplication;

	@FindBy(xpath = "//input[@id=\"candidateSearch_toDate\"]")
	private WebElement dateofjoin;

	@FindBy(xpath = "//select[@id=\"candidateSearch_modeOfApplication\"]")
	private WebElement methodofapplication;

	@FindBy(xpath = "//input[@id=\"btnSrch\"]")
	private WebElement search;

	@FindBy(xpath = "//input[@id=\"btnAdd\"]")
	private WebElement add;

	public RecruitmentPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	{
		PageFactory.initElements(driver, this);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void clickOnrecruiment() {
		logger.info("Starting of clickonbuzz method");
		this.recruiment.click();
		logger.info("Ending of clickonbuzz method");
	}

	public void clickoncandidates() {
		logger.info("Starting of clickoncandidates method");
		this.candidates.click();
		logger.info("Ending of clickoncandidates method");
	}

	public void clickonjobtitle() {
		logger.info("Starting of clickonjobtitle method");
		this.jobtitle.click();
		logger.info("Ending of clickonjobtitle method");
	}

	public void clickonvacancy() {
		logger.info("Starting of clickonvacancy method");
		this.vacancy.click();
		logger.info("Ending of clickonvacancy method");
	}

	public void clickonhr() {
		logger.info("Starting of clickonhr method");
		this.hr.click();
		logger.info("Ending of clickonhr method");
	}

	public void clickonstatus() {
		logger.info("Starting of clickonstatus method");
		this.status.click();
		logger.info("Ending of clickonstatus method");
	}

	public void clickoncandidatename(String candidatename) {
		logger.info("Starting of clickoncandidatename method");
		this.candidatename.sendKeys(candidatename);
		logger.info("Ending of clickoncandidatename method");
	}

	public void clickonkeywords(String keywords) {
		logger.info("Starting of clickonkeywords method");
		this.keywords.sendKeys(keywords);
		logger.info("Ending of clickonkeywords method");
	}

	public void clickondateofapplication() {
		logger.info("Starting of clickondateofapplication method");
		this.dateofapplication.click();
		logger.info("Ending of clickondateofapplication method");
	}

	public void clickondateofjoin() {
		logger.info("Starting of clickondateofjoin method");
		this.candidatename.click();
		logger.info("Ending of clickondateofjoin method");
	}

	public void clickonmethodofapplication() {
		logger.info("Starting of clickonmethodofapplication method");
		this.methodofapplication.click();
		logger.info("Ending of clickonmethodofapplication method");
	}

	public void clickonsearch() {
		logger.info("Starting of clickonsearch method");
		this.search.click();
		logger.info("Ending of clickonsearch method");
	}

	public void clickonadd() {
		logger.info("Starting of clickonadd method");
		this.add.click();
		logger.info("Ending of clickonadd method");
	}

}
