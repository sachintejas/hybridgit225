package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class Loginpage extends BaseClass{
	WebDriver driver=null;
	

	@FindBy(id = "email")
	WebElement username;

	@FindBy(id = "password")
	WebElement password;

	@FindBy(xpath = "//button")
	WebElement loginBtn;

	public  Loginpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this); // initialize @FindBy
	}

	public void loginToApplication(String uname, String pass) {
		username.sendKeys(uname);
		password.sendKeys(pass);
		loginBtn.click();
	}

	public Dashboardpage validLogin() {
		username.sendKeys("kiran@gmail.com");
		password.sendKeys("123456");
		loginBtn.click();
		return new Dashboardpage(driver);
	}

}
