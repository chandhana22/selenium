package com.bdd.example.pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	@FindBy(xpath = "//input[@id='txtEmailAddr']")
	WebElement emailTxt;

	@FindBy(xpath = "//input[@id='txtKey']")
	WebElement passwordTxt;

	@FindBy(xpath = "//button[@id='button-continue']")
	WebElement continueButton;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void verifyloginPageDetails() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String actualURL = driver.getCurrentUrl();
		assertEquals("https://www.westernunion.com/in/en/web/user/login", actualURL);

		String actualTitle = driver.getTitle();
		assertEquals("Login to your profile| Western Union IN", actualTitle);
	}

	public void enterLoginDetails(String userName, String password) {
		emailTxt.sendKeys(userName);
		passwordTxt.sendKeys(password);
		continueButton.click();
	}

}
