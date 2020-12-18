package com.bdd.example.pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;
	
	@FindBy(xpath = "//li[@id='nav_tab6_mobile']/a")
	WebElement loginButton;
	
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void verifyHomePageDetails() {
		String actualURL = driver.getCurrentUrl();
		assertEquals("https://www.westernunion.com/in/en/home.html", actualURL);

		String actualTitle = driver.getTitle();
		assertEquals("International Money Transfers | Western Union India", actualTitle);
	}
	
	public void clickOnLoginButton() {
		loginButton.click();
	}
}
