package com.pageAction;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class LoginPage extends BaseClass {

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "pre-username") // id for username
	private WebElement userName;

	@FindBy(id = "proceed-username-button") // id for button
	private WebElement next;

	@FindBy(id = "SubmitLogin") // id for user login
	private WebElement contine;

	@FindBy(xpath = "//input[@type='password']") // xpath for password
	private WebElement password;

	@FindBy(xpath = "//button[@type='button']") // xpath for sigin button
	private WebElement signIN;

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getNext() {
		return next;
	}

	public WebElement getContine() {
		return contine;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSignIN() {
		return signIN;
	}

}
