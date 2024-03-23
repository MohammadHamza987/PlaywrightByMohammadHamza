package com.qa.Salesforce.pages;

import com.microsoft.playwright.Page;

public class Opportunity {
	private Page page;
	// String Locator
	String newbtn = "//div[text()='New']";
	String GrowthOpp = "//span[text()='B2B Growth Opportunity'][@class='slds-form-element__label topdown-radio--label']";
	String ProspectiveOpp = "//span[text()='B2B Prospective Customer Opportunity'][@class='slds-form-element__label topdown-radio--label']";
	String MigrationOpp = "//span[text()='B2B Migration Opportunity'][@class='slds-form-element__label topdown-radio--label']";
	String Nextbtn = "//span[text()='Next']";
	String ProsoppName = "//input[@name='Name']";
	String ProsaccountName = "(//input[@class='slds-combobox__input slds-input'])[2]";
	String Prosstage = "//button[@aria-label=\"Stage - Current Selection: --None--\"]";
	String Stageselect="//span[text()='Presentation Completed']";
	String ProswinPercent = "//input[@name='B2B_Likelihood_of_Win__c']";
	String Prosdate = "//input[@name='CloseDate']";
	String Onlinevalue = "//input[@name='B2B_opportunity_online_value__c']";
	String InStoreValue="//input[@name='B2B_In_Store_Value__c']";
	String prosSave = "//button[text()='Save']";

	// Page constructor

	public Opportunity(Page page) {
		this.page = page;
	}

	// page actions
	public void clickNew() {
		page.click(newbtn);

	}

	public void createPros(String oppNa, String accNa, String ProswinPer, String Prosdateenter, String Prosopval, String InStore)
			throws InterruptedException {
		page.click(ProspectiveOpp);
		page.click(Nextbtn);
		page.fill(ProsoppName, oppNa);
		//page.fill(ProsaccountName, accNa);
		Thread.sleep(3000);
		//page.keyboard().press("ArrowDown");
		//page.keyboard().press("ArrowDown");
		//page.keyboard().press("ArrowDown");

		//page.keyboard().press("Enter");
		
		
		page.click(Prosstage);
		page.click(Stageselect);
		//page.keyboard().press("ArrowDown");
		//page.keyboard().press("ArrowDown");
		//page.keyboard().press("Enter");
		
		page.fill(ProswinPercent, ProswinPer);
		page.fill(Prosdate, Prosdateenter);
		page.fill(Onlinevalue, Prosopval);
		page.fill(InStoreValue, InStore);

		page.click(prosSave);
		

	}

	public void createmigrat() {
		page.click(MigrationOpp);
		page.click(Nextbtn);
	}

	public void creategrowth() {
		page.click(GrowthOpp);
		page.click(Nextbtn);
	}

}
