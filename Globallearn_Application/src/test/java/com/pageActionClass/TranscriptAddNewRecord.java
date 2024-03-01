package com.pageActionClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gL.helperClass;

public class TranscriptAddNewRecord extends helperClass {

	public TranscriptAddNewRecord() {

		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath = "//*[text()=' Add New Record']")
	private WebElement addNewRecord;
	
	@FindBy(xpath = "//*[@id='fldname']")
	private WebElement enterExternalTrainingName;
	
	@FindBy(xpath = "//*[@id='fldcompany']")
	private WebElement enterSchoolCompanyName;
	
	@FindBy(xpath = "//*[@id='fldcredits']")
	private WebElement enterCredits;
	
	@FindBy(xpath = "//*[@id='trainingarea']")
	private WebElement trainingArea;
	
	@FindBy(xpath = "//*[@id='trainingschedule']")
	private WebElement trainingScheduleDropdown;
	
	@FindBy(xpath = "//*[text()='Mixed']")
	private WebElement mixedOption;
	
	@FindBy(xpath = "//*[text()='Work hours']")
	private WebElement workHoursOption;
	
	@FindBy(xpath = "//*[text()='After work hours']")
	private WebElement afterworkhoursOption;
	
	@FindBy(xpath = "//*[@id='typeoftrainingentity']")
	private WebElement typeoftrainingentity;
	
	@FindBy(xpath = "//*[@id='trainingcoursecode']")
	private WebElement trainingCourSecode;
	
	@FindBy(xpath = "(//*[text()='Cancel'])[7]")
	private WebElement cancelButton;
	
	@FindBy(xpath = "(//*[text()='Next'])")
	private WebElement nextButton;
	
	@FindBy(xpath = "(//*[text()='Previous'])")
	private WebElement previousButton;
	
	@FindBy(xpath = "(//*[@id='searchpotentialusers'])")
	private WebElement searchpotentialusers;
	
	@FindBy(xpath = "(//*[text()='Contact Type'])")
	private WebElement contactTypeDropdown;
	
	@FindBy(xpath = "(//*[text()='Study/Site'])[1]")
	private WebElement studySiteDropdown;
	
	@FindBy(xpath = "(//*[text()='Group'])[1]")
	private WebElement groupDropdown;
	
	@FindBy(xpath = "//*[@id='searchcurrentusers']")
	private WebElement searchCurrentUsers;
	
	@FindBy(xpath = "//*[@id='removeusers']")
	private WebElement removeUsers;
	
	@FindBy(xpath = "(//*[text()='Study/Site'])[3]")
	private WebElement studySitecurrent;
	
	@FindBy(xpath = "(//*[text()='Group'])[3]")
	private WebElement Groupcurrent;
	
	@FindBy(xpath = "//*[@id='cbxall_user']")
	private WebElement cbxall_Usercurrent;
	
	@FindBy(xpath = "//*[@id='cbxall']")
	private WebElement cbxallpotentialusers;
	
	@FindBy(xpath = "//*[@id='addpotentialusers']")
	private WebElement addpotentialusers;
	
	
	
	
	
	
	
	
	
}
