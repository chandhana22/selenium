package com.bdd.example.pages;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
	
	WebDriver driver;
	
	@FindBy(xpath = "//img[@alt = 'logo']")
	WebElement logoImage;
	
	@FindBy(xpath = "//input[@id = 'firstName']")
	WebElement firstName;
	
	@FindBy(xpath = "//input[@id = 'middleName']")
	WebElement middleNameInput;
	
	@FindBy(xpath = "//input[@id = 'lastName']")
	WebElement lastNameInput;
	
	@FindBy(xpath = "//input[@id = 'email']")
	WebElement emailId;
	
	@FindBy(xpath = "//input[@id = 'password']")
	WebElement passwordTxt;
	
	
	
	public RegistrationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void verifyRegpageDetails() {
		String actualURL = driver.getCurrentUrl();
		assertEquals("https://www.westernunion.com/in/en/web/user/register", actualURL);

		String actualTitle = driver.getTitle();
		assertEquals("Register a profile with Western Union IN", actualTitle);
	}
	
	public void verifyLogo() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertTrue(logoImage.isDisplayed());
	}
	
	public void enterUserNameDetails(String firstname, String middleName, String lastName) {
		firstName.sendKeys(firstname);
		middleNameInput.sendKeys(middleName);
		lastNameInput.sendKeys(lastName);
	}
	
	public void setUserNamePassword(String email, String password) {
		emailId.sendKeys(email);
		passwordTxt.sendKeys(password);
	}
	
	public void clickOnLogo() {
		logoImage.click();
	}

}
