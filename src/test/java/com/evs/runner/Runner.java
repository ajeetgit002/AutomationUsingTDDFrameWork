package com.evs.runner;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.evs.test.MarketingTestScripts;
import com.evs.test.SalesTestScript;
import com.evs.utils.WebUtils;

public class Runner {
	

	@Test
	public void Test() {
		WebUtils wt = new WebUtils();
		wt.createExtentReport();
		// Marketing scripts

		MarketingTestScripts mrkts1 = new MarketingTestScripts();
		mrkts1.vt001MarketingCreateNewLeads();
		MarketingTestScripts mrkts2 = new MarketingTestScripts();
		mrkts2.vtoo2VerifyMarketingLeads();
		MarketingTestScripts mrkts = new MarketingTestScripts();
		mrkts.vt004CreateNewMarketingAccount();
		SalesTestScript crnsll = new SalesTestScript();
		crnsll.vt003CreateSalesLead();
	}

	



}
