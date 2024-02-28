package com.pageActionClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gL.helperClass;

public class CompanyDashboard extends helperClass {

	public CompanyDashboard() {

		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath = "(//*[text()='Company Dashboard'])[3]")
	private WebElement companyDashboard;
	
	@FindBy(xpath = "//*[text()='Edit Company']")
	private WebElement editCompany;
	
	@FindBy(xpath = "//*[text()='Manage Announcements']")
	private WebElement manageAnnouncements;
	
	@FindBy(xpath = "//*[text()='Email Templates']")
	private WebElement emailTemplates;
	
	@FindBy(xpath = "//*[text()='Add Profile Fields']")
	private WebElement addProfileFields;
	
	@FindBy(xpath = "//*[text()='Audit Trail']")
	private WebElement auditTrail;
	
	@FindBy(xpath = "//*[text()='Manage Sites']")
	private WebElement manageSites;
	
	@FindBy(xpath = "//*[text()='Manage Contact Types']")
	private WebElement manageContactTypes;
	
	@FindBy(xpath = "//*[text()='Content Library']")
	private WebElement contentLibrary;
	
	@FindBy(xpath = "//*[text()='Catalog Management']")
	private WebElement catalogManagement;
	
	@FindBy(xpath = "//*[text()='Manage Certificates']")
	private WebElement manageCertificates;
	
	@FindBy(xpath = "//*[text()='Content Library Tags Management']")
	private WebElement contentLibraryTagsManagement ;
	
	@FindBy(xpath = "(//*[text()='Course Management'])[2]")
	private WebElement courseManagement;
	
	@FindBy(xpath = "//*[text()='Manage Learning Plans']")
	private WebElement manageLearningPlans ;
	
	@FindBy(xpath = "//*[text()='Manage Training Groups']")
	private WebElement manageTrainingGroups ;
	
	@FindBy(xpath = "//*[text()='Add Course Fields']")
	private WebElement addCourseFields ;
	
	@FindBy(xpath = "//*[text()='Create User']")
	private WebElement createUser ;
	
	@FindBy(xpath = "//*[text()='List/Edit Users']")
	private WebElement listEditUsers ;
	
	@FindBy(xpath = "//*[text()='Upload Users']")
	private WebElement uploadUsers ;
	
	@FindBy(xpath = "(//*[text()='Reports'])[2]")
	private WebElement reports;
	
	@FindBy(xpath = "//*[text()='SQL Reports']")
	private WebElement sQLReports;
	
	@FindBy(xpath = "//*[text()='eSignature']")
	private WebElement eSignature;
	
	@FindBy(xpath = "//*[text()='Classroom Training']")
	private WebElement classroomTraining;
	
	@FindBy(xpath = "//*[text()='Certificate']")
	private WebElement Certificate;
	
	@FindBy(xpath = "//*[text()='Owner Permissions']")
	private WebElement OwnerPermissions;
	
	@FindBy(xpath = "//*[text()='Read & Acknowledge']")
	private WebElement readAcknowledge;
	
	@FindBy(xpath = "//*[text()='Manage Welcome Message']")
	private WebElement manageWelcomeMessage;
	
	@FindBy(xpath = "(//*[text()='Settings'])[2]")
	private WebElement Settings;

	public WebElement getCompanyDashboard() {
		return companyDashboard;
	}

	public WebElement getEditCompany() {
		return editCompany;
	}

	public WebElement getManageAnnouncements() {
		return manageAnnouncements;
	}

	public WebElement getEmailTemplates() {
		return emailTemplates;
	}

	public WebElement getAddProfileFields() {
		return addProfileFields;
	}

	public WebElement getAuditTrail() {
		return auditTrail;
	}

	public WebElement getManageSites() {
		return manageSites;
	}

	public WebElement getManageContactTypes() {
		return manageContactTypes;
	}

	public WebElement getContentLibrary() {
		return contentLibrary;
	}

	public WebElement getCatalogManagement() {
		return catalogManagement;
	}

	public WebElement getManageCertificates() {
		return manageCertificates;
	}

	public WebElement getContentLibraryTagsManagement() {
		return contentLibraryTagsManagement;
	}

	public WebElement getCourseManagement() {
		return courseManagement;
	}

	public WebElement getManageLearningPlans() {
		return manageLearningPlans;
	}

	public WebElement getManageTrainingGroups() {
		return manageTrainingGroups;
	}

	public WebElement getAddCourseFields() {
		return addCourseFields;
	}

	public WebElement getCreateUser() {
		return createUser;
	}

	public WebElement getListEditUsers() {
		return listEditUsers;
	}

	public WebElement getUploadUsers() {
		return uploadUsers;
	}

	public WebElement getReports() {
		return reports;
	}

	public WebElement getsQLReports() {
		return sQLReports;
	}

	public WebElement geteSignature() {
		return eSignature;
	}

	public WebElement getClassroomTraining() {
		return classroomTraining;
	}

	public WebElement getCertificate() {
		return Certificate;
	}

	public WebElement getOwnerPermissions() {
		return OwnerPermissions;
	}

	public WebElement getReadAcknowledge() {
		return readAcknowledge;
	}

	public WebElement getManageWelcomeMessage() {
		return manageWelcomeMessage;
	}

	public WebElement getSettings() {
		return Settings;
	}
	
}
