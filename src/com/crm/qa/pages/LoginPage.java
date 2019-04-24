package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.BaseTest;

public class LoginPage extends BaseTest{
	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(name="pwd")
	private WebElement password;
	
	@FindBy(xpath = "//div[.='Login ']")
	private WebElement loginbt;
	
	@FindBy(id="keepLoggedInCheckBox")
	private WebElement checkb;
	
	@FindBy(id="logoContainer")
	private WebElement Logoi;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean validateActLogo() {
		return Logoi.isDisplayed();
	}
	
	public HomePage Login(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginbt.click();
		return new HomePage();
	}
}