package com.demoaut.newtours.claassJava.copy;

import static org.testng.Assert.assertEquals;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.demoaut.newtours.claassPO.RegisterPO;

import Basic.BasicConcept;

public class Register extends BasicConcept {

	public static final Logger log = Logger.getLogger(Register.class.getName());

	public Register() {
	}

	public Register(WebDriver passDriver) {
		driver = passDriver;
	}

	@Test
	public void userRegistration() throws Exception {
		RegisterPO RPO = new RegisterPO(driver);
		assertEquals(RPO.clickonRegister(), true, "User able to click on Register button");
		log.info("User should redirect on Registration Page");
		assertEquals(RPO.enterFirstName(), true, "User able to add his firstname");
		log.info("User has been entered his firstname");
		assertEquals(RPO.enterLastName(), true, "User able to add his lastname");
		log.info("User has been entered his lastname");
		assertEquals(RPO.enterPhone(), true, "User able to add his Phone");
		log.info("User has been entered his Phone");
		assertEquals(RPO.enteruserName(), true, "User able to add his username");
		log.info("User has been entered his username");
		assertEquals(RPO.enterAddress1(), true, "User able to add his Address1");
		log.info("User has been entered his Address1");
		assertEquals(RPO.enterAddress2(), true, "User able to add his Address2");
		log.info("User has been entered his Address2");
		assertEquals(RPO.enterCity(), true, "User able to add his city");
		log.info("User has been entered his city");
		assertEquals(RPO.enterState(), true, "User able to add his State");
		log.info("User has been entered his state");
		assertEquals(RPO.enterPostalCode(), true, "User able to add his postalcode");
		log.info("User has been entered his postalcode");
		assertEquals(RPO.selectCountry(), true, "User able to select country");
		log.info("User has been selected country");
		assertEquals(RPO.enterEmail(), true, "User able to add his email/User ID");
		log.info("User has been entered his email/User ID");
		assertEquals(RPO.enterPassword(), true, "User able to add his password");
		log.info("User has been entered his password");
		assertEquals(RPO.enterconfirmPassword(), true, "User able to add his confirm password");
		log.info("User has been entered his confirm password");
		assertEquals(RPO.clickOnSubmit(), true, "User able to click on Submit button");
		log.info("System should display success message");
		assertEquals(RPO.verifyUserRegisteration(), true, "User able to see success message with userName");
		log.info("System should display success message with userName");
		assertEquals(RPO.clickonSignIn(), true, "User able to click on Sign Inj button");
		log.info("System should display sign on page");
	}

}
