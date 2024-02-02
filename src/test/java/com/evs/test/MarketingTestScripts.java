package com.evs.test;

import org.testng.annotations.Test;

import com.evs.reuseableCode.accounts.CreateNewAccounts;
import com.evs.utils.WebUtils;
import com.evs.vtiger.Marketing.pages.MarkeingReuseableCodes;
import com.evs.vtiger.pages.common.CommonReuseableCodes;
import com.evs.vtiger.pages.leads.LeadsReuseableCodes;

public class MarketingTestScripts {
	WebUtils wt;
	CommonReuseableCodes cc;
	LeadsReuseableCodes crtmrkLeads;
	MarkeingReuseableCodes mrktrcod;

	public MarketingTestScripts() {
		wt = new WebUtils();
		cc = new CommonReuseableCodes(wt, "chrome");
	
		mrktrcod = new MarkeingReuseableCodes(wt);
		crtmrkLeads = new LeadsReuseableCodes(wt);
	}

	public void vt001MarketingCreateNewLeads() {
		
		cc.createTestReport("vt001MarketingCreateNewLeads");
		cc.login();
		cc.clickOnMarketingLK();
		cc.clickOnLeadsSLK();
		mrktrcod.vrifyPageHeader("Marketing > Leads");
		
		crtmrkLeads.createNewLeadsPage("Mr.", "AjeetKumar", "Yadav", "google", "8454454454", "hsdgsg@gmail.com",
				"Adampur", "Nigoh", "222162", "Jaunpur", "India");
		cc.clickOnSaveBT();
		
		wt.flushReport();

	}

	public void vtoo2VerifyMarketingLeads() {
	
		cc.createTestReport("vtoo2VerifyMarketingLeads");
		
		cc.clickOnMarketingLK();
		cc.clickOnLeadsSLK();
		mrktrcod.vrifyPageHeader("Marketing > Leads");
		crtmrkLeads.verifyMarketingLeadsAccounts("First Name", "sadhu");

		wt.flushReport();
	}

	public void vt004CreateNewMarketingAccount() {
		cc.createTestReport("vt004CreateNewMarketingAccount");
		
		cc.clickOnMarketingLK();
		cc.clickOnAccountsSLK();
		mrktrcod.vrifyPageHeader("Marketing > Accounts");
		CreateNewAccounts crnmAcc = new CreateNewAccounts(wt);
		crnmAcc.createNewAccounts("Pintu", "5548485", "asdj@gmail.com", "adampur");
		cc.clickOnSaveBT();
		wt.tearDown_Quit();
		wt.flushReport();
	}

}
