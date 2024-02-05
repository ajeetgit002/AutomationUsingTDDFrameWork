package com.evs.runner;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.evs.test.MarketingTestScripts;
import com.evs.test.SalesTestScript;
import com.evs.utils.WebUtils;

public class Runner {
	@BeforeClass
	public void reports() {
		WebUtils wt = new WebUtils();
		wt.createExtentReport();
	}

	@Test(priority = 0)
	public void Test() {

		// Marketing scripts

		MarketingTestScripts mrkts = new MarketingTestScripts();
		mrkts.vt001MarketingCreateNewLeads();

	}

	@Test(priority = 1)
	public void marketingVerificationtest() {
		MarketingTestScripts mrkts = new MarketingTestScripts();
		mrkts.vtoo2VerifyMarketingLeads();
	}

	@Test(priority = 2)
	public void createAccountTest() {
		MarketingTestScripts mrkts = new MarketingTestScripts();
		mrkts.vt004CreateNewMarketingAccount();
	}

	@Test(priority = 3)
	public void salesText() {
		SalesTestScript crnsll = new SalesTestScript();
		crnsll.vt003CreateSalesLead();
//	

	}

}
