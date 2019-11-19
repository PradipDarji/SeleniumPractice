package com.demoaut.newtours.claassPO;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPO {

	public WebDriver driver;
	public WebDriverWait wait;
	public Properties props;
	public FileInputStream inoutstream;
	String s1, s2;

	public LoginPO(WebDriver driver) throws Exception {
		this.driver = driver;
		wait  = new WebDriverWait(driver, 50);
		inoutstream = new FileInputStream("D:\\JavaPractice\\SeleniumPractice\\PropertiesFile");
	}

	public By UserNmae = By.xpath("//input[@name='userName']");
	public By Password = By.xpath("//input[@name='password']");
	public By Login = By.xpath("//input[@name='login']");
	public By SignOff = By.xpath("//a[contains(text(),'SIGN-OFF')]");

	public boolean enterUserNameandPassword() {
		try {
			WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(UserNmae));
			WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(Password));
			props = new Properties();
			props.load(inoutstream);
			s1 = (String) props.get("UserName");
			s2 = (String) props.get("Password");
			username.sendKeys(s1);
			password.sendKeys(s2);
			return true;
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
	}
	public boolean clickonLogin() {
		try {
			WebElement login = wait.until(ExpectedConditions.visibilityOfElementLocated(Login));
			login.click();
			return true;
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
	}

	public boolean verifySignoffbutton() {
		try {
			WebElement signoff = wait.until(ExpectedConditions.visibilityOfElementLocated(SignOff));
			if (signoff.isDisplayed()) {
				System.out.println("User is logged on");
			} else {
				System.out.println("User is logged off");
			}
			return true;
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
	}
}
