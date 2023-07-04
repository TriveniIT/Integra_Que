package com.que.Baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest{
	@FindBy(xpath="//input[@id='input-email']") WebElement enteremail;

	@FindBy(xpath="//input[@id='input-password']") WebElement enterPass;

	@FindBy(xpath="//button[text()='Login']") WebElement loginBtn;

	public void loginPage() {
		
		
	} 
	
	WebDriver driver;
	@Test()
	public void validateTest() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login&language=en-gb");
		enteremail.sendKeys("aravindGidde@gmail.com");
		enterPass.sendKeys("aravind@123");
		loginBtn.click();
	}
	
	
}
