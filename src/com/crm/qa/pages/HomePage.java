package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.BaseTest;

public class HomePage extends BaseTest{

	@FindBy(xpath = "(//div[@class='popup_menu_arrow'])[3]")
	private WebElement helpdd;
	
	@FindBy(xpath = "//a[.='About actiTIME']")
	private WebElement aboutat;
	
	@FindBy(xpath = "//span[@class='productVersion']")
	private WebElement version;
	
	@FindBy(xpath = "//img[@title='Close']")
	private WebElement closeb;
	
	@FindBy(id="logoutLink")
	private WebElement logout;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateHomePageTitle() {
		return driver.getTitle();
	}
	public String getVersion() {
		helpdd.click();
		aboutat.click();
		return version.getText();
	}
	public void clickclose() {
		closeb.click();
	}
	public void clicklogout() {
		logout.click();
	}
}