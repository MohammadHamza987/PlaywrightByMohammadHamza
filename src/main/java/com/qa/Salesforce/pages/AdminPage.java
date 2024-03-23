package com.qa.Salesforce.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.SelectOption;

public class AdminPage {
	private Page page;

	// String locators
	// String clkondropdown = "//div[@id='148:219;a']";
	String clkondropdown = "//div[@data-target-selection-name='373d68853825455b9166869792148e21']";
	String setupbtn = "//li[@id='related_setup_app_home']";

	// page constructor
	public AdminPage(Page page) {
		this.page = page;
	}

	// page actions
	public SetupPage clickdd() throws InterruptedException {
		page.click(clkondropdown);
		Thread.sleep(5000);
		page.click(setupbtn);
		Thread.sleep(3000);
		page.bringToFront();// for switching to parent tab
	
		
		return new SetupPage(page);
	}

}
