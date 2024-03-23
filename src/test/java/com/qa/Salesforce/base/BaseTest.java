package com.qa.Salesforce.base;

import java.util.Properties;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.microsoft.playwright.Page;
import com.qa.Salesforce.factory.PlaywrightFactory;
import com.qa.Salesforce.pages.AccountPage;
import com.qa.Salesforce.pages.AdminPage;
import com.qa.Salesforce.pages.HomePage;
import com.qa.Salesforce.pages.LoginPage;
import com.qa.Salesforce.pages.Opportunity;
import com.qa.Salesforce.pages.SetupPage;

public class BaseTest {
	PlaywrightFactory pf;
	Page page;
	protected Properties prop;

	protected LoginPage loginpage;
	protected AdminPage admin;
	protected SetupPage setuppage;
	protected HomePage homepage;
	protected Opportunity oppPage;
	protected AccountPage accPage;

	@BeforeTest
	public void setup() throws InterruptedException {
		pf = new PlaywrightFactory();
		prop = pf.init_prop();

		page = pf.initBrowser(prop);
		// whenever anyone wants to debug just uncomment page.pause
		// page.pause();

		loginpage = new LoginPage(page);// objects
		admin = new AdminPage(page);
		setuppage = new SetupPage(page);
		homepage = new HomePage(page);
		oppPage = new Opportunity(page);
		accPage = new AccountPage(page);

		loginpage.logintosalesforce(prop.getProperty("username"), prop.getProperty("password"));
		admin.clickdd();
		setuppage.enterb2buser(" ");
		setuppage.clickonbronte();

		setuppage.loginasB2B();
		homepage.selectobj();

	}

	@AfterTest
	public void tearDown() {
		page.context().browser().close();
	}

}
