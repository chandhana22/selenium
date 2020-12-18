package com.bdd.example.steps;

import org.openqa.selenium.WebDriver;

import com.bdd.example.SetUp;
import com.bdd.example.pages.HomePage;
import com.bdd.example.pages.LoginPage;
import com.bdd.example.pages.RegistrationPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WURegistrationSteps {

	WebDriver driver;

	RegistrationPage regpage;
	HomePage homePage;
	LoginPage loginpage;

	@Given("open chrome browser")
	public void open_chrome_browser() {
		driver = SetUp.getDriver();
		
		regpage = new RegistrationPage(driver);
		homePage = new HomePage(driver);
		loginpage = new LoginPage(driver);
	}

	@When("user enter the WU registration url")
	public void user_enter_the_wu_registration_url() {
		driver.get("https://www.westernunion.com/in/en/web/user/register");
	}

	@Then("verify that user lands on WU registration page successfully")
	public void verify_that_user_lands_on_wu_registration_page_successfully() {

		regpage.verifyRegpageDetails();
	}

	@Then("verify WU logo at the top left")
	public void verify_wu_logo_and_top_left() {

		regpage.verifyLogo();
	}

//	@Then("Enter user first name as (.*), middle name as (.*) and last name as (.*)")
//	public void enter_user_names_details(String firstname, String middleName, String lastName) {
//
//		regpage.enterUserNameDetails(firstname,middleName,lastName);
//	}
	
	@Then("Enter user first name as (.*), middle name as (.*) and last name as (.*)")
	public void enter_user_names_details(String firstname, String middleName, String lastName) {
		regpage.enterUserNameDetails(firstname,middleName,lastName);
	}

	@Then("Enter user enters email as (.*) and password as (.*)")
	public void enter_user_credentail_details_in_the_form(String email, String password) {
		regpage.setUserNamePassword(email, password);
	}

	@Then("Enter user address information")
	public void enter_user_address_information() {

	}

	@Then("Enter user addl information")
	public void enter_user_addl_information() {

	}

	@Then("Enter user security details")
	public void enter_user_security_details() {

	}

	@Then("Verify the terms and conditions check boxes with text")
	public void verify_the_terms_and_conditions_check_boxes_with_text() {

	}

	@Then("Click the finish button on the bottom of the form")
	public void click_the_finish_button_on_the_bottom_of_the_form() {

	}

	@Then("user click on WU logo on the top left in registration page")
	public void click_the_WU_logo() {
		regpage.clickOnLogo();
	}

	@Then("verify that user is landed on WU home page")
	public void verify_home_page_details() {
		homePage.verifyHomePageDetails();
	}

	@Then("user close the browser")
	public void user_close_the_browser() {
		// driver.close();
	}

	@Then("user click on login button in WU home page")
	public void user_click_on_login_button_in_wu_home_page() {
		homePage.clickOnLoginButton();
	}

	@Then("verify that user landed on WU login page")
	public void verify_that_user_landed_on_wu_login_page()  {
		loginpage.verifyloginPageDetails();
	}

//	 And user enters login details as  <loginUuserName> and <loginPassword> in the login form
	@Then("user enters login details as  (.*) and (.*) in the login form")
	public void user_enters_username_and_password_in_the_login_form(String loginUserName,String loginPassword) {
		loginpage.enterLoginDetails(loginUserName,loginPassword);
	}

}
