package com.pageAction;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class Test_Room_Userguide extends BaseClass {

	public Test_Room_Userguide() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='room-name']") // xpath for click Test Room
	private WebElement testRoom;
	
	

	@FindBy(xpath = "//*[contains(@class,'qa-username')]") // xpath for click user name 
	private WebElement clickUserName;

	@FindBy(xpath = "//*[contains(@class,'k-button-icon fa fa-book ')]")//xpath for click userguider
	private WebElement userGuide;

	public WebElement getTestRoom() {
		return testRoom;
	}

	public WebElement getClickUserName() {
		return clickUserName;
	}

	public WebElement getUserGuide() {
		return userGuide;
	}

}
