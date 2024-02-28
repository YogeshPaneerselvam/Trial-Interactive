package com.pageActionClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gL.helperClass;

public class CreateUser extends helperClass {

	public CreateUser() {

		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath = "//*[@id='id_managertype']")
	private WebElement Role;
	
	@FindBy(xpath = "//*[text()='General']")
	private WebElement general;
	
	@FindBy(xpath = "//*[text()='Learner']")
	private WebElement learner;
	
	@FindBy(xpath = "//*[text()='Instructor']")
	private WebElement instructor;

}
