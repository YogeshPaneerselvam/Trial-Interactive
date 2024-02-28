package com.pageAction;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class Feature_Access_level extends BaseClass {

	public Feature_Access_level() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='room-name']") // xpath for click Test Room
	private WebElement testRoom;

	@FindBy(xpath = "//button[@id='mainMenuContextsButton']") // xpath for click production
	private WebElement production;

	@FindBy(xpath = "//span[@class='fa fa-users']") // xpath for click usermagament
	private WebElement usermagament;

	@FindBy(xpath = "//*[contains(@class,'vertical k-button k-button-md ')]") // xpath for click invite
	private WebElement invite;

	@FindBy(xpath = "//span[text()='Regular']") // xpath for click regular
	private WebElement regular;

	@FindBy(xpath = "//input[@id='email']") // xpath for email
	private WebElement email;

	@FindBy(id = "first") // xpath for first name
							
	private WebElement firstName;

	@FindBy(id = "last") // xpath for click last name
	private WebElement lastName;

	@FindBy(xpath = "(//kendo-icon[@class='k-i-caret-alt-down k-icon ng-star-inserted'])[2]") // xpath for click role
	private WebElement role;

	@FindBy(xpath = "//*[text()='Editor']") // xpath for click editor
	private WebElement editor;

	@FindBy(xpath = "(//kendo-icon[@class='k-i-caret-alt-down k-icon ng-star-inserted'])[3]") // xpath for click organization
	private WebElement organization;

	@FindBy(xpath = "(//*[text()='gmail.com'])[2]") // xpath for click gmail
	private WebElement gmail;

	@FindBy(xpath = "//*[text()='Save']") // xpath for click save 
	private WebElement save;

	public WebElement getTestRoom() {
		return testRoom;
	}

	public WebElement getProduction() {
		return production;
	}

	public WebElement getUsermagament() {
		return usermagament;
	}

	public WebElement getInvite() {
		return invite;
	}

	public WebElement getRegular() {
		return regular;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getRole() {
		return role;
	}

	public WebElement getEditor() {
		return editor;
	}

	public WebElement getOrganization() {
		return organization;
	}

	public WebElement getGmail() {
		return gmail;
	}

	public WebElement getSave() {
		return save;
	}
}
