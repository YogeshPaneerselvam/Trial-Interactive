package com.pageAction;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class Feature_Light_Dark_Mode extends BaseClass {

	public Feature_Light_Dark_Mode() {

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@class='k-switch-thumb-wrap']") // xpath for click drak and light
	private WebElement drakLight;

	public WebElement getDrakLight() {
		return drakLight;
	}

}
