package com.qa.Salesforce.pages;

import com.microsoft.playwright.Mouse;
import com.microsoft.playwright.Page;

public class AccountPage {
	private Page page;
//String Locators
	String newbtn = "//div[text()='New']";
	String selectFranchise = "//span[text()='B2B Franchise Customer Account'][@class='slds-form-element__label topdown-radio--label']";
	String Nextbtn = "//span[text()='Next']";
	String AccName = "//input[@name='Name']";
	String Vertical = "//button[@aria-label='Vertical - Current Selection: --None--'][@class='slds-combobox__input slds-input_faux fix-slds-input_faux slds-combobox__input-value']";
	String SelectLearn = "//span[text()='Learn']";
	String SecondryBusness = "//button[@aria-label='Secondary (Type of Business) - Current Selection: --None--']";
	String SelectChildcare = "//span[text()='Childcare']";
	String ABN = "//input[@name='ABN__c']";
	String AccSAve = "//button[text()='Save']";
	String NeContactLink = "//span[@title='Contacts'][@class='slds-truncate slds-m-right--xx-small']";
	String Newcontact = "//button[@name='NewContact']";
	String SelectFranchiseeContact = "//span[text()='B2B Franchise Customer Contact'][@class='slds-form-element__label topdown-radio--label']";
	String ContactDD = "//lightning-button-menu[@data-target-reveals='sfdc:StandardButton.Contact.NewContact']//lightning-primitive-icon[@variant='bare']";
	String NewbtnContact = "//span[text()='New']";
	String ConactName = "//input[@name='lastName']";
	String saveFcontact = "//button[@name='SaveEdit']";
	// String CaseDD="(//button[@class='slds-button slds-button_icon-border-filled
	// slds-button_icon-x-small'])[2]";
	String AccLink = "(//span[text()='abc3cd'])[2]";
	String OppDD = "//lightning-button-menu[@data-target-reveals='sfdc:StandardButton.Opportunity.New']//lightning-primitive-icon[@variant='bare']";
	String OppLink = "//span[text()='Opportunities']";
	String NewbtnOpp = "//button[text()='New']";
	// Page constructor

	public AccountPage(Page page) {
		this.page = page;
	}

	// Page actions
	public void clickNew() {
		page.click(newbtn);

	}

	public void selecType() {
		page.click(selectFranchise);
		page.click(Nextbtn);
	}

	public void CreateFranchiseAcc(String AccountName, String ABNno) {
		page.fill(AccName, AccountName);
		page.click(Vertical);
		page.click(SelectLearn);
		// page.keyboard().press("ArrowDown");
		// page.keyboard().press("ArrowDown");
		// page.keyboard().press("ArrowDown");
		// page.keyboard().press("Enter");
		page.click(SecondryBusness);
		page.click(SelectChildcare);
		// page.keyboard().press("ArrowDown");
		// page.keyboard().press("ArrowDown");
		// page.keyboard().press("ArrowDown");
		// page.keyboard().press("Enter");
		page.fill(ABN, ABNno);
		page.click(AccSAve);

	}

	public void Scrollingdown() throws InterruptedException {
		Thread.sleep(5000);

		page.mouse().wheel(0, 2500);

	}

	public void ClickcontactLinkk() {
		page.click(ContactDD);
		page.click(NewbtnContact);

		// page.click(NeContactLink);
	}

	// public void CreatenewContact() {
	// page.click(Newcontact);
	// }

	public void SelectFranCHiseContact() {
		page.click(SelectFranchiseeContact);
		page.click(Nextbtn);
	}

	public void CreateContactFranchise(String Fname) {
		page.fill(ConactName, Fname);
		page.click(saveFcontact);
	}

	public void AccountLink() {
		page.click(AccLink);
	}

	public void ScrollingdowntoOpp() throws InterruptedException {
		Thread.sleep(3000);

		page.mouse().wheel(0, 1500);

	}

	public Opportunity OpportunityDD() {
		page.click(OppLink);
		page.click(NewbtnOpp);
		return new Opportunity(page);
	}

}
