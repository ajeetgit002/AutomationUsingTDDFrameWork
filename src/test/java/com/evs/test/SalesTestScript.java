package com.evs.test;

import com.evs.utils.WebUtils;
import com.evs.vtiger.pages.common.CommonReuseableCodes;
import com.evs.vtiger.pages.leads.LeadsReuseableCodes;

public class SalesTestScript {
	WebUtils wt;
	CommonReuseableCodes cc;
	LeadsReuseableCodes slleds;

	public void vt003CreateSalesLead() {
		wt = new WebUtils();
		cc = new CommonReuseableCodes(wt, "firefox");
		slleds = new LeadsReuseableCodes(wt);
		cc.createTestReport("vt003CreateSalesLead");
		cc.login();
		cc.clickOnSalesLK();
		cc.clickOnLeadsSLK();
		
		slleds.createNewLeadsPage("Mr.", "AjeetKuamr", "Yadav", "Microsoft", "54115554455", "ajhgds@gmail.comslleds",
				"Adampur ", "Nigoh", "Jaunpur", "Uttar Pradesh", "jdghsabdhdgyusgadhbggxvgsavxgavgavsg");

		cc.clickOnSaveBT();
		wt.tearDown_Quit();
		wt.flushReport();

	}

}
