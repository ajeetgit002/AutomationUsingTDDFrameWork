package com.evs.vtiger.pages.common;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.evs.utils.WebUtils;

import lombok.Getter;

@Getter
public class CommoncodesOR {

	public CommoncodesOR(WebUtils wt, String browser) {

		PageFactory.initElements(wt.getDriver(browser), this);
	}

	@FindBy(xpath = "//input[@name='user_name']")
	private WebElement usernameTB;

	@FindBy(xpath = "//input[@name='user_password']")
	private WebElement userpassTB;
	@FindBy(xpath = "//input[@name='Login']")
	private WebElement loginBT;

	@FindBy(xpath = "//a[text()='Sign Out']")
	private WebElement logoutBT;
	
	//common button
	@FindBy(xpath = "//div[@id='basicTab']//table[@class='dvtContentSpace']/descendant-or-self::div[1]//input[@title='Save [Alt+S]']")
	private WebElement clickOnSaveBT;

	@FindBy(xpath = "//table[@class='small']//input[@class='crmbutton small delete']")
	private WebElement deleteBT;

	@FindBy(xpath = "//table[@class='small']//input[@value='Mass Edit']")
	private WebElement editBT;
// module
	@FindBy(xpath = "//a[text()='Marketing']")
	private WebElement marketingLK;

	@FindBy(xpath = "//a[text()='Sales']")
	private WebElement salesLK;
	@FindBy(xpath = "//a[text()='Support']")
	private WebElement supportLK;
	@FindBy(xpath = "//a[text()='Analytics']")
	private WebElement analyticsLK;
	@FindBy(xpath = "//a[text()='Inventory']")
	private WebElement inventoryLK;

	@FindBy(xpath = "//a[text()='Tools']")
	private WebElement toolsLK;
// sub module 
	@FindBy(xpath = "//table[@class='level2Bg']//a[text()='Accounts']")
	private WebElement clickAccountsSLK;
	@FindBy(xpath = "//table[@class='level2Bg']//a[text()='Leads']")
	private WebElement clickLeadsSLk;
}
