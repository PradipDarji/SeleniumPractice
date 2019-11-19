package com.demoaut.newtours.claassJava.copy;

import static org.testng.Assert.assertEquals;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.demoaut.newtours.claassPO.LoginPO;

import Basic.BasicConcept;

public class LoginClass extends BasicConcept {
	
	public static final Logger log = Logger.getLogger(LoginClass.class.getName());

	
	public LoginClass() {
		
	}
	public LoginClass(WebDriver driver) {
		this.driver = driver;
	}

	@Test
	public void verifyUserLoginfunctionality() throws Exception {
		Register register = new Register(driver);
		register.userRegistration();
		LoginPO loginpo = new LoginPO(driver);
		assertEquals(loginpo.enterUserNameandPassword(), true, "User able to enter username");
		log.info("User has been entered username & password successfully.");
		assertEquals(loginpo.clickonLogin(), true, "User able to click on login button");
		log.info("User should redirect on dashboard page.");
		assertEquals(loginpo.verifySignoffbutton(), true, "User able to seee sign off button");
		log.info("System should display sign off button.");
	}

}
