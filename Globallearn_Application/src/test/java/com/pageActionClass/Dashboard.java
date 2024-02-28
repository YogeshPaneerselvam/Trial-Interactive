package com.pageActionClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gL.helperClass;

public class Dashboard extends helperClass {

	public Dashboard() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "(//*[text()='Dashboard'])[2]")
	private WebElement dashboard;

	@FindBy(xpath = "(//*[text()='My Dashboard'])")
	private WebElement myDashboard;

	@FindBy(xpath = "(//*[text()='KPI Analytics'])[4]")
	private WebElement analytics;

	@FindBy(xpath = "(//*[text()='Course Catalog'])")
	private WebElement courseCatalog;

	@FindBy(xpath = "(//*[text()='Course Management'])[4]")
	private WebElement courseManagement;

	@FindBy(xpath = "//*[text()='Manage Certificates']")
	private WebElement manageCertificates;

	@FindBy(xpath = "//*[text()='Transcript']")
	private WebElement Transcript;

	@FindBy(xpath = "//*[text()='My Transcript']")
	private WebElement myTranscript;

	@FindBy(xpath = "//*[text()='My Direct Reports']")
	private WebElement myDirectReports;

	@FindBy(xpath = "(//*[text()='External Training'])[13]")
	private WebElement externalTraining;

	@FindBy(xpath = "(//*[text()='Company Dashboard'])[2]")
	private WebElement companyDashboard;

	@FindBy(xpath = "(//*[text()='Reports'])")
	private WebElement report;

	@FindBy(xpath = "(//*[text()='Help'])")
	private WebElement help;

	public WebElement getDashboard() {
		return dashboard;
	}

	public WebElement getMyDashboard() {
		return myDashboard;
	}

	public WebElement getAnalytics() {
		return analytics;
	}

	public WebElement getCourseCatalog() {
		return courseCatalog;
	}

	public WebElement getCourseManagement() {
		return courseManagement;
	}

	public WebElement getManageCertificates() {
		return manageCertificates;
	}

	public WebElement getTranscript() {
		return Transcript;
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

	public WebElement getCompanyDashboard() {
		return companyDashboard;
	}

	public WebElement getReport() {
		return report;
	}

	public WebElement getHelp() {
		return help;
	}

}
