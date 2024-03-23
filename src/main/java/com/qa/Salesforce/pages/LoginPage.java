package com.qa.Salesforce.pages;

import com.microsoft.playwright.Page;

public class LoginPage {
	private Page page;

	// 1. String Locators
	private String email = "//input[@name='username']";
	private String password = "//input[@name='pw']";
	private String loginbutton = "//input[@name='Login']";

	// 2. page contructor
	public LoginPage(Page page) {
		this.page = page;
	}

//3. Page actions/method
	public String getLoginPageTitle() {
		String title = page.title();
		System.out.println("Page title is :" + title);
		return title;
	}

	public String getloginpageURL() {
		String pageurl = page.url();
		System.out.println("Page url is :" + pageurl);
		return pageurl;

	}

	public AdminPage logintosalesforce(String username, String pass) {
		page.fill(email, username);
		page.fill(password, pass);
		page.click(loginbutton);
		return new AdminPage(page);

	}

}
