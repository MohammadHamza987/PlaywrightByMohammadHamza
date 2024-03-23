package com.qa.Salesforce.pages;

import com.microsoft.playwright.Page;

public class HomePage {
	private Page page;

	// String locators
	String objSelector = "//span[text()='Show Navigation Menu']";
	String Casesobj = "//span[text()='Cases']";
	String Opportunitiesobj = "//span[text()='Opportunities']";
	String Accountsobj = "//span[text()='Accounts']";
	String Leadsobj = "//span[text()='Leads']";

	// Page constructor
	public HomePage(Page page) {
		this.page = page;
	}

	// Page actions
	public void selectobj() {
		page.click(objSelector);
	}

	public void Cases() {
		page.click(Casesobj);
	}

	public Opportunity Opportunities() {
		page.click(Opportunitiesobj);
		return new Opportunity(page);
	}

	public void Leads() {
		page.click(Leadsobj);
	}

	public void Accounts() {
		page.click(Accountsobj);
	}

}
