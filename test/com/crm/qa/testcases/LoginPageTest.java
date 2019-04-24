package com.crm.qa.testcases;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.crm.qa.base.BaseTest;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;
public class LoginPageTest extends BaseTest {
	LoginPage lp;
	HomePage hp;

	public LoginPageTest() {
		super();
	}
	@BeforeMethod
	public void setUp() {
		initialization();
		lp  = new LoginPage();
		hp=lp.Login(prob.getProperty("username"), prob.getProperty("password"));
	}

	@Test(priority = 1)
	public void loginPageTitleTest() {
		String title = lp.validateLoginPageTitle();
		Assert.assertEquals(title, "actiTIME - Login");
	}

	@Test(priority = 2)
	public void loginTest() {
		hp = lp.Login(prob.getProperty("username"), prob.getProperty("password"));
	}
	
	@AfterMethod
	public void tearDown(ITestResult r) {
		int status = r.getStatus();
		String testname=r.getName();
		if(status==2) {
		TestUtil.getphoto(driver);
		Reporter.log(testname);
		}
		driver.quit();
	}
}
