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
	
	@Test
	public void Test() {
		
		// Marketing scripts

		MarketingTestScripts mrkts = new MarketingTestScripts();
		mrkts.vt001MarketingCreateNewLeads();

	}

	@Test
	public void marketingVerificationtest() {
		MarketingTestScripts mrkts = new MarketingTestScripts();
		mrkts.vtoo2VerifyMarketingLeads();
	}

	@Test 
	public void createAccountTest() {
		MarketingTestScripts mrkts = new MarketingTestScripts();
		mrkts.vt004CreateNewMarketingAccount();
	}

@Test
	public void salesText() {
		SalesTestScript crnsll = new SalesTestScript();
		crnsll.vt003CreateSalesLead();
//	

	}

}
