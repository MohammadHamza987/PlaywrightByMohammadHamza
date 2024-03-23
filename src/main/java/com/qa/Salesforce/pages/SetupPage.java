package com.qa.Salesforce.pages;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Page;

public class SetupPage {
	private Page page;
	// private Page page1;

	// String locators
	String enteruser = "//input[@title='Search Setup']";
	String selectuser = "//a[text()='Yi Zhou']";
	String clickonlogin = "(//input[@name='login'])[1]";

	// page Contructor
	public SetupPage(Page page) {
		this.page = page;
	}

//actions
	public void enterb2buser(String b2b) throws InterruptedException {
		// Page popup = page.waitForPopup(() -> {
		// page.click("a[target='blank']");
		// });
		// popup.waitForLoadState();
		page.navigate("");
		Thread.sleep(4000);
		page.click(enteruser);
		page.fill(enteruser, b2b);
		// page.keyboard().press("ArrowDown");
		// page.keyboard().press("ArrowDown");
		Thread.sleep(5000);
		page.keyboard().press("Enter");
		page.keyboard().press("Enter");
		Thread.sleep(3000);
		page.click("//span[text()='Users']");
		
		//page.click(
		//		"//div[@class='resultsItem slds-col slds-no-flex slds-m-bottom_small']//th[@aria-label='Last Modified By'][normalize-space()='Last Modified By']");

	}

	public void clickonbronte() {
		page.click(selectuser);
	}

	public HomePage loginasB2B() throws InterruptedException {
		Thread.sleep(5000);
		page.frameLocator("//iframe[contains(@title,'User: Yi Zhou ~ Salesforce - Unlimited Edition')]")
				.locator(clickonlogin).click();
		// page.click(clickonlogin);
		return new HomePage(page);
	}
}
