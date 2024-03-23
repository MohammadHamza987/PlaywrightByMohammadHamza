package com.qa.Salesforce.tests;

import org.testng.annotations.Test;

import com.qa.Salesforce.base.BaseTest;

public class TC_01_CreationofProsOpportunity extends BaseTest {

	@Test
	public void loginpagetitleTest() {
		String actualTitle = loginpage.getLoginPageTitle();
		System.out.println(actualTitle);

		// Assert.assertEquals(actualTitle, "[]");
	}

	@Test
	public void creationofOpp() throws InterruptedException {
		homepage.Opportunities();
		oppPage.clickNew();
		oppPage.createPros("opptc2x", "Demohamna151", "90", "23/12/2023", "1000", "1000");
		
		// trying to commit
		// third commit
		//fourth commit
	}

}
