// package com.qa.Salesforce.pages; // Removed the package declaration as this is Javascript

class HomePage {
    constructor(page) {
      this.page = page;
      this.objSelector = page.locator('//span[text()="ShowNavigationMenu"]');
      this.Casesobj = page.locator('//span[text()="Cases"]');
      this.Opportunitiesobj = page.locator('//span[text()="Opportunities"]');
      this.Accountsobj = page.locator('//span[text()="Accounts"]');
      this.Leadsobj = page.locator('//span[text()="Leads"]');
    }
  
    async selectobj() {
      await this.page.click(this.objSelector);
    }
  
    async Cases() {
      await this.page.click(this.Casesobj);
    }
  
    async Opportunities() {
      await this.page.click(this.Opportunitiesobj);
    }
  
    async Leads() {
      await this.page.click(this.Leadsobj);
    }
  
    async Accounts() {
      await this.page.click(this.Accountsobj);
    }
  }
  
  module.exports = HomePage;