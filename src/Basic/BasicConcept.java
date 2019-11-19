package Basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasicConcept {
	public WebDriver driver;
	
	public BasicConcept() {
	}


	@BeforeTest
	public void setDriverPath() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pradip.darji\\Desktop\\Selenium SetUp\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/");
	}

	
	@Test
	public void verifyTitle() {	
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	}

	@AfterTest
	public void ClosetheBrowser() {
		driver.quit();
	}

	/*
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 * 
	 * 
	 * System.setProperty("webdriver.chrome.driver",
	 * "C:\\Users\\pradip.darji\\Desktop\\Selenium SetUp\\chromedriver.exe");
	 * WebDriver driver = new ChromeDriver();
	 * driver.get("http://newtours.demoaut.com/");
	 * driver.manage().window().maximize();
	 * driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 * System.out.println(driver.getTitle());
	 * System.out.println(driver.getCurrentUrl()); driver.quit();
	 * 
	 * }
	 */

}
