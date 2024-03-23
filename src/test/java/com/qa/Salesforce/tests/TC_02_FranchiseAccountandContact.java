package com.qa.Salesforce.tests;

import org.testng.annotations.Test;

import com.qa.Salesforce.base.BaseTest;

public class TC_02_FranchiseAccountandContact extends BaseTest {
	// before execution change the user to JAMES GREEN from setup page,base test and
	// also from iframe
	@Test
	public void Franchise() throws InterruptedException {
		homepage.Accounts();
		accPage.clickNew();
		accPage.selecType();
		accPage.CreateFranchiseAcc("abc3cd", "45454323122");
		accPage.Scrollingdown();
		accPage.ClickcontactLinkk();
		// accPage.CreatenewContact();
		accPage.SelectFranCHiseContact();
		accPage.CreateContactFranchise("fjedi");
		

	}
}
