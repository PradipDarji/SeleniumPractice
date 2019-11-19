package com.demoaut.newtours.claassPO;

import java.io.FileOutputStream;
import java.util.Properties;
import java.util.Random;
import java.util.stream.IntStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPO {
	public WebDriver driver;
	public WebDriverWait wait;
	public String s1, s2, s3;
	Properties props;
	FileOutputStream outputStrem;
	public Random random;

	public RegisterPO(WebDriver driver) throws Exception {
		this.driver = driver;
		wait = new WebDriverWait(driver, 50);
		props = new Properties();
		random = new Random();
		outputStrem = new FileOutputStream("D:\\JavaPractice\\SeleniumPractice\\PropertiesFile");
	}

	public By Register = By.xpath("//a[contains(text(),'REGISTER')]");
	public By FirstNmae = By.xpath("//input[@name='firstName']");
	public By LastNmae = By.xpath("//input[@name='lastName']");
	public By Phone = By.xpath("//input[@name='phone']");
	public By userName = By.xpath("//input[@id='userName']");
	public By Address1 = By.xpath("//input[@name='address1']");
	public By Address2 = By.xpath("//input[@name='address2']");
	public By City = By.xpath("//input[@name='city']");
	public By State = By.xpath("//input[@name='state']");
	public By PostalCode = By.xpath("//input[@name='postalCode']");
	public By Country = By.xpath("//select[@name='country']");
	public By Email = By.xpath("//input[@id='email']");
	public By Password = By.xpath("//input[@name ='password']");
	public By confirmPassword = By.xpath("//input[@name ='confirmPassword']");
	public By registerButtoin = By.xpath("//input[@name ='register']");
	public By registerSuccessFully = By.xpath("//b[contains(text(),' Note: Your user name is')]");
	public By SignIn = By.xpath("//a[contains(text(),' sign-in ')]");

	public boolean clickonRegister() {
		try {
			WebElement register = wait.until(ExpectedConditions.visibilityOfElementLocated(Register));
			register.click();
			return true;
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
	}

	public boolean enterFirstName() {
		try {
			WebElement fName = wait.until(ExpectedConditions.visibilityOfElementLocated(FirstNmae));
			fName.clear();
			int k = random.nextInt(1000000000);
			fName.sendKeys("Pradip" + k);
			return true;
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}

	}

	public boolean enterLastName() {
		try {
			WebElement lName = wait.until(ExpectedConditions.visibilityOfElementLocated(LastNmae));
			lName.clear();
			int k = random.nextInt(1000000000);
			lName.sendKeys("Darji"+k);
			return true;
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
	}

	public boolean enterPhone() {
		try {
			WebElement phone = wait.until(ExpectedConditions.visibilityOfElementLocated(Phone));
			phone.clear();
			int k = random.nextInt(1000000000);
			String number = String.valueOf(k);
			phone.sendKeys(number);
			return true;
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
	}

	public boolean enteruserName() {
		try {
			WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(userName));
			username.clear();
			username.sendKeys("pradip.darji@softwebsolutions.com");
			return true;
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
	}

	public boolean enterAddress1() {
		try {
			WebElement add1 = wait.until(ExpectedConditions.visibilityOfElementLocated(Address1));
			add1.clear();
			add1.sendKeys("123 mian street");
			return true;
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
	}

	public boolean enterAddress2() {
		try {
			WebElement add2 = wait.until(ExpectedConditions.visibilityOfElementLocated(Address2));
			add2.clear();
			add2.sendKeys("XYZ Park");
			return true;
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
	}

	public boolean enterCity() {
		try {
			WebElement city = wait.until(ExpectedConditions.visibilityOfElementLocated(City));
			city.clear();
			city.sendKeys("Ahmedabad");
			return true;
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
	}

	public boolean enterState() {
		try {
			WebElement state = wait.until(ExpectedConditions.visibilityOfElementLocated(State));
			state.clear();
			state.sendKeys("Gujarat");
			return true;
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
	}

	public boolean enterPostalCode() {
		try {
			WebElement pin = wait.until(ExpectedConditions.visibilityOfElementLocated(PostalCode));
			pin.clear();
			pin.sendKeys("12345");
			return true;
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
	}

	public boolean selectCountry() {
		try {
			WebElement country = wait.until(ExpectedConditions.visibilityOfElementLocated(Country));
			Select cindia = new Select(country);
			cindia.selectByVisibleText("INDIA");
			Thread.sleep(5000);
			return true;
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
	}

	public boolean enterEmail() {
		try {
			WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(Email));
			email.clear();
			int k = random.nextInt(1000000000);
			email.sendKeys("Softweb135"+k);
			s2 = email.getAttribute("value");
			props.put("UserName", s2);
			props.store(outputStrem, "Created By Pradip Darji");
			return true;
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
	}

	public boolean enterPassword() {
		try {
			WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(Password));
			password.clear();
			password.sendKeys("Softweb135");
			s3 = password.getAttribute("value");
			props.put("Password", s3);
			props.store(outputStrem, "Created By Pradip Darji");
			return true;
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
	}

	public boolean enterconfirmPassword() {
		try {
			WebElement cpassword = wait.until(ExpectedConditions.visibilityOfElementLocated(confirmPassword));
			cpassword.clear();
			cpassword.sendKeys("Softweb135");
			return true;
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
	}

	public boolean clickOnSubmit() {
		try {
			WebElement registerbuttoin = wait.until(ExpectedConditions.visibilityOfElementLocated(registerButtoin));
			registerbuttoin.click();
			return true;
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
	}

	public boolean verifyUserRegisteration() {
		try {
			WebElement registermessage = wait
					.until(ExpectedConditions.visibilityOfElementLocated(registerSuccessFully));
			s1 = registermessage.getText();
			System.out.println(s1);
			if (s1.contains(s2)) {
				System.out.println("Registration done successfully completed");
			} else {
				System.out.println("Oops!Registration has not completed");
			}
			return true;
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
	}

	public boolean clickonSignIn() {
		try {
			WebElement signin = wait.until(ExpectedConditions.visibilityOfElementLocated(SignIn));
			signin.click();
			return true;
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
	}
}
