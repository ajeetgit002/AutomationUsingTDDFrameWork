package com.evs.reuseableCode.accounts;

import com.evs.utils.WebUtils;

public class CreateNewAccounts extends CreateNewAccoutsOR {
	private WebUtils webutil;

	public CreateNewAccounts(WebUtils wt) {
		super(wt);
		this.webutil = wt;
		
	}

	public void createNewAccounts(String name,String phone,String email,String address) {
	
		
		
		webutil.click(getClickNewBT());
		String ecpectedh=webutil.getText(getNewaccpageheaderINT());
		webutil.verifyString(ecpectedh, "Creating New Account");
		webutil.inputValue(getAcnameTB(),name);
		webutil.inputValue(getWebsiteTB(), "www.google.com");
		webutil.inputValue(getTickerTB(), "KJHY");
		webutil.inputValue(getPhoneTB(), phone);
		webutil.inputValue(getFaxTB(), "5858-4484-55");
		webutil.inputValue(getEmailTB(), email);
		webutil.inputValue(getAddrssTB(), address);
		webutil.inputValue(getPoboxTB(), "Nigoh");
		webutil.inputValue(getCityTB(), "Jaunpur");
		webutil.inputValue(getStateTB(), "Uttar Pradesh");
		webutil.inputValue(getPiccodeTB(), "222162");
		webutil.inputValue(getContTB(), "INDIA");
		webutil.inputValue(getDecripTB(), "Hi  djdnjcnjdcndcjndjcndcj");

	}
}
