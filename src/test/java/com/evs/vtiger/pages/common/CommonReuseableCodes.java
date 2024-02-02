package com.evs.vtiger.pages.common;

import com.evs.utils.WebUtils;

public class CommonReuseableCodes extends CommoncodesOR {
	private WebUtils webutil;

	public CommonReuseableCodes(WebUtils wt, String browser) {
		super(wt, browser);
		webutil = wt;

	}

	public void createTestReport(String testcasename) {

		webutil.createTestReport(testcasename);
	}

	public void login() {
		webutil.implicityWaitSecond(30);
		webutil.maximize();
		webutil.openUrl("http://localhost:8888/");
		webutil.inputValue(getUsernameTB(), "admin");
		webutil.inputValue(getUserpassTB(), "admin");
		webutil.click(getLoginBT());

	}

	public void logout() {
		webutil.click(getLogoutBT());
	}
//common button
	public void clickOnSaveBT() {
		webutil.click(getClickOnSaveBT());

	}

	public void clickOnDeleteBT() {
		webutil.click(getDeleteBT());
	}

	public void clickOnEditBT() {
		webutil.click(getEditBT());
	}
// click on main module
	public void clickOnMarketingLK() {
		webutil.click(getMarketingLK());

	}

	public void clickOnSalesLK() {
		webutil.click(getSalesLK());

	}

	public void clickOnAnalyticsLK() {
		webutil.click(getAnalyticsLK());

	}

	public void clickOnInventoryLK() {
		webutil.click(getInventoryLK());

	}

	public void clickOnSupportLK() {
		webutil.click(getSupportLK());

	}

	public void clickOnToolstLK() {
		webutil.click(getToolsLK());

	}
	// sub module
	public void clickOnAccountsSLK() {
		webutil.click(getClickAccountsSLK());
	}
	public void clickOnLeadsSLK() {
		webutil.click(getClickLeadsSLk());
	}
}
