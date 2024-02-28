package com.pageActionClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gL.helperClass;

public class GL_Login_Page extends helperClass {

	public GL_Login_Page() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "pre-username")
	private WebElement userName;

	@FindBy(id = "proceed-username-button")
	private WebElement next;

	@FindBy(name = "passwordEntry")
	private WebElement pW;

	@FindBy(id = "login-button")
	private WebElement login;
	
	public WebElement getUserName() {
		return userName;
	}

	public WebElement getNext() {
		return next;
	}

	public WebElement getpW() {
		return pW;
	}

	public WebElement getLogin() {
		return login;
	}

	

}
