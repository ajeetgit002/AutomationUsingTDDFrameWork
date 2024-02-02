package com.evs.vtiger.Marketing.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.evs.utils.WebUtils;

import lombok.Getter;
@Getter
public class MarkeingReuseableCodesOR {

	public MarkeingReuseableCodesOR(WebUtils wt){
		PageFactory.initElements(wt.getDriver(), this);
	}
	
	
	@FindBy(xpath = "//td[text()='Marketing > ']")
	private WebElement accpageheaderINT;
}
