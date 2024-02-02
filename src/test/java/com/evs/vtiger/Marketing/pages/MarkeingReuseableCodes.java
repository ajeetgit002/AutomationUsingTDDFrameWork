package com.evs.vtiger.Marketing.pages;

import com.evs.utils.WebUtils;

public class MarkeingReuseableCodes extends MarkeingReuseableCodesOR {
	private WebUtils webutil;

	public MarkeingReuseableCodes(WebUtils wt) {
		super(wt);
		this.webutil = wt;
	}
	public void vrifyPageHeader(String expected) {
		
		String actheader=webutil.getText(getAccpageheaderINT());
		webutil.verifyString(actheader, expected);
	}
	

}
