package com.pageActionClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gL.helperClass;

public class Transcript extends helperClass {

	public Transcript() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "(//*[text()='Transcript'])[2]")
	private WebElement transcript;

	@FindBy(xpath = "//*[text()='My Transcript']")
	private WebElement myTranscript;

	@FindBy(xpath = "//*[text()='My Direct Reports']")
	private WebElement myDirectReports;

	@FindBy(xpath = "(//*[text()='External Training'])[13]")
	private WebElement externalTraining;
	
	@FindBy(xpath = "//*[text()=' Add New Record']")
	private WebElement addNewRecord;
	
	@FindBy(xpath = "//*[text()=' Delete']")
	private WebElement delete;
	
	@FindBy(xpath = "//*[text()=' Edit']")
	private WebElement edit;
	
	@FindBy(xpath = "//*[text()=' Export']")
	private WebElement export;
	
	@FindBy(xpath = "//*[text()='User']")
	private WebElement userDropdown;
	
	@FindBy(xpath = "//*[text()='Course Name']")
	private WebElement courseNameDropdown;
	
	@FindBy(xpath = "(//*[text()='Status'])[1]")
	private WebElement statusDropdown;
	
	@FindBy(xpath = "(//*[text()='Evidence'])[1]")
	private WebElement evidenceDropdown;
	
	@FindBy(xpath = "(//*[text()='Evidence Status'])[1]")
	private WebElement evidenceStatusDropdown;
	
	@FindBy(xpath = "//*[@id='searchexternaltraining']")
	private WebElement searchExternalTraining;
	
	@FindBy(xpath = "//*[text()=' Filters ']")
	private WebElement filters;
	
	@FindBy(xpath = "//*[@id='cbxall_current']")
	private WebElement cbxall_current;

	public WebElement getTranscript() {
		return transcript;
	}

	public WebElement getMyTranscript() {
		return myTranscript;
	}

	public WebElement getMyDirectReports() {
		return myDirectReports;
	}

	public WebElement getExternalTraining() {
		return externalTraining;
	}

	public WebElement getAddNewRecord() {
		return addNewRecord;
	}

	public WebElement getDelete() {
		return delete;
	}

	public WebElement getEdit() {
		return edit;
	}

	public WebElement getExport() {
		return export;
	}

	public WebElement getUserDropdown() {
		return userDropdown;
	}

	public WebElement getCourseNameDropdown() {
		return courseNameDropdown;
	}

	public WebElement getStatusDropdown() {
		return statusDropdown;
	}

	public WebElement getEvidenceDropdown() {
		return evidenceDropdown;
	}

	public WebElement getEvidenceStatusDropdown() {
		return evidenceStatusDropdown;
	}

	public WebElement getSearchExternalTraining() {
		return searchExternalTraining;
	}

	public WebElement getFilters() {
		return filters;
	}

	public WebElement getCbxall_current() {
		return cbxall_current;
	}
	
	

}
