package com.pageAction;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class Feature_Production extends BaseClass {

	public Feature_Production() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//*[@class='context-item mark-active ng-star-inserted active'])[1]") // xpath for eTMF
	private WebElement eTMF;

	@FindBy(xpath = "(//*[@class='context-item mark-active ng-star-inserted'])[1]") // xpath for communication
	private WebElement communication;

	@FindBy(xpath = "(//*[@class='context-item mark-active ng-star-inserted'])[2]") // xpath for CRA Reconciliation
	private WebElement CRAReconciliation;
	
	@FindBy(xpath = "//*[text()='OK']") // xpath for warning ok
	private WebElement warning;

	@FindBy(xpath = "(//*[@class='context-item mark-active ng-star-inserted'])[3]") // xpath for qualityReview
	private WebElement qualityReview;

	@FindBy(xpath = "(//*[@class='context-item mark-active ng-star-inserted'])[4]") // xpath for tasks
	private WebElement tasks;

	@FindBy(xpath = "(//*[@class='context-item mark-active ng-star-inserted'])[5]") // xpath for reports
	private WebElement reports;

	@FindBy(xpath = "(//*[@class='context-item mark-active ng-star-inserted'])[6]") // xpath for usersManagement
	private WebElement usersManagement;

	@FindBy(xpath = "(//*[@class='context-item mark-active ng-star-inserted'])[7]") // xpath for Q&A
	private WebElement qA;

	@FindBy(xpath = "(//*[@class='context-item mark-active ng-star-inserted'])[8]") // xpath for FAQ
	private WebElement faq;

	@FindBy(xpath = "(//*[@class='context-item mark-active ng-star-inserted'])[9]") // xpath for queries
	private WebElement queries;

	@FindBy(xpath = "(//*[@class='context-item mark-active ng-star-inserted'])[10]") // xpath for eventManager
	private WebElement eventManager;

	@FindBy(xpath = "(//*[@class='context-item mark-active ng-star-inserted'])[11]") // xpath for setting
	private WebElement setting;
	
	@FindBy(xpath = "//*[@class='context-item ng-star-inserted active']") // xpath for home
	private WebElement home;
	
	@FindBy(xpath = "//*[text()='Yogesh P']") // xpath for user profile
	private WebElement userP;
	
	@FindBy(xpath = "//*[text()='Sign out']") // xpath for sign out
	private WebElement signOut;

	public WebElement geteTMF() {
		return eTMF;
	}

	public WebElement getCommunication() {
		return communication;
	}

	public WebElement getCRAReconciliation() {
		return CRAReconciliation;
	}

	public WebElement getQualityReview() {
		return qualityReview;
	}

	public WebElement getTasks() {
		return tasks;
	}

	public WebElement getReports() {
		return reports;
	}

	public WebElement getUsersManagement() {
		return usersManagement;
	}

	public WebElement getqA() {
		return qA;
	}

	public WebElement getFaq() {
		return faq;
	}

	public WebElement getQueries() {
		return queries;
	}

	public WebElement getEventManager() {
		return eventManager;
	}

	public WebElement getSetting() {
		return setting;
	}

	public WebElement getHome() {
		return home;
	}

	public WebElement getWarning() {
		return warning;
	}

	public WebElement getUserP() {
		return userP;
	}

	public WebElement getSignOut() {
		return signOut;
	}
	

}
