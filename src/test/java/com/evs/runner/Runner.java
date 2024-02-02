package com.evs.runner;

import org.testng.annotations.Test;

import com.evs.test.MarketingTestScripts;
import com.evs.test.SalesTestScript;
import com.evs.utils.WebUtils;

public class Runner {
 @Test
	public void Test() throws InterruptedException {
		WebUtils wt=new WebUtils();
		wt.createExtentReport();
		//Marketing scripts 
		
		MarketingTestScripts mrkts=new MarketingTestScripts();
		mrkts.vt001MarketingCreateNewLeads();
		Thread.sleep(3000);
		mrkts.vtoo2VerifyMarketingLeads();
		mrkts.vt004CreateNewMarketingAccount();
		
	////  Sales Scripts
		
		
		SalesTestScript crnsll=new SalesTestScript();
		crnsll.vt003CreateSalesLead();
//	
		}

}
