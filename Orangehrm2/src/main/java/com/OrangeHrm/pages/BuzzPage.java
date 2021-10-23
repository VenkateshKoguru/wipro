package com.OrangeHrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import freemarker.log.Logger;

public class BuzzPage extends BasePage {
	private static final Logger logger = Logger.getLogger(BuzzPage.class.getName());
	@FindBy(xpath = "//b[contains(text(),'Buzz')]")
	private WebElement buzz;

	@FindBy(xpath = "//li[@id=\"tabLink1\"]")
	private WebElement updatestatus;

	@FindBy(xpath = "//textarea[@placeholder=\"What's on your mind?\"]")
	private WebElement textarea;

	@FindBy(xpath = "//li[@id=\"tabLink2\"]")
	private WebElement uploadimage;

	@FindBy(xpath = "//textarea[@id=\"phototext\"]")
	private WebElement textarea2;

	@FindBy(xpath = "//input[@id=\"image-upload-button\"]")
	private WebElement uploadimage2;

	@FindBy(xpath = "//input[@id=\"imageUploadBtn\"]")
	private WebElement post;

	@FindBy(xpath = "//li[@id=\"tabLink3\"]")
	private WebElement video;

	@FindBy(xpath = "//textarea[@id=\"createVideo_content\"]")
	private WebElement textvideo;

	public BuzzPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void clickonbuzz() {
		logger.info("Starting of clickonbuzz method");
		this.buzz.click();
		logger.info("Ending of clickonbuzz method");
	}

	public void clickonupdatestatus() {
		logger.info("Starting of clickonupdatestatus method");
		this.updatestatus.click();
		logger.info("Ending of clickonupdatestatus method");
	}

	public void clickontextarea(String textarea) {
		logger.info("Starting of clickontextarea method");
		this.textarea.sendKeys(textarea);
		logger.info("Ending of clickontextarea method");
	}

	public void clickonuploadimage() {
		logger.info("Starting of clickonuploadimage method");
		this.uploadimage.click();
		logger.info("Ending of clickonuploadimage method");
	}

	public void clickontextarea2(String textarea2) {
		logger.info("Starting of clickontextarea2 method");
		this.textarea2.sendKeys(textarea2);
		logger.info("Ending of clickontextarea2 method");
	}

	public void clickonuploadimage2() {
		logger.info("Starting of clickonauploadimage2 method");
		this.uploadimage2.sendKeys("C:\\Users\\91837\\eclipse-workspace\\flipkart\\src\\main\\resources");
		logger.info("Ending of clickonauploadimage2 method");
	}

	public void clickonpost() {
		logger.info("Starting of clickonpost method");
		this.post.click();
		logger.info("Ending of clickonpost method");
	}

	public void clickonvideo() {
		logger.info("Starting of clickonvideo method");
		this.video.click();
		logger.info("Ending of clickonvideo method");
	}

	public void clickontextvideo() {
		logger.info("Starting of clickontextvideo method");
		this.textvideo.click();
		logger.info("Ending of clickontextvideo method");

		driver.quit();
	}
}
