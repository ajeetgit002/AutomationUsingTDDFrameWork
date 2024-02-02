package com.evs.vtiger.pages.leads;

import com.evs.utils.WebUtils;

import junit.framework.Assert;

public class LeadsReuseableCodes extends CreateLeadsReuseableCodesOR {
	private WebUtils webutil;

	public LeadsReuseableCodes(WebUtils wt) {
		super(wt);
		this.webutil = wt;
	}

	public void createNewLeadsPage(String nameTitle, String firstname, String lastname, String companyname,
			String phone,  String email, String street, String postbox,  String city,
			String state,  String descri) {
		
		webutil.click(getCreateNewLeadiconBT());
		String actheader=webutil.getText(getCreateleadsPageHeaderINT());
		webutil.verifyString(actheader, "Creating New Lead");
		webutil.selectByValue(getNametitleDD(), nameTitle);
		webutil.inputValue(getFirstnameTB(), firstname);
		webutil.inputValue(getLastnameTB(), lastname);
		webutil.inputValue(getCompanyTB(), companyname);
		webutil.inputValue(getRoletitleTB(), "QA Engineer");
		webutil.selectByValue(getLeadssourceDD(), "Public Relations");
		webutil.selectByValue(getLeadstatusDD(), "Pre Qualified");
		webutil.inputValue(getPhoneTB(), phone);
		webutil.inputValue(getFaxTB(), "5545-854-558");
		webutil.inputValue(getEmailTB(), email);
		webutil.inputValue(getStreetTB(), street);
		webutil.inputValue(getPoboxTB(), postbox);
		webutil.inputValue(getPostelcodeTB(), "222162");
		webutil.inputValue(getCityTB(), city);
		webutil.inputValue(getCountryTB(), "India");
		webutil.inputValue(getStateTB(), state);
		webutil.inputValue(getDescriptionTB(), descri);

	}

	public void verifyMarketingLeadsAccounts(String uniqueHeaderName, String valueForVrf) {

		
		 webutil.verifyTableDataByHeaderName("//table[@class='lvt small']", uniqueHeaderName,
				valueForVrf);
		

	}

}
